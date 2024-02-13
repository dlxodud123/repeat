package while_;

import java.util.Scanner;

public class Quiz09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.print("수 입력 : ");
		num = sc.nextInt();
		
		for (int i = 2; i <= num; i++) {
			int j;
			for (j = 2; j <= i; j++) {
				if (i % j == 0) {
					break;
				}
			}
			
			if (i == j) {
				System.out.println(i);
			}
		}
	}
}
