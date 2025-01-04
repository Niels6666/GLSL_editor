package editor;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.SwingUtilities;

import info.FileInfo;

public class Workspace {
	public final FileExplorer fileExplorer;
	public final MyTabbedPane myTabbedPane;

	private final ArrayList<FileInfo> inMemory = new ArrayList<>();

	public Workspace(List<String> config) throws IOException {
		String folderPath = "";
		if (config.size() > 0) {
			folderPath = config.get(0);
		}

		if (!folderPath.isBlank()) {
			fileExplorer = new FileExplorer(this, new File(folderPath).toPath());
		} else {
			fileExplorer = null;
		}

		myTabbedPane = new MyTabbedPane(this);

		String[] openEditors;
		if (config.size() < 2) {
			openEditors = new String[] {};
		} else {
			openEditors = config.subList(1, config.size()).toArray(String[]::new);
		}

		for (String pathToFile : openEditors) {
			openFile(pathToFile);
		}
	}

	private void save(String pathToFile) {
		try {
			File file = new File(pathToFile);
			FileWriter writer = new FileWriter(file);
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void openFile(String pathToFile) {
		try {
			myTabbedPane.openTab(pathToFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void saveFile() {
		String pathToFile = myTabbedPane.getCurrentTab();
		if (pathToFile == null) {
			return;
		}
		save(pathToFile);
	}

	public void saveAllFiles() {
		for (String s : myTabbedPane.getOpenTabs()) {
			save(s);
		}
	}

	public void close() throws IOException {
		// write state to config file
		File fileConfig = new File("res/glsl_editor.ini");
		FileWriter writer = new FileWriter(fileConfig);
		writer.write(fileExplorer.folderPath.toAbsolutePath().toString());
		writer.write(System.lineSeparator());
		for (String s : myTabbedPane.getOpenTabs()) {
			writer.write(s);
			writer.write(System.lineSeparator());
		}
		writer.close();

		if (fileExplorer != null) {
			fileExplorer.close();
		}
		myTabbedPane.close();
	}
}
