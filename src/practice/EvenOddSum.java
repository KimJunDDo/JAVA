package Practice;
import java.util.Scanner;

public class EvenOddSum {

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		System.out.println("���� n�� �Է����ֽʽÿ�");
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
		System.out.println("����"+sum+"�Դϴ�.");

	}

}