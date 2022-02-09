package practice;
import java.util.Scanner;

class Patient {
	public String name;
	public int height;
	public int weight;
	public double BMI;
	
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
		this.BMI = BMI;
		return BMI;
	}
	
	public String Diagnosis() {
		String result;
		
		if (BMI >= 25)
			result = "��";
		else if (BMI >= 23)
			result = "��ü��";
		else if (BMI >= 18.5)
			result = "����";
		else
			result = "��ü��";
		
		return result;
	}
}

public class PatientDemo2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("�̸��� �Է��Ͻÿ�:");
		String name = input.nextLine().trim();
		System.out.print("Ű�� �Է��Ͻÿ�(cm):");
		int height = input.nextInt();
		System.out.print("ü���� �Է��Ͻÿ�(kg):");
		int weight = input.nextInt();

		Patient p = new Patient(name, height, weight);
		System.out.println(p.getName() + "�� BMI = " + p.getBMI() + ", " + p.Diagnosis() + "�Դϴ�.");
	}
}
