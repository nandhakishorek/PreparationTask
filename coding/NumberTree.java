package coding;

public class NumberTree {

	public static void main(String args[]) {

		int num = 5;
//Forward
//		for (int i = 1; i <= num; i++) {
//			for (int j = 1; j <= i; j++) {
//				System.out.print(i);
//			}
//			System.out.println();
//		}

//reverse

		for (int i = num; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

}
