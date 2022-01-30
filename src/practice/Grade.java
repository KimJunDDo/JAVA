package Practice;
import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		System.out.println("학점을 하나씩 입력하시오(입력의 끝은 내용없이 엔터)");
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
			System.out.println("잘못된 학점입니다.");
			}
		}
		
		double avg = gradepoints / grade.length();
		System.out.println("평균은"+avg+"입니다.");
		}
}
