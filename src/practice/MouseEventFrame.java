package practice;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MouseEventFrame extends JFrame {
	
	private class MyPanel extends JPanel {
		private Point[] points;
		private int count = 0;
	
		public MyPanel() {
			points = new Point[100];
			
			this.addMouseListener(new MouseListener() {
				public void mousePressed(MouseEvent e) {
					if (count < points.length) {
						points[count++] = new Point(e.getX(), e.getY());
						repaint();
					}
				}
				public void mouseReleased(MouseEvent e) {}
				public void mouseEntered(MouseEvent e) {}
				public void mouseExited(MouseEvent e) {}
				public void mouseClicked(MouseEvent e) {}
			});
		}
		
			@Override
			protected void paintComponent(Graphics g) {
				Graphics2D g2 = (Graphics2D) g;
				g2.setStroke(new BasicStroke(3));
				g2.setColor(Color.blue);
				for (int i=0; i<count-1; i++)
					g2.drawLine(points[i].x, points[i].y, points[i+1].x, points[i+1].y);
			}
	}
	
	public MouseEventFrame() {
		setSize(400, 300);
		setTitle("Mouse Line Drawing Example");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		add(new MyPanel());
	}
	
	public static void main(String[] args) {
		(new MouseEventFrame()).setVisible(true);
	}
}
