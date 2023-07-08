package basic3;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Listclass {
	public static void main(String[] args) {
		List<String> a = new CopyOnWriteArrayList<>();
		a.add("hello");
		a.add("hi");
		a.add("welcome");

		for (int i=0;i<a.size();i++) {
			System.out.println(a.get(i));
			a.remove(1);
		}
		a.forEach(b -> System.out.println(b));

	}

}
