package practice;
import java.util.Scanner;

public class CTFT {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("���� �µ��� �Է��Ͻÿ�: ");
		int CT = keyboard.nextInt();
	    double FT = CT * 1.8 + 32;
		
		System.out.println("����"+CT+"���� ȭ��"+(int)FT+"�� �Դϴ�."); //FT�� int������ ĳ���� ����

	}

}
