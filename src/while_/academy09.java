package while_;

import java.util.Random;

public class academy09 {
	public static void main(String[] args) {
		Random rand = new Random();
		int a [] = new int [5];
		int sum = 0;
		
		for (int i = 0; i < a.length; i++) {
			a[i] = rand.nextInt(10)+1;
			System.out.println((i+1) + "번째 학생의 사탕 개수 : " + a[i]);
			sum += a[i];
		}
		System.out.println("\n사탕의 총 갯수 : " + sum);
		System.out.println("각 학생이 받을 사탕 : " + (sum/a.length));
	}
}
