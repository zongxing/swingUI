package com.mashensoft.ui;

import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class JCheckBoxDemo extends JFrame {
	public JCheckBoxDemo() {
		this.setTitle("第一个窗口");
		this.setBounds(500, 300, 500, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		JCheckBox cb = new JCheckBox("游泳");
		cb.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println(cb.isSelected()?"选中":"不选中");
			}
		});
		this.add(cb,BorderLayout.NORTH);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		JCheckBoxDemo jd = new JCheckBoxDemo();
	}
}
