package coding;

import java.util.Arrays;

public class Arraysort {
	public static void main(String[] args) {

		int[] a = { 2, 6, 7, 8, 10, 15, 2 };

//		Arrays.sort(a);
//		for (Integer x : a) {
//			System.out.println(x);
//		}

		int temp = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 1; j < a.length - i; j++) {
				if (a[j - 1] > a[j]) {
					temp = a[j - 1];
					a[j - 1] = a[j];
					a[j] = temp;
				}
			}
		}
		for (Integer x : a) {
			System.out.println(x);
		}
		System.out.println("Second largest  " + a[a.length - 2]);

	}

}
