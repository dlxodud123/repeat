package for_;

import java.util.Scanner;

public class Quiz05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int time, num1, num2;
		System.out.print("횟수 입력 : ");
		time = sc.nextInt();
		
		for (int i = 1; i <= time; i++) {
			System.out.print("두 개의 숫자 입력 : ");
			num1 = sc.nextInt();
			num2 = sc.nextInt();
			if (i % 4 == 1) {
				System.out.println("덧셈 결과 : " + (num1 + num2));
			}else if (i % 4 == 2) {
				System.out.println("뺄셈 결과 : " + (num1 - num2));
			}else if (i % 4 == 3) {
				System.out.println("곱셈 결과 : " + (num1 * num2));
			}else if (i % 4 == 0) {
				while (true) {
					if (num1 < num2 ) {
						System.out.print("두 개의 숫자 입력 : ");
						num1 = sc.nextInt();
						num2 = sc.nextInt();
					}else {
						break;
					}
				}
				System.out.println("나눗셈 결과 : " + (num1 / num2));
			}
		}
		
	}
}
