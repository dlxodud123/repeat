package for_;

import java.util.Scanner;

public class Quiz11 {
	public static void main(String[] args) {
		int score;
		Scanner sc = new Scanner(System.in);
		
		for (int i = 1; i <= 5; i++) {
			System.out.print(i + "번 학생 점수 입력 : ");
			score = sc.nextInt();
			if (score >= 65) {
				System.out.println("합격입니다");
			}else {
				System.out.println("불합격입니다");
			}
		}
	}
}
