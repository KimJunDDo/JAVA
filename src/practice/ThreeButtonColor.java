package practice;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class ThreeButtonColor extends JFrame {
	private JRadioButton red;
	private JRadioButton green;
	private JRadioButton blue;
	private JLabel lb;
	
	public class RadioListener implements ItemListener {
		@Override
		public void itemStateChanged(ItemEvent e) {
			if (e.getItem() == red) {
				(getContentPane()).setBackground(Color.red);
				red.setBackground(Color.red);
				green.setBackground(Color.red);
				blue.setBackground(Color.red);
				lb.setText("Red이(가) 선택되었습니다.");
			}
			else if (e.getItem() == green) {
				(getContentPane()).setBackground(Color.green);
				red.setBackground(Color.green);
				green.setBackground(Color.green);
				blue.setBackground(Color.green);
				lb.setText("Green이(가) 선택되었습니다.");
			}
			else if (e.getItem() == blue) {
				(getContentPane()).setBackground(Color.blue);
				red.setBackground(Color.blue);
				green.setBackground(Color.blue);
				blue.setBackground(Color.blue);
				lb.setText("Blue이(가) 선택되었습니다.");
			}
		}
	}
	
	public ThreeButtonColor() {
		setSize(300, 150);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container cPane = getContentPane();
		getContentPane().setBackground(Color.gray);
		cPane.setLayout(new FlowLayout());
		
		red = new JRadioButton("Red");
		green = new JRadioButton("Green");
		blue = new JRadioButton("Blue");
		ButtonGroup gr = new ButtonGroup();
		gr.add(red);
		gr.add(green);
		gr.add(blue);
		
		lb = new JLabel("색상이 선택되지 않았습니다.");
		lb.setFont(new Font("궁서체", Font.BOLD, 18));
		RadioListener listener = new RadioListener();
		red.addItemListener(listener);
		green.addItemListener(listener);
		blue.addItemListener(listener);
		
		cPane.add(red);
		cPane.add(green);
		cPane.add(blue);
		cPane.add(lb);
	}
	
	public static void main(String[] args) {
		(new ThreeButtonColor()).setVisible(true);
	}
}
