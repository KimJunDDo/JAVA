package practice;
import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Ű�� �Է��Ͻÿ�(cm):");
		double height = keyboard.nextDouble();
		System.out.println("ü���� �Է��Ͻÿ�(kg):");
		double weight = keyboard.nextDouble();
		
		double BMI = weight / (height * height) * 10000;
		
		System.out.println("ü��������(BMI) = "+BMI);

	}
}
