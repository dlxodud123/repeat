package while_;

import java.util.Random;
import java.util.Scanner;

public class academy03 {
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		int func, com, cmt = 0, dap;
		com = rand.nextInt(50)+1;
		System.out.print("1. 게임 시작\n2. 기록 확인\n3. 게임 종료\n"
				+ "번호를 선택하시오 >> ");
		func = sc.nextInt();
		
		if (func == 1) {
			while (true) {
				System.out.print("정답 입력 : ");
				dap = sc.nextInt();
				if (dap == com) {
					System.out.println("정답입니다 !!");
					break;
				}else {
					if (dap < com) {
						
						cmt++;
					}else if (dap > com) {
						
						cmt++;
					}
					continue;
				}
			}
		}else if (func == 2) {
			System.out.println("이전 기록은 " + cmt + "회 입니다.");
		}else if (func == 3) {
			System.out.println("게임 종료");
		}
		
	}
}
