package practice;
import javax.swing.JOptionPane;

public class Birth {

	public static void main(String[] args) {
		String birthday = JOptionPane.showInputDialog("생년월일을 6자리로 입력하시오.(yymmdd)");
		String yy = birthday.substring(0, 2);
		String mm = birthday.substring(2, 4);
		String dd = birthday.substring(4, 6);
		
		JOptionPane.showMessageDialog(null, "생일: 19"+yy+"년"+mm+"월"+dd+"일");
		
		System.exit(0);
		
	}

}
