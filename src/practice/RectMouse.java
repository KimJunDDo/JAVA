package practice;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class RectMouse extends JFrame {
	private class MyPanel extends JPanel {
		private Point[] points;
		private int count = 0;
		
		public MyPanel() {
			points = new Point[100];
			
			this.addMouseListener(new MouseListener() {
				public void mousePressed(MouseEvent e) {
					points[count++] = new Point(e.getX(), e.getY());
					repaint();
				}
				public void mouseReleased(MouseEvent e) {}
				public void mouseEntered(MouseEvent e) {}
				public void mouseExited(MouseEvent e) {}
				public void mouseClicked(MouseEvent e) {}
			});
		}
		
		@Override
		protected void paintComponent(Graphics g) {
			g.setColor(Color.RED);
			g.drawRect(points, count, count, count);
		}
	}
	public static void main(String[] args) {
		(new RectMouse()).setVisible(true);
	}
}
