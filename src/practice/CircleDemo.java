package practice;
import javax.swing.JFrame;

public class CircleDemo {
	public static void main(String[] args) {
		CircleFrame circle = new CircleFrame();
		circle.setTitle("동심원 예제");
		circle.setSize(500, 500);
		circle.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		circle.setVisible(true);
	}
}
