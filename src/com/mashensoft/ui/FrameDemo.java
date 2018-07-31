package com.mashensoft.ui;
import javax.swing.JFrame;
public class FrameDemo extends JFrame{
	public FrameDemo() {
		this.setTitle("第一个窗口");
		this.setVisible(true);
		this.setBounds(500, 300, 500, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		FrameDemo fd = new FrameDemo();
	}
}
