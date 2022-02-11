package Practice;

class Money {
	private int dollar;
	private int cent;
	
	public Money(String money) {
		int point = money.indexOf('.');
		String d_str = money.substring(1, point);
		String c_str = money.substring(point+1);
		int d = Integer.parseInt(d_str);
		int c = Integer.parseInt(c_str);
		this.dollar = d;
		this.cent = c;
	}
	
	public Money(int dollar, int cent) {
		this.dollar = dollar;
		this.cent = cent;
	}
	
	public add(Money i) {
		this.dollar += i.dollar;
		this.cent += i.cent;
	}
	
	public String toString() {
		return dollar + "달러" + cent + "센트";
	}
	
}

public class MoneyTest2 {
	public static void main(String[] args) {
	Money m1 = new Money("$25.54");
	Money m2 = new Money(35, 84);
	Money m3 = m1.add(m2);
	System.out.println(m3);
	}
}
