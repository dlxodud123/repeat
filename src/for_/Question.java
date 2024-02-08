package for_;

import java.util.Random;

public class Question {
	public static void main(String[] args) {
		System.out.println("2조 4번, 1조 3번, 6조 2번, 6조 3번");
		Random random = new Random();
		int result = random.nextInt(2)+1;// 0이상 2미만 / (0, 1) -> (1, 2)
	}
}
