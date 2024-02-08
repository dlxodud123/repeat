package for_;

import java.util.Scanner;

public class Quiz10 {
	public static void main(String[] args) {
		int a, b, test;
		Scanner sc = new Scanner(System.in);
		System.out.println("개수");
		test = sc.nextInt();
		
		for (int i = 1; i <= test; i++) {
			System.out.println("두 수 입력 : ");
			a = sc.nextInt();
			b = sc.nextInt();
			System.out.println("답 : "+ (a + b));
		}
		
		
	}
}
