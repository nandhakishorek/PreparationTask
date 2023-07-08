package coding;

import java.util.Arrays;

public class StringNumSort {

	public static void main(String[] args) {
		
		String a = "2,1,4,6,8,3";
		String[] b = a.split(",");
		Arrays.sort(b);
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + ",");

		}
	}

}
