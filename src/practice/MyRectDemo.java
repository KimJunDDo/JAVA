package Practice;

class MyRect {
	public int x;
	public int y;
	
	public MyRect(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getArea() {
		int Area = x * y;
		
		return Area;
	}
}
public class MyRectDemo {
	public static void main(String[] args) {
		MyRect rect = new MyRect(20, 10);
		System.out.println("직사각형의 면적=" + rect.getArea());
	}
}
