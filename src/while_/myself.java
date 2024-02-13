package while_;

import java.util.Random;

public class myself {
	public static void main(String[] args) {
		int a1, a2;
		Random rand = new Random();
		int arr [][]= {{1,2,3},{4,5,6},{7,8,9}};
		
		for (int i = 1; i <= 3; i++) {
			a1 = rand.nextInt(3);
			a2 = rand.nextInt(3);
			if (arr[a1][a2] % 2 == 0) {
				System.out.println("짝수 => " + arr[a1][a2]);
			}else {
				System.out.println("홀수 => " + arr[a1][a2]);
			}
		}
	}
}
