package practice;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class ButtonColorFrame extends JFrame {
	private JRadioButton yellow;
	private JRadioButton green;
	
	public class ButtonListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			if (yellow.isSelected())
				(getContentPane()).setBackground(Color.yellow);
			if (green.isSelected())
				(getContentPane()).setBackground(Color.green);
		}
	}
	
	public ButtonColorFrame() {
		setSize(300, 150);
		setTitle("Button Color Example");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container cPane = getContentPane();
		cPane.setLayout(new FlowLayout());
		
		yellow = new JRadioButton("노란색");;
		green = new JRadioButton("초록색");;
		ButtonGroup colorGroup = new ButtonGroup();
		colorGroup.add(yellow);
		colorGroup.add(green);
		
		JButton button = new JButton("변경");
		ButtonListener listener = new ButtonListener();
		button.addActionListener((listener));
		
		cPane.add(yellow);
		cPane.add(green);
		cPane.add(button);
	}
	public static void main(String[] args) {
		(new ButtonColorFrame()).setVisible(true);
	}

}
