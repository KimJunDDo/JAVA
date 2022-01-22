package practice;
import java.util.Scanner;

public class CapitalLetter {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("영어문장을 입력하시오.");
		String engline = input.nextLine();
		int place = engline.indexOf("Java"); //Java라고 시작하는 배열의 시작 인덱스를 찾음
		int end = engline.length();
		String Lowerline = engline.substring(0, place);
		String Cutline = engline.substring(place, end);
		String Capitalline = Cutline.toUpperCase();
		String result = Lowerline+Capitalline;
		
		System.out.println("수정된 문장은");
		System.out.println(result);
	}

}