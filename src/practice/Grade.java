package Practice;
import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		System.out.println("������ �ϳ��� �Է��Ͻÿ�(�Է��� ���� ������� ����)");
		Scanner gr = new Scanner(System.in);
		String grade = gr.next();
		double gradepoints = 0;
		
		if("".equals(grade))
			System.exit(0);
		else {
		switch(grade) {
		case "A+":
			gradepoints = 4.5;
			gradepoints++;
			break;
		case "A":
			gradepoints = 4.0;
			gradepoints++;
			break;
		case "B+":
			gradepoints = 3.5;
			gradepoints++;
			break;
		case "B":
			gradepoints = 3.0;
			gradepoints++;
			break;
		case "C+":
			gradepoints = 2.5;
			gradepoints++;
			break;
		case "C":
			gradepoints = 2.0;
			gradepoints++;
			break;
		case "D":
			gradepoints = 1.0;
			gradepoints++;
			break;
		case "F":
			gradepoints = 0.0;
			gradepoints++;
			break;
		default:
			System.out.println("�߸��� �����Դϴ�.");
			}
		}
		
		double avg = gradepoints / grade.length();
		System.out.println("�����"+avg+"�Դϴ�.");
		}
}
