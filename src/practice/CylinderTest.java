package Practice;

class Cylinder {
	public static final double Pi = 3.141592;
	public int radius;
	public int height;
	
	public Cylinder(int radius, int height) {
		this.radius = radius;
		this.height = height;
	}
	
	public double getVolume() {
		double Volume = Pi * radius * radius * height;
		return Volume;
	}
	
	public double getSurfaceArea() {
		double Surface = Pi * radius * radius * 2 + 2 * Pi * radius * height;
		return Surface;
	}
	
	public String toString() { //객체와 그 속성을 다른 형식으로 인쇄하기 위하여 toString 메소드를 클래스 내부에 정의해야함.
		return "원기둥: 반지름=" + this.radius + ", 높이=" + this.height;
	}
}

public class CylinderTest {
	public static void main(String[] args) {
		Cylinder cy = new Cylinder(5, 8);
		System.out.println(cy);
		System.out.printf("부피=%.2f\n", cy.getVolume());
		System.out.printf("겉넓이=%.2f\n", cy.getSurfaceArea());
	}
}