package while_;

import java.util.Scanner;

public class Ex11 {
	public static void main(String[] args) {
		String asd = null;
		Scanner sc = new Scanner(System.in);
		System.out.print("짝수 홀수 입력 : ");
		asd = sc.next();
		int arr [] = {10, 54 ,13, 17, 25, 30};
		
		for (int i = 0; i < arr.length; i++) {
			if (asd.equals("짝수")) {
				if (arr[i] % 2 == 0) {
					System.out.println("짝수 : " + i + ", " + arr[i]);
				}
			}else if (asd.equals("홀수")) {
				if (arr[i] % 2 == 1){
					System.out.println("홀수 : " + i + ", " + arr[i]);
				}
			}

		}
	}
}
