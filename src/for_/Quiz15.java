package for_;

import java.util.Scanner;

public class Quiz15 {
	public static void main(String[] args) {
		int user = 0, com=34;
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 맞추기 게임 시작합니다 (1~100)");
		if (com % 2 == 0) {
			System.out.println("짝수입니다.");
		}else {
			System.out.println("홀수입니다.");
		}
		
		while (user != com) {
			System.out.print("숫자 입력 (1~100) : ");
			user = sc.nextInt();
			if (user > com) {
				System.out.println("더 작은수입니다");
			}else if (user < com) {
				System.out.println("더 큰수입니다");
			}
		}
		System.out.println("정답입니다 !");	
	}
}
