package Practice;
import java.util.Scanner;

public class BirthAndBoolen {

	public static void main(String[] args) {
		System.out.println("��������� 6�ڸ��� �Է��Ͻÿ�:");
		Scanner birthday = new Scanner(System.in);
		String birth = birthday.nextLine();
		
		String yy = birth.substring(0, 2);
		String mm = birth.substring(2, 4);
		String dd = birth.substring(4, 6);
		
		if(char.At(0) == 0 && char.At(1) == 0)
			System.out.println("19"+yy+"�� "+mm+"�� "+dd+"���Դϴ�.");
		
	}

}