package coding;

import java.util.HashSet;

public class Pangram {
	public static void main(String args[]) {
		String inputString = "The five boxing wizards jump quickly";

		inputString = inputString.toLowerCase().replaceAll(" ", "");

		char[] arr = inputString.toCharArray();

		HashSet<Character> set = new HashSet<>();

		for (char ch : arr) {
			set.add(ch);
		}

		if (set.size() == 26) {
			System.out.println("Input String is Pangram");
		} else {
			System.out.println("Input String is NOT Pangram");
		}
	}

}
