package practice;
import java.util.Scanner;

public class CapitalLetter {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("������� �Է��Ͻÿ�.");
		String engline = input.nextLine();
		int place = engline.indexOf("Java"); //Java��� �����ϴ� �迭�� ���� �ε����� ã��
		int end = engline.length();
		String Lowerline = engline.substring(0, place);
		String Cutline = engline.substring(place, end);
		String Capitalline = Cutline.toUpperCase();
		String result = Lowerline+Capitalline;
		
		System.out.println("������ ������");
		System.out.println(result);
	}

}