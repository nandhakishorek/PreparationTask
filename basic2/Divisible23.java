package basic2;

import java.util.ArrayList;
import java.util.List;

public class Divisible23 {
	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<>();
		nums.add(2);
		nums.add(4);
		nums.add(18);
		nums.add(7);
		nums.add(9);
		nums.add(12);

		Divisible d = (a) -> {
			a.stream().filter(b -> b % 2 == 0 && b % 3 == 0).forEach(z -> System.out.println(z));

		};
		d.divisible(nums);
	}

}
