package practice;

class Student {
	public String name;
	public String number;
	public String field;
	public int grade;
	
	public Student(String name, String number, String field, int grade) {
		this.name = name;
		this.number = number;
		this.field = field;
		this.grade = grade;
	}
	
	public Student() {
		
	}
	
	public void setInfo(String name, String number, String field, int grade) {
		this.name = name;
		this.number = number;
		this.field = field;
		this.grade = grade;
	}
	
	public void writeInfo() {
		System.out.println("이름=" + name + ", 학번=" + number + ", " + field + " " + grade + "학년");
	}	
	
}

public class Studentdemo2 {
	public static void main(String[] args) {
		Student s1 = new Student("홍길동", "201811222", "컴퓨터공학", 2);
		Student s2 = new Student();
		s2.setInfo("김전자", "201911012", "전자공학", 1);
		s1.writeInfo();
		s2.writeInfo();		
	}

}
