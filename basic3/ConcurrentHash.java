package basic3;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHash {
	public static void main(String[] args) {
		Map<Integer, String> a = new ConcurrentHashMap<>();
		a.put(2, "hello");
		a.put(5, "hi");
		a.put(8, "welcome");

		for (String x : a.values()) {
			System.out.println(x);
			a.put(10, "bye");

		}
	}

}
