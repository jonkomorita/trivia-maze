package ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JToolBar;
import java.awt.BorderLayout;

public class TriviaMaze {

	private static JFrame frame;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TriviaMaze window = new TriviaMaze();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public TriviaMaze() {
		initialize();
	}

	private void initialize() {
		frame = new MainMenuPanel();
		frame.setTitle("Trivia Maze");
		frame.setBounds(100, 100, 600, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void setFrameToMainMenu() {
		frame = new MainMenuPanel();
	}
}