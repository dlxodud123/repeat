package for_;

import java.util.Random;
import java.util.Scanner;

public class home02 {
	public static void main(String[] args) {
		int heart = 5, num, com;
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		com = rand.nextInt(10);

		for (int i = 1; i <= 5; i++) {

			System.out.println("현재 목숨 : " + heart);
			System.out.print("숫자를 맞추세요(0~9) : ");
			num = sc.nextInt();
			System.out.println();
			if (num == com) {
				System.out.println("=====숫자를 맞추셨습니다=====");
				System.out.println("맞춘 숫자 : " + com);
				System.out.println("추측 횟수 : " + (6-heart));
			}else if (num != com) {
				System.out.println("추측 실패, 목숨 -1");
				System.out.println();
				if (heart == 1) {
					System.out.println("목숨이 모두 닳았습니다");
					System.out.println("정답은 " + com + "입니다.");
				}
			}
			heart--;
			
		}

	}
}
