package Practice;

class Book {
	public String title;
	public String name;
	public int price;
	public double actually;

	public Book(String title, String name, int price) {
		this.title = title;
		this.name = name;
		this.price = price;
	}
	
	public double discountBy(double a) {
		double M3 = a * 0.01;
	    double yourmoney = (double)price * M3;
	    double actually = (double)price - yourmoney;
	    this.actually = actually;
	    
	    return actually;
	}
	
	public void writeInfo() {
		System.out.println("����: " + title + " ����: " + name + " ����: " + (int)actually + "��");
	}
	
}
public class BookDemo {
	public static void main(String[] args) {
		Book b1 = new Book("���� �̾߱�", "��û��", 15000);
		b1.discountBy(15);
		b1.writeInfo();
	}
}
