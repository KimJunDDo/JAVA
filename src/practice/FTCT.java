package practice;
import java.util.Scanner;

public class FTCT {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("ȭ�� �µ��� �Է��Ͻÿ�: ");
		int FT = keyboard.nextInt();
	    double CT = (FT - 32) / 1.8;
		
		System.out.println("ȭ�� "+FT+"���� ���� "+(int)CT+"�� �Դϴ�."); //CT�� int������ ĳ���� ����

	}

}