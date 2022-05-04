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
				(getContentPane()).setBackground(Color.darkGray);
				btn.setText("버튼이 눌렸습니다");
			}
		}
	}
	
	public ButtonExample() {
		setSize(300, 200);
		setTitle("버튼 텍스트 예제");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container cPane = getContentPane();
		cPane.setBackground(Color.WHITE);
		cPane.setLayout(new FlowLayout());
		btn = new JButton("버튼을 누르시오");
		
		ButtonListener listener = new ButtonListener();
		btn.addActionListener(listener);
		cPane.add(btn);
	}
	public static void main(String[] args) {
		(new ButtonExample()).setVisible(true);
	}
}
