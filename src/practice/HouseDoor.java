package practice;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class HouseDoor extends JFrame {
	private boolean Open = false;
	
	public HouseDoor() {
		setSize(380, 280);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("House 예제");
		
		Container cPane = getContentPane();
		cPane.setLayout(new FlowLayout());
		JButton button = new JButton("열기");
		button.addActionListener(new BtnListener());
		cPane.add(button);
	}
	
	public void paint(Graphics g) {
		int house_x[] = new int[] {190, 270, 270, 110, 110};
		int house_y[] = new int[] {100, 140, 220, 220, 140};
		g.setColor(Color.black);
		g.drawPolygon(house_x, house_y, 5);
		g.setColor(Color.gray);
		g.fillPolygon(house_x, house_y, 5);
		
		int door_x[] = new int[] {175, 205, 205, 175};
		int door_y[] = new int[] {165, 165, 220, 220};
		g.setColor(Color.black);
		g.drawPolygon(door_x, door_y, 4);
		
		if (Open)
			g.setColor(Color.yellow);
		else
			g.setColor(Color.gray);
		g.fillPolygon(door_x, door_y, 4);
	}
	
	private class BtnListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			Open = !Open;
			JButton btn = (JButton) e.getSource();
			btn.setText(Open ? "닫기" : "켜기");
			repaint();
		}
	}

	public static void main(String[] args) {
		(new HouseDoor()).setVisible(true);
	}

}
