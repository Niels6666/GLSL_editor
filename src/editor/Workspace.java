package editor;

import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.Path;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.WatchEvent.Kind;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.util.List;

public final class Workspace {
	private static Path folderPath;
	private static WatchService folderWatch;
	private static List<WorkspaceListener> listeners;

	public static void setWorkspaceLocation(Path newFolderPath) throws IOException {
		if (folderPath != null) {
			folderWatch.close();
		}
		folderPath = newFolderPath;
		FileSystem fs = newFolderPath.getFileSystem();
		folderWatch = fs.newWatchService();
		
		for (WorkspaceListener l : listeners) {
			l.workspaceLocationChanded(newFolderPath);
		}
	}
	
	public static Path getWorkspaceLocation() {
		return folderPath;
	}
	
	public void addWorkspaceListener(WorkspaceListener listener) {
		listeners.add(listener);
	}
	
	public void removeWorkspaceListener(WorkspaceListener listener) {
		listeners.remove(listener);
	}

	public static void updateFolderWatch() {
		WatchKey key = folderWatch.poll();
		if (key == null) {
			return;
		}

		for (WatchEvent<?> watchEvent : key.pollEvents()) {
			Kind<?> kind = watchEvent.kind();
			if (kind == StandardWatchEventKinds.OVERFLOW) {
				for (WorkspaceListener l : listeners) {
					l.watchOverflow();
				}
			}

			@SuppressWarnings("unchecked")
			Path path = ((WatchEvent<Path>) watchEvent).context();
			if (kind == StandardWatchEventKinds.ENTRY_CREATE) {
				for (WorkspaceListener l : listeners) {
					l.entryCreated(path);
				}
			}

			if (kind == StandardWatchEventKinds.ENTRY_DELETE) {
				for (WorkspaceListener l : listeners) {
					l.entryDeleted(path);
				}
			}

			if (kind == StandardWatchEventKinds.ENTRY_MODIFY) {
				for (WorkspaceListener l : listeners) {
					l.entryModified(path);
				}
			}
		}

		if (!key.reset()) {
			throw new IllegalStateException("Watch key on workspace is invalid");
		}

	}

	public static interface WorkspaceListener {
		public void workspaceLocationChanded(Path path);
		
		public void watchOverflow();

		public void entryCreated(Path path);

		public void entryDeleted(Path path);

		public void entryModified(Path path);
	}
}
