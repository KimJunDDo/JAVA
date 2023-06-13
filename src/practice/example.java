package example;

import java.util.Arrays;

class MyScore implements Comparable {
	private String name;
	private double avg;
	
	public MyScore(String name, int score) {
		this.name = name;
		this.avg = (double)score;		
	}
	
	public MyScore(String name, int score, int score2) {
		this.name = name;
		this.avg= (double)(score + score2) / (double)2;
	}
	
	public MyScore(String name, int score, int score2, int score3) {
		this.name = name;
		this.avg= (double)(score + score2 + score3) / (double)3;
	}
	
	@Override
	public int compareTo(Object o) {
		if(o != null && o instanceof MyScore) {
			MyScore s = (MyScore) o;
			if(this.avg > s.avg)
				return -1;
			else if(this.avg < s.avg)
				return 1;
			else
				return 0;
		}
		else
			return -1;
	}
	
	public String toString() {
		String avg2 = String.format("%.2f", avg);
	    return name + ", 점수=" + avg2;
	}
}

public class example {
	public static void main(String[] args) {
		MyScore[] list = new MyScore[4];
		list[0] = new MyScore("김길동", 92);
		list[1] = new MyScore("정길동", 78, 93, 88);
		list[2] = new MyScore("오길동", 89, 96);
		list[3] = new MyScore("정길동", 87, 90, 91);
		
		Arrays.sort(list);
		for(int i = 0; i<list.length; i++)
			System.out.println((i+1) + ": " + list[i]);
	}
}
