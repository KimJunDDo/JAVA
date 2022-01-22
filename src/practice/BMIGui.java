package practice;
import javax.swing.JOptionPane;

public class BMIGui {

	public static void main(String[] args) {
		
		String heightString = JOptionPane.showInputDialog("키를 입력하시오(cm):");
		double height = Double.parseDouble(heightString);
		String weightString = JOptionPane.showInputDialog("체중를 입력하시오(kg):");
		double weight = Double.parseDouble(weightString);

		double BMI = weight / (height * height) * 10000;
		
		JOptionPane.showMessageDialog(null, "체질량지수(BMI) = "+BMI);
		
		System.exit(0);

	}
}
