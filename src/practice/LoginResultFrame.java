package practice;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class LoginResultFrame extends JFrame {
	public LoginResultFrame(String name, String major) {
		setTitle("전공 선택 결과");
		setSize(400, 100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JLabel lab = new JLabel(name + "님은 " + major + " 전공입니다.", JLabel.CENTER);
		lab.setFont(new Font("궁서체", Font.BOLD, 20));
		lab.setForeground(Color.red);
		
		Container cPane = getContentPane();
		cPane.setLayout(new FlowLayout());
		cPane.add(lab);
		//pack();
	}
}
