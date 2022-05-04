package practice;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ChangeColor extends JFrame {
	public ChangeColor() {
		setSize(380, 250);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container cPane = getContentPane();
		cPane.setLayout(new FlowLayout());
		JButton button = new JButton("빨강색으로");
		button.addActionListener(new BtnListener());
		cPane.add(button);
	}
	public static void main(String[] args) {
		(new ChangeColor()).setVisible(true);
	}
}
