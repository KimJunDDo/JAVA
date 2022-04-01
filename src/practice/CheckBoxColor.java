package practice;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class CheckBoxColor extends JFrame {
	private JCheckBox red, green, blue;
	
	public CheckBoxColor() {
		setSize(300, 350);
		setTitle("Checkbox Color Example");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		red = new JCheckBox("Red");
		green = new JCheckBox("Green");
		blue = new JCheckBox("Blue");
		JButton button = new JButton("확인");
		button.addActionListener(new ButtonListener());
		Container cPane = getContentPane();
		cPane.setLayout(new FlowLayout());
		cPane.add(red);
		cPane.add(green);
		cPane.add(blue);
		cPane.add(button);
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		int rCheck = red.isSelected() ? 1 : 0;
		int gCheck = green.isSelected() ? 1 : 0;
		int bCheck = blue.isSelected() ? 1 : 0;
		g.setColor(new Color(rCheck*255, gCheck*255, bCheck*255));
		g.fillOval(50, 80, 200, 200);
		}
	
	private class ButtonListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			repaint();
		}
	}
		
		
	public static void main(String[] args) {
		(new CheckBoxColor()).setVisible(true);
	}
}
