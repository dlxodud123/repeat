package while_;

import java.util.Scanner;

public class academy06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr [] = new int [5];
		int tmp;
		
		System.out.print("입력 : ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < 5; i++) {
			for (int j = i + 1; j < 5; j++) {
				if (arr[i] < arr[j]) {
					tmp = arr[j];
					arr[j] = arr[i];
					arr[i] = tmp;
				}
			}
			System.out.println((i+1) + "번째 : " + arr[i]);
		}
				
	}
}
