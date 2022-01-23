package Practice;
import java.util.Scanner;

public class MaxMinAvg {

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		System.out.println("양의 정수들을 입력하시오.(입력의 끝은 -1)");
		
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

		System.out.println("평균값"+sum+"입니다.");
	}

}
