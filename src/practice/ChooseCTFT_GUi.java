package practice;
import javax.swing.JOptionPane;

public class ChooseCTFT_GUi {

	public static void main(String[] args) {
		
		String str = JOptionPane.showInputDialog("��ȯ�� �µ��� �Է��Ͻÿ�.\n(������ �µ� �ڿ� c��C��,ȭ���� f��F�� ǥ��)");
		if(str.indexOf("c") != -1) {
			String temp = str.substring(0, str.length()-1);
			int CT = Integer.parseInt(temp);
			double FT = CT * 1.8 + 32;
			JOptionPane.showMessageDialog(null, "���� "+CT+"���� ȭ�� "+ (int)FT+"���Դϴ�");
			
		}
		else if(str.indexOf("C") != -1) {
			String temp = str.substring(0, str.length()-1);
			int CT = Integer.parseInt(temp);
			double FT = CT * 1.8 + 32;
			JOptionPane.showMessageDialog(null, "���� "+CT+"���� ȭ�� "+ (int)FT+"���Դϴ�");
		}
		else if(str.indexOf("f") != -1) {
			String temp = str.substring(0, str.length()-1);
			int FT = Integer.parseInt(temp);
			double CT = (FT - 32) / 1.8;
			JOptionPane.showMessageDialog(null, "ȭ�� "+FT+"���� ���� "+ (int)CT+"���Դϴ�");
		}
		else if(str.indexOf("F") != -1) {
			String temp = str.substring(0, str.length()-1);
			int FT = Integer.parseInt(temp);
			double CT = (FT - 32) / 1.8;
			JOptionPane.showMessageDialog(null, "ȭ�� "+FT+"���� ���� "+ (int)CT+"���Դϴ�");
		}
		else
			JOptionPane.showMessageDialog(null, "�߸��� �µ� �Է��Դϴ�.");
	}
}
