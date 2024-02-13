package while_;

public class Quiz06 {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 1000; i++) {
			if (i % 4 == 1 && i % 6 == 1) {
				sum += i;
			}
		}
		System.out.println("합 : " + sum);
	}
}
