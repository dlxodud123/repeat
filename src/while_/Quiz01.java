package while_;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		int func;
		String id="", pw="", exid=null, expw=null;
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("1.로그인\n2.회원가입\n3.나가기\n>>> ");
			func = sc.nextInt();
			if (func == 1) {
				if (id.equals("") || pw.equals("")) {
					System.out.println("회원가입을 하세요");
					continue;
				}
				System.out.print("아이디 : ");
				exid = sc.next();
				System.out.print("비밀번호 : ");
				expw = sc.next();
				if (!(exid.equals(id))) {
					System.out.println("아이디가 틀렸습니다");
				}
				if (!(expw.equals(pw))) {
					System.out.println("비밀번호가 틀렸습니다");
				}
				else if (exid.equals(id)&&expw.equals(pw)) {
					System.out.println("로그인 성공");
					break;
				}else {
					System.out.println("로그인 실패");
				}
			}else if (func == 2) {
				System.out.print("회원가입 아이디 : ");
				id = sc.next();
				System.out.print("회원가입 비밀번호 : ");
				pw = sc.next();
			}else if (func == 3) {
				System.out.println("나가기 !!");
				break;
			}else {
				System.out.println("1 ~ 3까지 눌러주세요");
			}
		}
	}
}
