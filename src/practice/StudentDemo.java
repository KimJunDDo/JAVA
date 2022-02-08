package Practice;

class Student {
	public String name;
	public String course;
	public int score;
	
	public Student(String name, String course, int score) {
		this.name = name;
		this.course = course;
		this.score = score;
	}
	public void writeOutput() {
		System.out.println("이름: " + name);
		System.out.println("과목: " + course);
		System.out.println("성적: " + score);
		System.out.println("학점: " + getGrade());
	}
	
	public String getGrade() {
		String grade;
		
		if (score >= 95)
			grade = "A+";
		else if (score >= 90)
			grade = "A";
		else if (score >= 85)
			grade = "B+";
		else if (score >= 80)
			grade = "B";
		else if (score >= 75)
			grade = "C+";
		else if (score >= 70)
			grade = "C";
		else if (score >= 65)
			grade = "D+";
		else if (score >= 60)
			grade = "D";
		else
			grade = "F";
		
		return grade;
	}
}

public class StudentDemo {
	public static void main(String[] args) {
		Student s1 = new Student("홍길동", "자바프로그래밍", 93);
		s1.writeOutput();
	}
}
