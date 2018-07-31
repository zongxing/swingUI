package com.mashensoft.ui;

import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JColorChooser;
import javax.swing.JFrame;

public class JColorChooserDemo extends JFrame {
	public JColorChooserDemo() {
		this.setTitle("第一个窗口");
		this.setBounds(500, 300, 500, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JColorChooser jc = new JColorChooser();
		jc.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println(jc.getColor().toString());
			}
		});
		this.add(jc,BorderLayout.CENTER);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		JColorChooserDemo jd = new JColorChooserDemo();
	}
}
