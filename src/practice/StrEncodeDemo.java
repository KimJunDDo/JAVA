package practice;

import java.util.Scanner;

class StrEncoder {
	public int key;
	
	public StrEncoder(int key) {
		this.key = key;
	}
	
	public String encode(String str) {
		String answer = "";
		for (int i=0; i<str.length(); i++) {
			int c = str.charAt(i);
			int temp = 0;
			
			if(c>=32 && c<=47) {
				answer += (char)c;
			}
			else if(c>=65 && c<= 90) {
				temp = c+key;
				if(temp>90) {
					temp -= 26;
				}
				answer += (char)temp;
			}
			else if(c>=97 && c<= 122) {
				temp = c+key;
				if(temp>122) {
					temp -= 26;
				}
				answer += (char)temp;
			}
		}
		return answer;
	}
	
	public String decode(String str) {
		String answer = "";
		for (int i=0; i<str.length(); i++) {
			int c = str.charAt(i);
			int temp = 0;
			
			if(c>=32 && c<=47) {
				answer += (char)c;
			}
			else if(c>=65 && c<= 90) {
				temp = c-key;
				if(temp<65) {
					temp += 26;
				}
				answer += (char)temp;
			}
			else if(c>=97 && c<= 122) {
				temp = c-key;
				if(temp<97) {
					temp += 26;
				}
				answer += (char)temp;
			}
		}
		return answer;
	}
}
	
public class StrEncodeDemo {
	public static void main(String[] args) {
		StrEncoder encoder1 = new StrEncoder(3);
		StrEncoder encoder2 = new StrEncoder(7);
		
		System.out.println("영어 문장을 입력하시오:");
		Scanner input = new Scanner(System.in);
		String str = input.nextLine().trim();
		String encStr1 = encoder1.encode(str);
		String encStr2 = encoder2.encode(str);
		System.out.println("encoded with key=3: " + encStr1);
		System.out.println("encoded with key=7: " + encStr2);
		System.out.println("decoded (key=3): " + encoder1.decode(encStr1));
		System.out.println("decoded (key=7): " + encoder2.decode(encStr2));
	}
}
