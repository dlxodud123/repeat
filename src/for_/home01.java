package for_;

import java.util.Random;
import java.util.Scanner;

public class home01 {
	public static void main(String[] args) {
		int func, time, min, max, result;
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("원하시는 기능의 숫자를 입력해주세요 (1.사용, 2.종료): ");
			func = sc.nextInt();
			if (func == 1) {
				System.out.print("시행 횔수를 입력해주세요 : ");
				time = sc.nextInt();
				System.out.print("범위의 최소를 입력해주세요 : ");
				min = sc.nextInt();
				System.out.print("범위의 최대를 입력해주세요 : ");
				max = sc.nextInt();
				for (int i = 1; i <= time; i++) {
					result = rand.nextInt(max-min+1)+min;
					System.out.println(result);
				}
				break;
			}else if (func == 2) {
				System.out.println("종료되었습니다.");
				break;
			}else {
				System.out.println("다시 입력해주세요.");
			}
		}
	}
}
