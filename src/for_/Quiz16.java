package for_;

import java.util.Scanner;

public class Quiz16 {
	public static void main(String[] args) {
		int dan;
		Scanner sc = new Scanner(System.in);
		System.out.print("구구단 입력 : ");
		dan = sc.nextInt();
		
		for (int i = 1; i <= dan; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + " * " + j + " = " + (i*j));
			}
		}
	}
}
