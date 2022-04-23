package practice;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class LoginWindow extends JFrame {
	public LoginWindow() {
		setSize(220, 160);
		setTitle("Login Window");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container cPane = getContentPane();
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(4, 2, 10, 0));
		panel.add(new JLabel("아이디", JLabel.RIGHT));
		panel.add(new JTextField());
		panel.add(new JLabel("비밀번호", JLabel.RIGHT));
		panel.add(new JTextField());
		panel.add(new JPanel());
		panel.add(new JCheckBox("아이디 저장", true));
		panel.add(new JButton("로그인"));
		panel.add(new JButton("취소"));
		
		cPane.add(panel);
	}
	public static void main(String[] args) {
		(new LoginWindow()).setVisible(true);
	}
}
