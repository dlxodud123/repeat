package while_;

public class Ex07 {
	public static void main(String[] args) {
		String n1 = "abcd", n2 = "test";
		int num = 1000;
		//System.out.println(n1.endsWith(n2));
		System.out.println(n2.equals(n1));
		if (n1 == null) {
			System.out.println("n1 입력하세요");
		}else {
			if (n1.equals(n2)) {
				System.out.println("두 문자열은 같다");
			}else {
				System.out.println("다르다");
			}
		}
	}
}
