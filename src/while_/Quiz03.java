package while_;

public class Quiz03 {
	public static void main(String[] args) {
		int ssal = 100000, mouse = 2, eat = 20, day = 0;
		while (ssal > 0) {
			ssal -= mouse * eat;
			if (day % 10 == 0) {
				mouse *= 2;
			}
			day++;
		}
		System.out.println("날짜 : " + day + ", 쥐 : " + mouse);
	}
}
