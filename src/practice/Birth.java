package practice;
import javax.swing.JOptionPane;

public class Birth {

	public static void main(String[] args) {
		String birthday = JOptionPane.showInputDialog("��������� 6�ڸ��� �Է��Ͻÿ�.(yymmdd)");
		String yy = birthday.substring(0, 2);
		String mm = birthday.substring(2, 4);
		String dd = birthday.substring(4, 6);
		
		JOptionPane.showMessageDialog(null, "����: 19"+yy+"��"+mm+"��"+dd+"��");
		
		System.exit(0);
		
	}

}
