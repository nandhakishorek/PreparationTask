package basic1;

public class StringBuf {
	public static void main(String[] args) {
		String a = "Nandha"; // String pool memory
		String a1 = new String("Nandha"); // heap memory
		System.out.println(a.hashCode());
		System.out.println(a1.hashCode());

		StringBuffer s = new StringBuffer("nandha");
		System.out.println(s.reverse());
		;
		System.out.println(s.append("kishore"));
		System.out.println(s.hashCode());

		StringBuilder sb = new StringBuilder("java");
		System.out.println(sb.append("developer"));

	}
}
