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
		System.out.println("�̸�=" + name + ", �й�=" + number + ", " + field + " " + grade + "�г�");
	}	
	
}

public class Studentdemo2 {
	public static void main(String[] args) {
		Student s1 = new Student("ȫ�浿", "201811222", "��ǻ�Ͱ���", 2);
		Student s2 = new Student();
		s2.setInfo("������", "201911012", "���ڰ���", 1);
		s1.writeInfo();
		s2.writeInfo();		
	}

}
