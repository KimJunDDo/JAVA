package practice;
import java.util.Scanner;

public class ThreeInt {
	public static void main(String[]args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("������ ������ �Է��Ͻÿ�: ");
		
		int a = keyboard.nextInt();
		int b = keyboard.nextInt();
		int c = keyboard.nextInt();
		
		System.out.println("������ ������ ����: " + (a+b+c));
		System.out.println("������ ������ ����: " + (a*b*c));
	}
}
