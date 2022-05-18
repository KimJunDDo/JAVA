package practice;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.TextListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TextFieldColor extends JFrame {
	private JTextField inputred, inputgreen, inputblue;
	private JButton btn;
	private int intred, intgreen,intblue;
	
	public TextFieldColor() {
		setSize(350, 300);
		setTitle("TextField Color Example");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JLabel labelred = new JLabel("red");
		inputred = new JTextField("0", 3);
		JLabel labelgreen = new JLabel("green");
		inputgreen = new JTextField("0", 3);
		JLabel labelblue = new JLabel("blue");
		inputblue = new JTextField("0", 3);
		btn = new JButton("확인");
		btn.addActionListener(new ButtonListener());
		
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
	}
	
	private class ButtonListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			String a = inputred.getText();
			intred = Integer.parseInt(a);
			String b = inputgreen.getText();
			intgreen = Integer.parseInt(b);
			String c = inputblue.getText();
			intblue = Integer.parseInt(c);
			repaint();
		}
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.setColor(new Color(intred, intgreen, intblue));
		g.fillOval(70, 80, 200, 200);
	}
	
	public static void main(String[] args) {
		(new TextFieldColor()).setVisible(true);
	}
}