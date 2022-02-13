package Practice;
import java.util.Scanner;

public class EngEext {
	public static void main(String[] args) {
		Scanner Eng = new Scanner(System.in);
		System.out.println("영어 문장을 입력하시오.");
		String Text = Eng.nextLine();
		Text = Text.replaceAll("[-+.^:,]","");
		Text = Text.replaceAll(" ", "");
        Text = Text.toUpperCase();
        
        int cnt[] = new int[26];
        
        for (int i  = 0 ; i < Text.length() ; i++){
			char ch = Text.charAt(i);
			cnt[ch - 'A']++;
		}
        
        System.out.println("각 영문자당 회수:");

		for (int i = 0; i < 26 ; i++ ){
			if(cnt[i] !=0)
				System.out.println((char)(65+i) + ": " + cnt[i]);		
		}      
	}
}
