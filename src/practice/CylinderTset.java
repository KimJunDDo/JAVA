package Practice;

class Cylinder {
	public static final double Pi = 3.141592;
	public int radius;
	public int height;
	
	public Cylinder(int radius, int height) {
		this.radius = radius;
		this.height = height;
		
		System.out.println("�����: ������=" + radius + ", ����=" + height);
	}
	
	public double getVolume() {
		double Volume = Pi * radius * radius * height;
		return Volume;
	}
	
	public double getSurfaceArea() {
		double Surface = Pi * radius * radius * 2 + 2 * Pi * radius * height;
		return Surface;
	}
}

public class CylinderTset {
	public static void main(String[] args) {
		Cylinder cy = new Cylinder(5, 8);
		System.out.println(cy);
		System.out.printf("����=%.2f\n", cy.getVolume());
		System.out.printf("�ѳ���=%.2f\n", cy.getSurfaceArea());
	}
}
