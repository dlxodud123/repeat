package for_;

public class Quiz06 {
	public static void main(String[] args) {
		int oddSum = 0;
		for (int i = 1; i <=100000000 ; i++) {
			if (i%2 == 1) {
				oddSum += i;
				if (oddSum > 10000) {
					System.out.println("홀수 값 : " + i);	
					break;
				}
			break;	
			}

		}
		
	}
}
