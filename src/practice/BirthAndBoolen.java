package Practice;
import java.util.Scanner;

public class BirthAndBoolen {

	public static void main(String[] args) {
		System.out.println("��������� 6�ڸ��� �Է��Ͻÿ�:");
		Scanner birthday = new Scanner(System.in);
		String birth = birthday.nextLine();
		
		if(birth.length() != 6)
			System.out.println("6�ڸ� ���ڷ� �Է����ּ���.");
		else {
		String yy = birth.substring(0, 2);
		String mm = birth.substring(2, 4);
		String dd = birth.substring(4, 6);
		int yy1 = Integer.parseInt(yy);
		int mm1 = Integer.parseInt(mm);
		int dd1 = Integer.parseInt(dd);
		
		if (yy1 <= 99 && mm1 <= 12 && (dd1 <= 31 && dd1 > 0))
			System.out.println("19"+yy+"�� "+mm+"�� "+dd+"���Դϴ�.");
		else if (mm1 >= 13)
			System.out.println("\'��\'�� �߸��Ǿ����ϴ�.");
		else if (dd1 >= 32 || dd1 <= 0)
			System.out.println("\'��\'�� �߸��Ǿ����ϴ�.");
		}
		
	}

}