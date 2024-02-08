package for_;

import java.util.Scanner;

public class Quiz07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, min=0, max=0;
		System.out.print("두 수 입력 : ");
		a = sc.nextInt();
		b = sc.nextInt();
		
		if (a > b) {
			max = a;
			min = b;
			for (int i = min; i <= max; i++) {
				System.out.println(i);
			}
		}
		else {
			max = b;
			min = a;
			for (int i = min; i <= max; i++) {
				System.out.println(i);
			}
		}
	}
}
