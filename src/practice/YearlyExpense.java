package Practice;
import java.util.Scanner;

public class YearlyExpense {

	public static void main(String[] args) {
		YearlyExpense expense = new YearlyExpense();
		expense.readInfo;
		expense.getExpense();
		System.out.println(expense.getExpense(expense.getMonthlyAvg()));
	}
	
	private static void getExpense() {
		int[] arr = new int[12];
		int i = 0;
		for(i=0; i<12; i++) {
			Scanner input = new Scanner(System.in);
			System.out.print(i+1 + "월의 지출=");
			arr[i] = input.nextInt();
		}
	}
	
	private static double getMonthlyAvg() {
		
		int a = 0;
		double sum = 0.0;
		for(a=0; a<12; a++) {
			sum += arr[a];
		}
		double avg = sum / 12;
		return avg;
	}
		
}
