package while_;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, sum = 0;
		while (true) {
			System.out.println("1 ~ 10 사이 수 입력 : ");
			i = sc.nextInt();
			if (i > 0 && i <= 10) {
				break;
			}else if (i <= 0 || i > 10) {
				System.out.println("범위를 벗어남, 다시입력");
				continue;
			}
			System.out.println("while 다시 실행");
		}
		for (int j = 1; j <= i; j++) {
			sum += j;
		}
		System.out.println("1 ~ " + i + "까지의 합 : " + sum);
	}
}
