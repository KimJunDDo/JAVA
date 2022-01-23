package practice;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MaxMinAvg {

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		System.out.println("양의 정수들을 입력하시오.(입력의 끝은 -1)");
		
		boolean run = true;
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		double sum = 0;
		do {
			int a = num.nextInt();

			if(a != -1) {
				list.add(a);
				sum += a;
			}
			else if(a == -1) {	
				run = false;
			}

		} while(run);
		
		int max = Collections.max(list);
		int min = Collections.min(list);
		double avg = sum / list.size();
		
		System.out.println("최대값="+max+", 최소값="+min+", 평균값="+avg);
	}
}
