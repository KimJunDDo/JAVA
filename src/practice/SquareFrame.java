package practice;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

public class SquareFrame extends JFrame {
	private static int x = 40;
	private static int y = 40;
	private static int inc = 5;
	
	public void paint(Graphics g) {
		int newx = x, newy = y;
		
		for (int i=1; i<21; i++) {
			if (i%3 == 1) {
				g.setColor(Color.RED);
				g.drawRect(x, y, x, y);
			}
			else if (i%3 == 2) {
				g.setColor(Color.GREEN);
				g.drawRect(x, y, x, y);
			}
			else if (i%3 == 0) {
				g.setColor(Color.BLUE);
				g.drawRect(x, y, x, y);
			}
			newx += inc;
		    newy += inc;
		    
		    x = newx;
		    y = newy;
		}
	}
}
