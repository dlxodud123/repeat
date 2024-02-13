package while_;


public class academy11 {
	public static void main(String[] args) {
		int numbers [] = {5, 1, 9, 3, 7, 2};
		int max = numbers[0], min = numbers[0] ;
		
		for (int i = 0; i < numbers.length; i++) {

			if (numbers[i] > max ) {
				max = numbers[i];
			}if (numbers[i] < min) {
				min = numbers[i];
			}
		}
		System.out.println("최댓값 : " + max + ", 최솟값 : " + min);
	}
}
