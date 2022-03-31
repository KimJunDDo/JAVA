package practice;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

class MyShape {
	protected int x, y;
	
	public MyShape(int x, int y) {
		this.x = x; this.y = y;
	}
	public void draw(Graphics g){}
}

class MyRect extends MyShape {
	private int width, height;
	
	public MyRect(int x, int y, int width, int height) {
		super(x, y);
		this.width = width; this.height = height;
	}
	public void draw(Graphics g){
		g.drawRect(x, y, width, height);
	}
}

class MyCircle extends MyShape {
	private int radius;
	
	public MyCircle(int x, int y, int radius) {
		super(x, y);
		this.radius = radius;
	}
	public void draw(Graphics g){
		g.drawOval(x-radius, y-radius, 2*radius, 2*radius);
	}
}

class MyDiamond extends MyShape {
	private int width, height;
	
	public MyDiamond(int x, int y, int width, int height) {
		super(x, y);
		this.width = width; this.height = height;
	}
	public void draw(Graphics g) {
		g.drawLine(x, y-height/2, x+width/2, y);
		g.drawLine(x+width/2, y, x, y+height/2);
		g.drawLine(x, y+height/2, x-width/2, y);
		g.drawLine(x-width/2, y, x, y-height/2);
	}
}

public class ShapeTest extends JFrame {
	private MyShape[] shapes;
	
	public ShapeTest() {
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		shapes = new MyShape[3];
		shapes[0] = new MyRect(50, 50, 200, 150);
		shapes[1] = new MyCircle(200, 180, 100);
		shapes[2] = new MyDiamond(220, 170, 300, 160);	
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		shapes[0].draw(g);
		shapes[1].draw(g);
		g.setColor(Color.blue);
		shapes[2].draw(g);
	}
	
	public static void main(String[] args) {
		(new ShapeTest()).setVisible(true);
	}
}
