package while_;

public class academy04 {
	public static void main(String[] args) {
		String arr [] = {"a", "b", "c", "d", "e"};
		String brr [] = new String [5];
		for (int i = 0; i < arr.length; i++) {
			brr[i] = arr[4-i];
			System.out.print(brr[i]+", ");
		}
		
	}
}
