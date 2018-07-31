package com.mashensoft.ui;
import javax.swing.JFrame;
public class FrameDemo2 {
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("第一个窗口");
		frame.setVisible(true);
		frame.setBounds(500, 300, 500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
