package practice;
import javax.swing.JOptionPane;

public class BMIGui {

	public static void main(String[] args) {
		
		String heightString = JOptionPane.showInputDialog("Ű�� �Է��Ͻÿ�(cm):");
		double height = Double.parseDouble(heightString);
		String weightString = JOptionPane.showInputDialog("ü�߸� �Է��Ͻÿ�(kg):");
		double weight = Double.parseDouble(weightString);

		double BMI = weight / (height * height) * 10000;
		
		JOptionPane.showMessageDialog(null, "ü��������(BMI) = "+BMI);
		
		System.exit(0);

	}
}
