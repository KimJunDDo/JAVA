package Practice;
import javax.swing.JOptionPane;

public class SojuPlz {

	public static void main(String[] args) {
		String Pd = JOptionPane.showInputDialog("단어를 입력하세요:");
		String result = Pd.replace(" ", "");
		int length = result.length();
		boolean isPalin = true;
		int j = 0;
		
		for (int i=0; j=length-1; i<j; i++, j--) {
			if(result.charAt(i) != result.charAt(j)) {
				isPalin = false;
				break;
			}
		}
		JOptionPane.showMessageDialog(null, "체질량지수(BMI) = "+result);
		
		System.exit(0);

	}

}
