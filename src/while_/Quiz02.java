package while_;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		int mon, menu, tmp;
		Scanner sc = new Scanner(System.in);
		System.out.print("요금을 투입 하세요 >>> ");
		mon = sc.nextInt();

		while (true) {
			System.out.println("=====자판기=====\n\n1.커피(200), 2.코코아(250), 3.반환, 4.종료");
			System.out.print("메뉴를 선택하세요 >>> ");
			menu = sc.nextInt();
			if (menu == 4) {
				System.out.println("종료되었습니다");
				break;
			}else {
				switch (menu) {
				case 1:
					if (mon >= 200) {
						System.out.println("맛있게 드세요");
						mon -= 200;
						continue;
					}else {
						System.out.println("요금이 부족합니다");
					}
					break;
				case 2:
					if (mon >= 250) {
						System.out.println("맛있게 드세요");
						mon -= 250;
						continue;
					}else {
						System.out.println("요금이 부족합니다");
					}
					break;
				case 3:
					System.out.println("거스름돈 : " + mon); break;
				default:
					System.out.println("1 ~ 4사이만 입력해주세요");
					break;
				}
			}
		}
	}
}
