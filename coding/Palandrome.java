package coding;

public class Palandrome {
	public static void main(String[] args) {
		String a = "nandha";
		String temp = "";
		for (int i = a.length() - 1; i >= 0; i--) {
			temp = temp + a.charAt(i);
		}
		if (temp.equalsIgnoreCase(a)) {
			System.out.println(a + " is palandrome");
		} else {
			System.out.println(a + " is not a palandrome");
		}
	}

}
