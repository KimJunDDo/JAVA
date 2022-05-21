package practice;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MouseDrawingFrame2 extends JFrame {
	private Point[] points;
	private int count = 0;
	
	private class MyListener extends MouseAdapter {
		@Override
		public void mouseDragged(MouseEvent e) {
			if (count < points.length) {
				points[count++] = new Point(e.getX(), e.getY());
				repaint();
			}
		}
		@Override
		public void mouseReleased(MouseEvent e) {
			if (count < points.length)
				points[count++] = new Point(-1, -1);
		}
	}
	
	private class MyPanel extends JPanel {
		public MyPanel() {
			setBackground(Color.yellow);
			MyListener listener = new MyListener();
			addMouseListener(listener);
			addMouseMotionListener(listener);
		}
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			Graphics2D g2 = (Graphics2D)g;
			g2.setColor(Color.blue);
			g2.setStroke(new BasicStroke(3));
			for (int i=00; i<count-1; i++)
				if (points[i].x >= 0 && points[i+1].x >= 0)
					g2.drawLine(points[i].x, points[i].y,
							points[i+1].x, points[i+1].y);
		}
	}
	
	public MouseDrawingFrame2() {
		setSize(400, 300);
		setTitle("Mouse Drawing Example");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		points = new Point[1000];
		add(new MyPanel());
	}

	public static void main(String[] args) {
		(new MouseDrawingFrame2()).setVisible(true);
	}
}
