package basic3;

import java.util.Hashtable;

public class HashTab {
	public static void main(String[] args) {
		Hashtable<Integer, String> a = new Hashtable<>(10);
		a.put(101, "nandha");
		a.put(102, "kishore");
		a.put(103, "lokesh");
		a.put(104, "murali");
		a.put(105, "hari");
		a.put(106, "viji");
		for (Integer x : a.keySet()) {
			System.out.println(a.get(x)+" "+a.hashCode()%10);
		
		}

	}

}
