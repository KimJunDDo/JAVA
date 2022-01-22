package practice;
import java.util.Scanner;

public class CTFT {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("섭씨 온도를 입력하시오: ");
		int CT = keyboard.nextInt();
	    double FT = CT * 1.8 + 32;
		
		System.out.println("섭씨"+CT+"도는 화씨"+(int)FT+"도 입니다."); //FT를 int형으로 캐스팅 했음

	}

}
