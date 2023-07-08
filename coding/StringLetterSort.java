package coding;

import java.util.Arrays;

public class StringLetterSort {
	public static void main(String[] args) {
		String a = "andha";
		char[] a1 = a.toCharArray();
		Arrays.sort(a1);
		String temp = "";
		for (Character x : a1) {
			temp = temp + x;
		}
		System.out.println(temp);

	}

}
