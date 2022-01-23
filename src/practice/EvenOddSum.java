package Practice;
import java.util.Scanner;

public class EvenOddSum {

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		System.out.println("정수 n을 입력해주십시오");
		int n = num.nextInt();
		
		int sum = 0;
		
		if (n%2 == 0) {
			for (int i=1; i <= n; i++) {
				if (i%2 ==0)
					sum += i;
			}
		}
		else {
			for (int i=1; i <= n; i++) {
				if (i%2 != 0)
					sum += i;
			}
		}
		System.out.println("합은"+sum+"입니다.");

	}

}