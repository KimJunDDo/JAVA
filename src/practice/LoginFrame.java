package practice;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class LoginFrame extends JFrame {
	private JButton GoBtn;
	private JLabel lab;
	private JLabel name;
	private TextField Textname;
	private JLabel major;
	private JRadioButton sw;
	private JRadioButton vr;
	
	public LoginFrame() {
		setTitle("전공 선택");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new GridLayout(0, 1));
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		LoginListener listener = new LoginListener();
		
		lab = new JLabel("이름과 전공을 선택하시오.", JLabel.CENTER);
		lab.setFont(new Font("궁서체", Font.BOLD, 17));
		lab.setForeground(Color.blue);
		name = new JLabel("이름", JLabel.LEFT);
		Textname = new TextField(20);
		
		major = new JLabel("전공: ", JLabel.LEFT);
		sw = new JRadioButton("소프트웨어");
		vr = new JRadioButton("가상현실");
		ButtonGroup group = new ButtonGroup();
		group.add(sw);
		group.add(vr);
		
		GoBtn = new JButton("Go");
		
		GoBtn.addActionListener(listener);
		sw.addActionListener(listener);
		vr.addActionListener(listener);
		
		panel1.add(name);
		panel1.add(Textname);
		panel2.add(major);
		panel2.add(sw);
		panel2.add(vr);
		panel3.add(new JLabel());
		panel3.add(GoBtn);
		panel3.add(new JLabel());
		
		Container cPane = getContentPane();
		cPane.add(lab);
		cPane.add(panel1);
		cPane.add(panel2);
		cPane.add(panel3);
		pack();
	}
	
	public class LoginListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == GoBtn) {
				String name = Textname.getText();
				String major;
				if(sw.isSelected())
					major = "소프트웨어";
				else
					major = "가상현실";
				(new LoginResultFrame(name, major)).setVisible(true);
				dispose();
			}
		}
	}
	
	public static void main(String[] args) {
		(new LoginFrame()).setVisible(true);
	}
}
