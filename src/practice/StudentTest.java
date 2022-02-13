package Practice;
import java.util.Scanner;

class Student {
	private String name;
	private String field;
	private String Course;
	
	
	public void readInfo() {
		Scanner input = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		Scanner input3 = new Scanner(System.in);
		System.out.print("학생 이름: ");
		String name = input.nextLine();
		this.name = name;
		System.out.print("학과: ");
		String field = input2.nextLine();
		this.field = field;
		System.out.println("과목명과 학점을 한 줄씩 입력: ");
		for (int i=0; i<10; i++) {
			String Course = input3.nextLine();
			this.Course = Course;
			if(Course.length() == 0)
				break;		
		}
	}
	
	public void writeInfo() {
		System.out.println(Course);
	}
}
public class StudentTest {

	public static void main(String[] args) {
		Student s = new Student();
		s.readInfo();
		s.writeInfo();
	}
}
