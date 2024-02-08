package for_;

import java.util.Scanner;

public class Quiz13 {
	public static void main(String[] args) {
		int num = 0, sum = 0;
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("숫자를 입력 : ");
			num = sc.nextInt();
			if (num < 1 || num > 20) {
				System.out.println("입력받는 숫자는 1~20사이의 값이어야한다.");
			}else if (num%2==0) {
				sum += num;
			}else {
				sum -= num;
			}

			if (sum > 100 || sum < 0) {
				System.out.println("더해지거나 뺀 값은 0미만, 100초과가 될 수 없습니다.");
			}
			else if (sum == 100) {
				System.out.println("끝");
			}else {
				System.out.println("현재 더해진 값은 : " + sum);
			}

		}
	}
}
