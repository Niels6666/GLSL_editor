package info;

import java.nio.file.WatchService;

public class FileInfo {
	public final String pathToFile;
	
	private String content;
	private WatchService folderWatch;
	
	public FileInfo(String pathToFile) {
		this.pathToFile = pathToFile;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
}
