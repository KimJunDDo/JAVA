package Practice;

class Employee {
	protected String name, department;
	
	public Employee(String name, String department) {
		this.name = name;
		this.department = department;
	}
	
	public String toString() {
		return "이름=" + name + ", 부서=" + department;
	}
	
	public int getMonthlyPay() {
		return 0;
	}
}

class SalariedEmployee extends Employee{
	public int salary;
	
	public SalariedEmployee(String name, String department, int salary) {
		super(name, department);
		this.salary = salary;
	}
	
	public int getMonthlyPay() {
		return salary / 12;
	}
}

class HourlyEmployee extends Employee{
	public int horuly_wage, hour;
	
	public HourlyEmployee(String name, String department, int horuly_wage, int hour) {
		super(name, department);
		this.horuly_wage = horuly_wage;
		this.hour = hour;
	}
	
	public int getMonthlyPay() {
		return horuly_wage * hour;
	}
}

public class EmployeeTest {
	public static void main(String[] args) {
		Employee e1 = new SalariedEmployee("홍길동", "Planning", 42000000);
		Employee e2 = new HourlyEmployee("정길동", "R&D", 20000, 120);
		
		System.out.printf("%s, 월 급여=%,d원\n", e1.toString(), e1.getMonthlyPay());
		System.out.printf("%s, 월 급여=%,d원\n", e2.toString(), e2.getMonthlyPay());
	}
}
