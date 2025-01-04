package editor;

import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.nio.file.WatchEvent.Kind;

import javax.swing.JTree;
import javax.swing.Timer;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

public class FileExplorer extends JTree {
	private static final long serialVersionUID = 1L;
	private Workspace workspace;
	
	public Path folderPath;
	private WatchService folderWatch;
	private Timer updateTimer;

	public FileExplorer(Workspace workspace, Path folderPath) throws IOException {
		this.workspace = workspace;
		this.folderPath = folderPath;
		FileSystem fs = folderPath.getFileSystem();
		folderWatch = fs.newWatchService();
		folderPath.register(folderWatch, //
				StandardWatchEventKinds.ENTRY_CREATE, //
				StandardWatchEventKinds.ENTRY_DELETE, //
				StandardWatchEventKinds.ENTRY_MODIFY, //
				StandardWatchEventKinds.OVERFLOW);
		setPath(folderPath);

		updateTimer = new Timer(1000, ae -> updateFolderWatch());
		updateTimer.setRepeats(true);
		updateTimer.start();
	}

	public void setPath(Path path) {
		DefaultMutableTreeNode root = new DefaultMutableTreeNode(path.getFileName());
		walk(path, root);
		this.setModel(new DefaultTreeModel(root));
		this.setEditable(false);
		this.revalidate();
	}

	private void updateFolderWatch() {
		WatchKey key = folderWatch.poll();
		if (key == null) {
			return;
		}

		boolean treeChanged = false;
		for (WatchEvent<?> watchEvent : key.pollEvents()) {
			Kind<?> kind = watchEvent.kind();
			treeChanged |= kind == StandardWatchEventKinds.OVERFLOW;
			treeChanged |= kind == StandardWatchEventKinds.ENTRY_CREATE;
			treeChanged |= kind == StandardWatchEventKinds.ENTRY_DELETE;
		}

		if (treeChanged) {
			setPath(folderPath);
		}

		if (!key.reset()) {
			throw new IllegalStateException("Watch key on workspace is invalid");
		}

	}

	private void walk(Path path, DefaultMutableTreeNode node) {
		if (!Files.isDirectory(path)) {
			return;
		}

		try {
			Files.list(path).forEach(n -> {
				DefaultMutableTreeNode child = new DefaultMutableTreeNode(n.getFileName());
				walk(n, child);
				node.add(child);
			});

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void close() throws IOException {
		folderWatch.close();
		updateTimer.stop();
	}
}
