package Practice;
import java.util.Scanner;

public class NAvgMaxMain {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("������ �Է��Ͻÿ�: ");
		int a = input.nextInt();
		int[] arr = new int[a];
		
		Scanner input2 = new Scanner(System.in);
		System.out.println(a + "���� ������ �Է��Ͻÿ�.");
		
		for (int i=0; i<a; i++)
			arr[i] = input.nextInt();
		
		int avg = AvgOfArray(arr) / a;
		int max = Max(arr);
		int min = Min(arr);
		
		System.out.println("��հ�="+avg);
		System.out.println("�ִ밪="+max);
		System.out.println("�ּҰ�="+min);
	}
	
	private static int AvgOfArray(int[] a) {
		int sum = 0;
		for (int i=0; i<a.length; i++)
			sum += a[i];
		return sum;		
	}
	
	private static int Max(int[] a) {
		int max = 0;
		
		for(int i=0; i<a.length; i++) {
			if(a[i]>max)
				max = a[i];
		}
		return max;
	}
	private static int Min(int[] a) {
        int min = a[0];
		for(int i=0; i<a.length; i++) {
			if(a[i]<=min)
				min = a[i];
		}
		return min;
	}
	
}
