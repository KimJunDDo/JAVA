package practice;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class HopeField extends JFrame {
	private JTextField name;
	private JRadioButton sfw;
	private JRadioButton vr;
	private JButton btngo;
	
	public HopeField() {
		setTitle("전공 선택");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(0, 4));
		//GoListener listener = new GoListener();
		
		JLabel labeltitle = new JLabel("이름과 전공을 선택하시오.");
		JLabel labelname = new JLabel("이름");
		JLabel labelfield = new JLabel("전공:");
		name = new JTextField(10);
		
		sfw = new JRadioButton("소프트웨어", true);
		vr = new JRadioButton("가상현실");
		ButtonGroup group = new ButtonGroup();
		group.add(sfw);
		group.add(vr);
		btngo.addActionListener(listener);
		
		panel.add(labeltitle);
		panel.add(labelname);
		panel.add(labelfield);
		panel.add(name);
		panel.add(sfw);
		panel.add(vr);
		panel.add(btngo);
		add(panel);
		pack();
	}
	
	public class GoListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == btngo) {
				String name2 = name.getText();
			}
		}
	} 
	public static void main(String[] args) {
		(new HopeField()).setVisible(true);
	}
}
