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
			result = "비만";
		else if (BMI >= 23)
			result = "과체중";
		else if (BMI >= 18.5)
			result = "정상";
		else
			result = "저체중";
		
		return result;
	}
}

public class PatientDemo2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("이름을 입력하시오:");
		String name = input.nextLine().trim();
		System.out.print("키를 입력하시오(cm):");
		int height = input.nextInt();
		System.out.print("체중을 입력하시오(kg):");
		int weight = input.nextInt();

		Patient p = new Patient(name, height, weight);
		System.out.println(p.getName() + "의 BMI = " + p.getBMI() + ", " + p.Diagnosis() + "입니다.");
	}
}
