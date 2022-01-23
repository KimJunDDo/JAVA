package practice;
import javax.swing.JOptionPane;

public class ChooseCTFT_GUi {

	public static void main(String[] args) {
		
		String str = JOptionPane.showInputDialog("변환할 온도를 입력하시오.\n(섭씨는 온도 뒤에 c나C로,화씨는 f나F로 표시)");
		if(str.indexOf("c") != -1) {
			String temp = str.substring(0, str.length()-1);
			int CT = Integer.parseInt(temp);
			double FT = CT * 1.8 + 32;
			JOptionPane.showMessageDialog(null, "섭씨 "+CT+"도는 화씨 "+ (int)FT+"도입니다");
			
		}
		else if(str.indexOf("C") != -1) {
			String temp = str.substring(0, str.length()-1);
			int CT = Integer.parseInt(temp);
			double FT = CT * 1.8 + 32;
			JOptionPane.showMessageDialog(null, "섭씨 "+CT+"도는 화씨 "+ (int)FT+"도입니다");
		}
		else if(str.indexOf("f") != -1) {
			String temp = str.substring(0, str.length()-1);
			int FT = Integer.parseInt(temp);
			double CT = (FT - 32) / 1.8;
			JOptionPane.showMessageDialog(null, "화씨 "+FT+"도는 섭씨 "+ (int)CT+"도입니다");
		}
		else if(str.indexOf("F") != -1) {
			String temp = str.substring(0, str.length()-1);
			int FT = Integer.parseInt(temp);
			double CT = (FT - 32) / 1.8;
			JOptionPane.showMessageDialog(null, "화씨 "+FT+"도는 섭씨 "+ (int)CT+"도입니다");
		}
		else
			JOptionPane.showMessageDialog(null, "잘못된 온도 입력입니다.");
	}
}
