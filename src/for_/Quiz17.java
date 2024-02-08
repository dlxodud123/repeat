package for_;

import java.util.Random;

public class Quiz17 {
	public static void main(String[] args) {
		Random random = new Random();
		int result = random.nextInt(3)+1;
		System.out.println(result);
	}
}
