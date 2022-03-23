package practice;

import javax.swing.JFrame;

public class SquareDemo {
	public static void main(String[] args) {
		SquareFrame sq = new SquareFrame();
		sq.setTitle("컬러사각형 데모");
		sq.setSize(500, 500);
		sq.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		sq.setVisible(true);
	}

}
