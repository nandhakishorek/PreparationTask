package basic3;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayToList {
	public static void main(String[] args) {
		
		String[] a = { "one", "soft", "technologies" };
		// Convert Array to arrayList
		ArrayList<String> a1 = new ArrayList<>(Arrays.asList(a));
		System.out.println(a1);

		ArrayList<String> b = new ArrayList<>();
		b.add("one");
		b.add("soft");
		b.add("technologies");

		// Convert ArrayList to array
		String[] b1 = b.toArray(new String[b.size()]);
		for (String a2 : b1) {
			System.out.println(a2);
		}
	}
}
