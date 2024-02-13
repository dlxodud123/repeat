package while_;

import java.util.Random;

public class academy02 {
	public static void main(String[] args) {
		int max = 0, min = 100;
		int arr [] = new int [10];
		Random rand = new Random();
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(10)+1;
			if (max < arr[i]) {
				max = arr[i];
			}if (min > arr[i]) {
				min = arr[i];
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			System.out.println();
		}
		System.out.println(max +"  " + min);
		
	}
}
