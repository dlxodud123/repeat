package while_;

import java.util.Scanner;

public class Quiz04 {
	public static void main(String[] args) {
		int num1, num2, small, big, aaa = 0, AAA;
		Scanner sc = new Scanner(System.in);
		System.out.print("두 수 입력 : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		if (num1 > num2) {
			small = num2;
			big = num1;
		}else {
			small = num1;
			big = num2;
		}
		for (int i = 1; i <= small; i++) {
			if (small % i == 0 && big % i == 0) {
				aaa = i;
			}
		}
		AAA = small * big / aaa;
		
		System.out.println(aaa + "   " + AAA);
		
		
		
	}
}
