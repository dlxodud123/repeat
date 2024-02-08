package for_;

public class Ex06 {
	public static void main(String[] args) {
		int evenSum = 0, oddSum = 0, sum=0;
		for (int i = 0; i <= 10; i++) {
			sum += i;
			if (i % 2 == 0) {
				evenSum += i;
			}else {
				oddSum += i;
			}
		}
		System.out.println("짝수 합 : " + evenSum);
		System.out.println("홀수 합 : " + oddSum);
		System.out.println("1 ~ 10총합 : " + sum);
	}
}
