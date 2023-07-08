package basic2;

import java.util.Optional;

public class Optionall {
	public static void main(String[] args) {
		String a = "null";
		Optional<String> a1 = Optional.of(a);
		System.out.println(a1);
		Optional<String> a2 = Optional.ofNullable(a);
		System.out.println(a2);
		Optional<String> a3 = Optional.empty();
		System.out.println(a3);

	}

}
