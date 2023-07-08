package coding;

import java.util.Arrays;
import java.util.List;

public class FiveNumPrint {
	public static void main(String[] args) {

		List<Integer> s = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

		for (int i = 0; i < s.size(); i++) {

			for (int j = 0; j < s.size(); j++) {

				if (s.get(i) + s.get(j) == 5) {

					System.out.println(s.get(i) + "+" + s.get(j) + "=" + (s.get(i) + s.get(j)));
				}
			}
		}

	} 

}
