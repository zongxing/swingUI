package com.mashensoft.ui;

import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class JCheckBoxDemo extends JFrame {
	public JCheckBoxDemo() {
		this.setTitle("��һ������");
		this.setBounds(500, 300, 500, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		JCheckBox cb = new JCheckBox("��Ӿ");
		cb.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println(cb.isSelected()?"ѡ��":"��ѡ��");
			}
		});
		this.add(cb,BorderLayout.NORTH);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		JCheckBoxDemo jd = new JCheckBoxDemo();
	}
}
