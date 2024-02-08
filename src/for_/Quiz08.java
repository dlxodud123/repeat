package for_;

public class Quiz08 {
	public static void main(String[] args) {
		int n1, n2, n3;
		for (int i = 100; i <= 500; i++) {
			n1 = i / 100;
			n2 = (i % 100) / 10;
			n3 = i % 10;
			if (n1 * n1 * n1 + n2 * n2 * n2 + n3 * n3 * n3 == i) {
				System.out.print(i + " ");
			}
		}
	}

}

