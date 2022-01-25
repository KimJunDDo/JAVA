package ractice;
import java.util.Scanner;

public class BirthAndBoolen {

	public static void main(String[] args) {
		System.out.println("생년월일을 6자리로 입력하시오:");
		Scanner birthday = new Scanner(System.in);
		String birth = birthday.nextLine();
		
		if(birth.length() != 6)
			System.out.println("6자리 숫자로 입력해주세요.");
		else {
		String yy = birth.substring(0, 2);
		String mm = birth.substring(2, 4);
		String dd = birth.substring(4, 6);
		int yy1 = Integer.parseInt(yy);
		int mm1 = Integer.parseInt(mm);
		int dd1 = Integer.parseInt(dd);
		
		if (yy1 <= 99 && mm1 <= 12 && (dd1 <= 31 && dd1 > 0))
			System.out.println("19"+yy+"년 "+mm+"월 "+dd+"일입니다.");
		else if (mm1 >= 13)
			System.out.println("\'월\'이 잘못되었습니다.");
		else if (dd1 >= 32 || dd1 <= 0)
			System.out.println("\'일\'이 잘못되었습니다.");
		}		
	}
}
