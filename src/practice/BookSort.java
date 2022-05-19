package practice;

import java.util.Arrays;

class Book implements Comparable {
	private String name;
	private int price;
	
	public Book(String name, int price) {
		this.name = name;
		this.price = price;
	}

	@Override
	public int compareTo(Object o) {
		if(o != null && o instanceof Book) {
			Book b = (Book) o;
			if(this.price > b.price)
				return 1;
			else if(this.price < b.price)
				return -1;
			else
				return 0;
		}
		else
			return -1;
	}
	public String toString() {
		return "제목=" + name + ", 가격=" + price;
	}
}

public class BookSort {
	public static void main(String[] args) {
		
		Book[] list = new Book[4];
		list[0] = new Book("자바 프로그래밍", 28000);
		list[1] = new Book("인류의 대항해", 21600);
		list[2] = new Book("장사란 무엇인가", 12000);
		list[3] = new Book("상처받지 않는 영혼", 24000);
		
		Arrays.sort(list);
		for(Book b:list)
			System.out.println(b);
	}
}
