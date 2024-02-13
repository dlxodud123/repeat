package while_;

import java.util.Random;

public class academy10 {
	public static void main(String[] args) {
		Random rand = new Random();
		int a [] = new int [9];
		int max = 0, tmp2 = 0;
		
		for (int i = 0; i < a.length; i++) {
			a[i] = rand.nextInt(100)+1;
			System.out.print(a[i]+" ");
		}
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
				tmp2 = i+1;
			}
		}
		System.out.println("\n최대값 : " + max + ", 몇번째 : " + tmp2);
	}
}
