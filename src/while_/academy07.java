package while_;

import java.util.Scanner;

public class academy07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a [] = new int [5];
		int tmp = 0;
		
		System.out.print("입력 : ");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 1 + i; j < a.length; j++) {
				if (a[i] > a[j]) {
					tmp = a[j];
					a[j] = a[i];
					a[i] = tmp;
				}
			}
			System.out.print(a[i] + ", ");
		}
	}
}
