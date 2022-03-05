package practice;
import java.awt.Graphics;
import javax.swing.JFrame;

public class CircleFrame extends JFrame {
	public void paint(Graphics g) {
		g.drawOval(225, 225, 50,50);
		g.fillOval(225, 225, 50, 50);
		g.drawOval(200, 200, 100,100);
		g.drawOval(175, 175, 150,150);
		g.drawOval(150, 150, 200,200);
		g.drawOval(125, 125, 250,250);
	}
}
