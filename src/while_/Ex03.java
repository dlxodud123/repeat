package while_;

public class Ex03 {
	public static void main(String[] args) {
		int i = 0;
		while (i < 5) {
			i++;
			if (i == 3) {
				System.out.println("3333333333333");
				continue;
			}
			System.out.println("i : " + i);
		}
		System.out.println("다음 문장들 실행");
	}
}
