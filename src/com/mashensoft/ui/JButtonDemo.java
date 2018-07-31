package com.mashensoft.ui;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JButtonDemo extends JFrame {
	public JButtonDemo() {
		this.setTitle("第一个窗口");
		this.setVisible(true);
		this.setBounds(500, 300, 500, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		for (int i = 0; i < 5; i++) {
			
			JButton button = new JButton(String.valueOf(i));
			button.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					System.out.println(((JButton)e.getSource()).getText());
				}
			});
			switch (i) {
			case 0:
				this.add(button, BorderLayout.NORTH);
				break;
			case 1:
				this.add(button, BorderLayout.CENTER);
				break;
			case 2:
				this.add(button, BorderLayout.SOUTH);
				break;
			case 3:
				this.add(button, BorderLayout.EAST);
				break;
			case 4:
				this.add(button, BorderLayout.WEST);
				break;

			default:
				break;
			}
		}

	}

	public static void main(String[] args) {
		JButtonDemo jd = new JButtonDemo();
	}
}
