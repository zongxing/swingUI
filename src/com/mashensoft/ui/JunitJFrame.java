package com.mashensoft.ui;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;

import org.junit.jupiter.api.Test;

class JunitJFrame {
	
	@Test
	void test() {
		JFrame frame = new JFrame("��һ������");
		frame.setVisible(true);
		frame.setBounds(500, 300, 500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		try {
			Thread.currentThread().sleep(1000000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test
	void test1() {
		JFrame frame = new JFrame("��һ������");
		JCheckBox cb1 = new JCheckBox("��Ӿ");
		cb1.setText("��Ӿ");
		cb1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("���ѡ��");
				
			}
		});
		frame.add(cb1,BorderLayout.NORTH);
		frame.setVisible(true);
		frame.setBounds(500, 300, 500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		try {
			Thread.currentThread().sleep(1000000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
