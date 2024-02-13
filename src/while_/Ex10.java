package while_;

public class Ex10 {
	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {
			System.out.println("--상위 반복문 시작--");
			for (int j = 0; j < 3; j++) {
				System.out.println(j + ".for");
			}
			System.out.println("상위 반복문 끝 --");
		}
		System.out.println("다음 문장 실행");
	}
}
