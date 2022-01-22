package practice;
import java.util.Scanner;

public class Coin {

	public static void main(String[] args) {
		Scanner Coin = new Scanner(System.in);
		
		System.out.println("1000 미만의 양수를 입력하시오:");
		int coin = Coin.nextInt();
		
		int won_500 = coin / 500;
		int rest = coin % 500;
		int won_100 = rest / 100;
		int rest2 = rest % 100;
		int won_50 = rest2 / 50;
		int rest3 = rest2 % 50;
		int won_10 = rest3 / 10;
		int rest4 = rest3 % 10;
		int won_5 = rest4 / 5;
		int rest5 = rest4 % 5;
		int won_1 = rest5 / 1;
		
		System.out.println("500원짜리: "+won_500+"개");
		System.out.println("100원짜리: "+won_100+"개");
		System.out.println("50원짜리: "+won_50+"개");
		System.out.println("10원짜리: "+won_10+"개");
		System.out.println("5원짜리: "+won_5+"개");
		System.out.println("1원짜리: "+won_1+"개");

	}

}