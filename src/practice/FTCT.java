package practice;
import java.util.Scanner;

public class FTCT {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("화씨 온도를 입력하시오: ");
		int FT = keyboard.nextInt();
	    double CT = (FT - 32) / 1.8;
		
		System.out.println("화씨 "+FT+"도는 섭씨 "+(int)CT+"도 입니다."); //CT를 int형으로 캐스팅 했음

	}

}