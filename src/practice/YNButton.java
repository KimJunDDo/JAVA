package practice;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class YNButton extends JFrame {
	public YNButton() {
		setSize(450, 150);
		setTitle("Yes/No Button Example");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container contentPane = getContentPane();
		contentPane.setBackground(Color.GREEN);
		contentPane.setLayout(new FlowLayout());
		JButton button1 = new JButton("Yes");
		JButton button2 = new JButton("No");
		contentPane.add(button1);
		contentPane.add(button2);
		
		JLabel label = new JLabel("정보를 보내시겠습니까?");
		contentPane.add(label);
		label.setForeground(Color.BLUE);
		label.setFont(new Font("Times", Font.BOLD, 30));	
	}
	
	public static void main(String[] args) {
		(new YNButton()).setVisible(true);
	}
}
