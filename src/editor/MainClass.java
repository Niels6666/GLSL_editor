package editor;

import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.FileDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JSplitPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.filechooser.FileNameExtensionFilter;

import language.GLSLSpecification;

public class MainClass {
	private static Workspace workspace;
	private static JFrame frame;

	public static void main(String[] args) throws IOException {
//		try {
//			GLSLSpecification.makeBuiltins();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}

		setWindowsLAF(); // windows look and feel

		frame = new JFrame("glsl editor");
		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frame.setMinimumSize(new Dimension(640, 350));
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);

		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				exit();
			}
		});

		setupMenuBar();

		setupWorkspace();
		setupWindow();
	}

	private static void setWindowsLAF() {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
	}

	private static void createNewFile(int template) {
		{
			FileDialog chooser = new FileDialog(frame);
			chooser.setTitle("New file");
			chooser.setMode(FileDialog.SAVE);
			chooser.setVisible(true);
			chooser.setMultipleMode(false);
			System.out.println(chooser.getFile());
		}

		JFileChooser chooser = new JFileChooser("New file");
		chooser.setCurrentDirectory(workspace.fileExplorer.folderPath.toFile());
		chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
		chooser.setFileFilter(new FileNameExtensionFilter("glsl files", "glsl"));
		chooser.setMultiSelectionEnabled(false);
		if (chooser.showSaveDialog(null) != JFileChooser.APPROVE_OPTION) {
			return;
		}

		String pathToFile = chooser.getSelectedFile().getAbsolutePath();
		if (!pathToFile.endsWith(".glsl")) {
			pathToFile += ".glsl";
		}
		try {
			FileWriter writer = new FileWriter(new File(pathToFile));
			writer.write(GLSLSpecification.templates.get(template));
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		workspace.openFile(pathToFile);
	}

	private static void openFile() {

	}

	private static void saveFileAs() {

	}

	private static void switchWorkspace() {

	}

	private static void setupMenuBar() {
		JMenuBar menuBar = new JMenuBar();

		JMenu fileMenu = new JMenu("File");
		JMenu newFile = new JMenu("New");
		JMenuItem newCommon = new JMenuItem("Common shader");
		JMenuItem newCompute = new JMenuItem("Compute shader");
		JMenuItem newVertex = new JMenuItem("Vertex shader");
		JMenuItem newTessControl = new JMenuItem("Tesselation control shader");
		JMenuItem newTessEval = new JMenuItem("Tesselation evaluation shader");
		JMenuItem newGeometry = new JMenuItem("Geometry shader");
		JMenuItem newFragment = new JMenuItem("Fragment shader");

		newCommon.addActionListener(ae -> createNewFile(0));
		newCompute.addActionListener(ae -> createNewFile(1));
		newVertex.addActionListener(ae -> createNewFile(2));
		newTessControl.addActionListener(ae -> createNewFile(3));
		newTessEval.addActionListener(ae -> createNewFile(4));
		newGeometry.addActionListener(ae -> createNewFile(5));
		newFragment.addActionListener(ae -> createNewFile(6));

		JMenuItem openFile = new JMenuItem("Open file...");
		openFile.addActionListener(ae -> openFile());

		JMenuItem saveFile = new JMenuItem("Save");
		saveFile.addActionListener(ae -> workspace.saveFile());

		JMenuItem saveAs = new JMenuItem("Save as");
		saveAs.addActionListener(ae -> saveFileAs());

		JMenuItem saveAll = new JMenuItem("Save all");
		saveAll.addActionListener(ae -> workspace.saveAllFiles());

		JMenuItem switchWS = new JMenuItem("Switch workspace");
		saveAll.addActionListener(ae -> switchWorkspace());

		JMenuItem exit = new JMenuItem("Exit");
		exit.addActionListener(ae -> exit());

		newFile.add(newCommon);
		newFile.add(newCompute);
		newFile.add(newVertex);
		newFile.add(newTessControl);
		newFile.add(newTessEval);
		newFile.add(newGeometry);
		newFile.add(newFragment);

		fileMenu.add(newFile);
		fileMenu.add(openFile);
		fileMenu.add(saveFile);
		fileMenu.add(switchWS);
		fileMenu.add(exit);

		JMenu editMenu = new JMenu("Edit");

		menuBar.add(fileMenu);
		menuBar.add(editMenu);
		frame.setJMenuBar(menuBar);

	}

	private static void setupWorkspace() throws IOException {
		File fileConfig = new File("res/glsl_editor.ini");
		if (!fileConfig.exists()) {
			fileConfig.createNewFile();
		}
		List<String> config = Files.readAllLines(fileConfig.toPath());
		workspace = new Workspace(config);
	}

	private static void setupWindow() {
		if (workspace.fileExplorer != null) {
			JSplitPane splitPane = new JSplitPane();
			splitPane.setContinuousLayout(true);
			splitPane.setOrientation(JSplitPane.HORIZONTAL_SPLIT);
			splitPane.setLeftComponent(workspace.fileExplorer);
			splitPane.setRightComponent(workspace.myTabbedPane);
			splitPane.setResizeWeight(0.2);

			frame.setContentPane(splitPane);
		} else {
			frame.setContentPane(workspace.myTabbedPane);
		}
		frame.revalidate();
	}

	private static void exit() {
		try {
			workspace.close();
		} catch (IOException e1) {
			e1.printStackTrace();
		} finally {
			frame.dispose();
		}
	}
}
