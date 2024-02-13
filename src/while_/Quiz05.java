package while_;

import java.util.Scanner;

public class Quiz05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.print("수 입력 : ");
		num = sc.nextInt();
		
		for (int i = 1; i <= num; i++) {
			if (num % i ==0) {
				System.out.print(i + " ");
			}
		}
	}
}
