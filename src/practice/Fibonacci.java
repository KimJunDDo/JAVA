package Practice;
import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner m = new Scanner(System.in);
		System.out.println("양의 정수 m을 입력하시오");
		int standard = m.nextInt();
		
		int[] F = new int[1000];
		F[0] = 0;
		F[1] = 1;
		
		for(int i = 2; i<15; i++) {
			F[i] = F[i-1] + F[i-2];
		}
		
		if (standard <= F[12])
			System.out.println(F[12]);
			
	}

}
