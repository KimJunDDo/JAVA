package Practice;

class Money {
	public int dollar;
	public int cent;
	
	public Money(String money) {
		int point = money.indexOf('.');
		String d_str = money.substring(1, point);
		String c_str = money.substring(point+1);
		int d = Integer.parseInt(d_str);
		int c = Integer.parseInt(c_str);
		this.dollar = d;
		this.cent = c;
	}
	
	public Money() {
		this.dollar = 0;
		this.cent = 0;
	}
	
	public Money(int dollar, int cent) {
		this.dollar = dollar;
		this.cent = cent;
	}
	
	public String toString() {
		return dollar + "달러" + cent + "센트";
	}
}

public class MoneyTest {
	public static void main(String[] args) {
		Money m1 = new Money("$25.54");
		System.out.println(m1);
		Money m2 = new Money();
		System.out.println(m2);
		Money m3 = new Money(85, 99);
		System.out.println(m3);
	}
}
