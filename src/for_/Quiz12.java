package for_;

import java.util.Scanner;

public class Quiz12 {
	public static void main(String[] args) {
		int score;
		Scanner sc = new Scanner(System.in);

		
		while (true) {
			System.out.print("점수 입력 : ");
			score = sc.nextInt();
			if (score >= 80 && score <= 100) {
				System.out.println("합격!");
			}else if (score >= 0 && score < 80) {
				System.out.println("불합격.");
			} else {
				break;
			}
		}
		
	}
}
