package com.mashensoft.ui;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class JLableDemo extends JFrame {
	public JLableDemo() {
		this.setTitle("��һ������");
		this.setBounds(500, 300, 500, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel label = new JLabel("�û���");
		this.add(label,BorderLayout.NORTH);
		JTextField field = new JTextField("������",130);
		this.add(field,BorderLayout.SOUTH);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		JLableDemo jd = new JLableDemo();
	}
}
