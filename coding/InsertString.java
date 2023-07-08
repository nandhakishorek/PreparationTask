package coding;

public class InsertString {
	public static void main(String args[]) {
		String a = "java";
		String b = "developer";
		StringBuilder sb = new StringBuilder(a);
		sb.insert(a.length() / 2, b);
		System.out.println(sb);
	}
}