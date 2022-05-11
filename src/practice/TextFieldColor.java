package practice;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TextFieldColor extends JFrame {
	private JTextField inputred, inputgreen, inputblue;
	private JButton btn;
	
	public TextFieldColor() {
		setSize(350, 320);
		setTitle("TextField Color Example");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JLabel labelred = new JLabel("red");
		inputred = new JTextField("0", 3);
		JLabel labelgreen = new JLabel("green");
		inputgreen = new JTextField("0", 3);
		JLabel labelblue = new JLabel("blue");
		inputblue = new JTextField("0", 3);
		btn = new JButton("확인");
		
		
		CheckBoxListener listener = new CheckBoxListener();
	//	red.addItemListener(listener);
	//	green.addItemListener(listener);
	//	blue.addItemListener(listener);
		
		JPanel panel = new JPanel();
		panel.add(labelred);
		panel.add(inputred);
		panel.add(labelgreen);
		panel.add(inputgreen);
		panel.add(labelblue);
		panel.add(inputblue);
		panel.add(btn);
		
		Container cPane = getContentPane();
		cPane.setLayout(new BorderLayout());
		cPane.add(panel);
		//cPane.add(message, "South");
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.setColor(new Color(inputred*255, inputgreen*255, inputblue*255));
		g.fillOval(50, 80, 200, 200);
	}
	
	private class CheckBoxListener implements ItemListener {
		@Override
		public void itemStateChanged(ItemEvent e) {
			int a = inputred.getText()
			repaint();
		}
	}
	
	public static void main(String[] args) {
		(new TextFieldColor()).setVisible(true);
	}
}