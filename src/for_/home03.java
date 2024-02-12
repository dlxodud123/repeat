package for_;

import java.util.Random;
import java.util.Scanner;

public class home03 {
	public static void main(String[] args) {
		int func, result;
		String sum = "", XO;
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();

		while (true) {
			System.out.print("1. 윷던지기, 2.게임 종료하기 : ");
			func = sc.nextInt();
			if (func == 1) {
				for (int i = 1; i <= 4; i++) {
					result = rand.nextInt(2);
					if (result == 0) {
						XO = "X";
					}else {
						XO = "O";
					}
					sum += XO;
				}
				System.out.println(sum);
				sum = "";
			}else if (func == 2) {
				System.out.println("게임이 종료되었습니다.");
				break;
			}else {
				System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
			}
		}
	}
}
