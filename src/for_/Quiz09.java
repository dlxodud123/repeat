package for_;

import java.util.Scanner;

public class Quiz09 {
	public static void main(String[] args) {
		int student, kor, sum = 0, avg;
		Scanner sc = new Scanner(System.in);
		System.out.println("총 학생 수 : ");
		student = sc.nextInt();
		
		for (int i = 1; i <= student; i++) {
			System.out.println(i + "번 학생 국어 성정 : ");
			kor = sc.nextInt();
			while (kor > 100) {
				System.out.println(i + "번 학생 국어 성정 : ");
				kor = sc.nextInt();
			}
			sum += kor;
		} 
		avg = sum / student;
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
	}
}
