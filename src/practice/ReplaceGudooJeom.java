package Practice;
import javax.swing.JOptionPane;

public class ReplaceGudooJeom {

	public static void main(String[] args) {
		String Pd = JOptionPane.showInputDialog("�ܾ �Է��ϼ���:");
		String result1 = Pd.replace(" ", "");
		String result2 = result1.replaceAll("\\p{Punct}", "");
		String result = result2.toLowerCase();
		
		int length = result.length();
		boolean isPalin = true;
		
		for (int i=0, j=length-1; i<j; i++, j--) {
			if (result.charAt(i) != result.charAt(j)) {
				isPalin = false;
				break;
			}
		}
		
		if (isPalin) {
			JOptionPane.showMessageDialog(null, "\""+Pd+"\"�� ȸ���Դϴ�.");
			System.exit(0);
		}
		else {
			JOptionPane.showMessageDialog(null, "\""+Pd+"\"�� ȸ���� �ƴմϴ�.");
			System.exit(0);
		}

	}
}