package practice;
import java.util.Scanner;

class Patient {
	public String name;
	public int height;
	public int weight;
	
	public Patient(String name, int height, int weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	
	public String getName() {
		return name;
	}
	
	public double getBMI() {
		double BMI = (double)weight / ((double)height * (double)height) * 10000;
		
		return BMI;
	}
}

public class PatientDemo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("�̸��� �Է��Ͻÿ�:");
		String name = input.nextLine().trim();
		System.out.print("Ű�� �Է��Ͻÿ�(cm):");
		int height = input.nextInt();
		System.out.print("ü���� �Է��Ͻÿ�(kg):");
		int weight = input.nextInt();

		Patient p = new Patient(name, height, weight);
		System.out.println(p.getName() + "�� BMI = " + p.getBMI());
	}
}
