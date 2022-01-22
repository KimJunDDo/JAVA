package practice;
import java.util.Scanner;

public class ThreeInt {
	public static void main(String[]args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("세개의 정수를 입력하시오: ");
		
		int a = keyboard.nextInt();
		int b = keyboard.nextInt();
		int c = keyboard.nextInt();
		
		System.out.println("세개의 정수의 합은: " + (a+b+c));
		System.out.println("세개의 정수의 곱은: " + (a*b*c));
	}
}
