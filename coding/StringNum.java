package coding;

public class StringNum {
	public static void main(String[] args) {
		String a = "1+3-2";
		String[] val = a.split("[+-]");
		String[] oper = a.split("\\d+");
		int res = Integer.parseInt(val[0]);
		for (int i = 1; i < val.length; i++) {
			if (oper[i].equals("+")) {
				res += Integer.parseInt(val[i]);
			} else {

				res -= Integer.parseInt(val[i]);
			}
		}
		System.out.println(res);
	}
}
