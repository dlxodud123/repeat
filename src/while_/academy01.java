package while_;

import java.util.Scanner;

public class academy01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[6];
		int max= 0, cmt = 0, i=0;


		while (i < 5) {
			System.out.print(i+1 +"번째 수 입력 : ");
			arr[i] = sc.nextInt();
			if (arr[i]<0) {
				System.out.println("다시 입력하세요");
			}else {
				i++;
			}
		}
		// 1 7 9 7 1
		for (int j = 0; j < arr.length-1; j++) {
			
			if (arr[j] > max) {
				max = arr[j];
				cmt = j;
			}
		}
		System.out.println("최댓값 : " + max + ", " + (cmt+1) + "번째 수");
	}
}
