package Practice;
import java.util.Scanner;

public class MaxMinAvg {

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		System.out.println("���� �������� �Է��Ͻÿ�.(�Է��� ���� -1)");
		
		boolean run = true;
		int sum = 0;
		
		do {
			int a = num.nextInt();
			int[] A = new int [a];

			if(a != -1) {
				for(int i=0; i)
			}
			else if(a == -1) {	
				run = false;
			}

		} while(run);

		System.out.println("��հ�"+sum+"�Դϴ�.");
	}

}
