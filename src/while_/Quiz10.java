package while_;

import java.util.Scanner;

public class Quiz10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, sum = 0;
		System.out.print("수 입력 : ");
		num = sc.nextInt();
		
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					sum += j;
				}
			}
			if ((sum - i) == i) {
				System.out.println(i);
			}
			sum = 0;
		}
		
	}
}
// 1 2 4 7 14 28
