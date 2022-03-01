package Practice;

class Student {
	public String name, number, field;
	public double score;
	
	public Student(String name, String number, String field, double score) {
		this.name = name;
		this.number = number;
		this.field = field;
		this.score = score;
	}

	public String toString() {
		return "이름=" + name + ", 학번=" + number + ", 학과=" + field + ", 성적=" + score;
	}
}

class Undergraduate extends Student {
	private int grade;
	
	public Undergraduate(String name, String number, String field, double score, int grade) {
		super(name, number, field, score);
		this.grade = grade;
	}
	
	public String toString() {
		return "이름=" + name + ", 학번=" + number + ", 학과=" + field + ", 성적=" + score + ", 학년=" + grade;
	}
}

class Graduate extends Student {
	public String topic, professor;
	
	public Graduate(String name, String number, String field, double score, String topic, String professor) {
		super(name, number, field, score);
		this.topic = topic;
		this.professor = professor;
	}
	
	public void setThesisTitle(String a) {
		this.topic = a;
	}
	
	public String toString() {
		return "이름=" + name + ", 학번=" + number + ", 학과=" + field + ", 성적=" + score + ", 논문주제=" + topic + ", 지도교수=" + professor;
	}
}
public class StudentTest2 {
	public static void main(String[] args) {
		Undergraduate s1 = new Undergraduate("홍길동", "201701012", "소프트웨어학과", 3.88, 2);
		Graduate s2 = new Graduate("정길동", "20161234", "컴퓨터공학과", 4.12, "미정", "박교수");
	    Student s3 = new Graduate("김길동", "20141235", "컴퓨터공학과", 3.88, "미정", "박교수");
	    s2.setThesisTitle("정보보안");
	    ((Graduate)s3).setThesisTitle("빅데이터");
	  	    
	    System.out.println(s1.toString());
	    System.out.println(s2.toString());
	    System.out.println(s3.toString());	
	}
}
