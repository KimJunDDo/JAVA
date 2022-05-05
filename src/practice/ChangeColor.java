package practice;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ChangeColor extends JFrame {
	private int a = 0;
	
	public ChangeColor() {
		setSize(380, 250);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container cPane = getContentPane();
		cPane.setLayout(new FlowLayout());
		JButton button = new JButton("빨강색으로");
		button.addActionListener(new BtnListener());
		cPane.add(button);
	}
	
	public void paint(Graphics g) {
		if(a%4==0)
			g.setColor(Color.darkGray);
		else if(a%4==1)
			g.setColor(Color.red);
		else if(a%4==2)
			g.setColor(Color.blue);
		else if(a%4==3)
			g.setColor(Color.yellow);
		
		int x[] = new int[] {50, 130, 150, 130, 50, 70};
		int y[] = new int[] {100, 100, 150, 200, 200, 150};
		g.drawPolygon(x, y, 6);
		g.fillPolygon(x, y, 6);
		int x1[] = new int[] {140, 220, 240, 220, 140, 160};
		int y1[] = new int[] {100, 100, 150, 200, 200, 150};
		g.drawPolygon(x1, y1, 6);
		g.fillPolygon(x1, y1, 6);
		int x2[] = new int[] {230, 310, 330, 310, 230, 250};
		int y2[] = new int[] {100, 100, 150, 200, 200, 150};
		g.drawPolygon(x2, y2, 6);
		g.fillPolygon(x2, y2, 6);
	}
	
	private class BtnListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JButton btn = (JButton) e.getSource();
			a++;
			if(a%4==0)
				btn.setText("빨간색으로");
			else if(a%4==1)
				btn.setText("파란색으로");
			else if(a%4==2)
				btn.setText("노란색으로");
			else if(a%4==3)
				btn.setText("회색으로");
			repaint();	
		}
	}
	
	public static void main(String[] args) {
		(new ChangeColor()).setVisible(true);
	}
}