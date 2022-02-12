package practice;

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
	
	public Money(int dollar, int cent) {
		this.dollar = dollar;
		this.cent = cent;
	}
	
	public int dollar() {
		return dollar;
	}
	
	public int cent() {
		return cent;
	}
	
	public Money add(Money i) {
			return new Money(dollar() + i.dollar() + 1, cent() + i.cent() - 100);
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