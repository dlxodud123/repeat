package while_;

import java.util.Scanner;

public class academy08 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		 
		int value = (in.nextInt() * in.nextInt() * in.nextInt());
		String str = Integer.toString(value);
		in.close();
		// 34000
		for (int i = 0; i < 10; i++) {
			int count = 0;
			for (int j = 0; j < str.length(); j++) {
				if ((str.charAt(j) - '0') == i) {
					count++;
				}
			}
			System.out.println(count);
		}
	}
}
