package Practice;
import java.util.Scanner;

public class MaxMin {

	public static void main(String[] args) {
		Scanner mxmn = new Scanner(System.in);
		System.out.println("������ ������ �Է��Ͻÿ�:");
		int a = mxmn.nextInt();
		int b = mxmn.nextInt();
		int c = mxmn.nextInt();
		
		int max, min;
		
		int big = (a > b) ? a : b;
		if (big > c)
			max = big;
		else
			max = c;
		
		int small = (a < b) ? a : b;
		if (small < c)
			min = small;
		else
			min = c;
		
		System.out.println("�ִ�: "+max+", �ּڰ�: "+min);

	}

}