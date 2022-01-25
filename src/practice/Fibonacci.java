package Practice;
import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner m = new Scanner(System.in);
		System.out.println("¾çÀÇ Á¤¼ö mÀ» ÀÔ·ÂÇÏ½Ã¿À");
		int standard = m.nextInt();
		
		int[] F = new int[1000];
		F[0] = 0;
		F[1] = 1;
		
		for(int i = 2; i<15; i++) {       //피보나치 수열
			F[i] = F[i-1] + F[i-2];
		}
		
		if (standard <= F[12])
			System.out.println(F[12]);
			
	}

}
