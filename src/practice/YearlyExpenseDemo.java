package Practice;
import java.util.Scanner;

class YearlyExpense {
	static int[] arr = new int[12]; //�迭�� ���������� �����ؼ� Ŭ���� ������ �� ���� �� �� �ֵ��� ����.
	
	public static int[] readInfo() {
		int i = 0;
		for(i=0; i<12; i++) {
			Scanner input = new Scanner(System.in);
			System.out.print(i+1 + "���� ����=");
			arr[i] = input.nextInt();
		}
		return arr;	
	}
	
	public static int getExpense(int a) {
		int month = arr[a-1];
		return month;
	}
	
	public static double getMonthlyAvg() {	
		int a = 0;
		double sum = 0.0;
		for(a=0; a<12; a++) {
			sum += arr[a];
		}
		double avg = sum / 12;
		return avg;
	}
	
	public static int getMaxMonth() {
		int max = 0;
		int index = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
				index = i+1;
			}
		}
		return index;
	}
	
	public static int getMinMonth() {
		int min = arr[0];
		int index = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(min > arr[i]) {
				min = arr[i];
				index = i+1;
			}
		}
		return index;
	}
	
}

public class YearlyExpenseDemo {
	public static void main(String[] args) {
		YearlyExpense expense = new YearlyExpense();
		expense.readInfo();
		System.out.println("����� ����=" + expense.getMonthlyAvg());
		System.out.println("�ִ� �����=" + expense.getMaxMonth() + ", �����=" + expense.getExpense(expense.getMaxMonth()));
		System.out.println("�ּ� �����=" + expense.getMinMonth() + ", �����=" + expense.getExpense(expense.getMinMonth()));

	}

}
