package practice;
import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("키를 입력하시오(cm):");
		double height = keyboard.nextDouble();
		System.out.println("체중을 입력하시오(kg):");
		double weight = keyboard.nextDouble();
		
		double BMI = weight / (height * height) * 10000;
		
		System.out.println("체질량지수(BMI) = "+BMI);

	}
}
