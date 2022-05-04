package practice;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonExample extends JFrame {
	private JButton btn;
	
	public class ButtonListener implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == btn) {
				(getContentPane()).setBackground(Color.black);
				btn.setText("��ư�� ���Ƚ��ϴ�");
			}
		}
	}
	
	public ButtonExample() {
		setSize(300, 200);
		setTitle("��ư �ؽ�Ʈ ����");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container cPane = getContentPane();
		cPane.setBackground(Color.WHITE);
		cPane.setLayout(new FlowLayout());
		btn = new JButton("��ư�� �����ÿ�");
		
		ButtonListener listener = new ButtonListener();
		btn.addActionListener(listener);
		cPane.add(btn);
	}
	public static void main(String[] args) {
		(new ButtonExample()).setVisible(true);
	}
}
