package while_;

public class Quiz11 {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			if (i <= 3) {
				for (int j = 1; j <= 2-(i-1) ; j++) {
					System.out.print(" ");
				}for (int j = 1; j <= 1+(2*(i-1)); j++) {
					System.out.print("*");
				}for (int j = 1; j <= 2-(i-1) ; j++) {
					System.out.print(" ");
				}
				System.out.println();
			}else { 
				for (int j = 1; j <= -3 + i; j++) {
					System.out.print(" ");
				}for (int j = 1; j <= 11 - 2*i; j++) {
					System.out.print("*");
				}for (int j = 1; j <= -3 + i; j++) {
					System.out.print(" ");
				}
				System.out.println();
			}
		}
	}
}
