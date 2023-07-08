package basic1;

import com.onesoft.c_Exception_.NameException;

public class CheckName {
	public static void main(String[] args) throws NameException {
		String a = "Nandha";
		try {
			if (a.startsWith("a") == true) {
				System.out.println("It is starts with A");
			} else {
				throw new NameException("Not starts with A");
			}
		} finally {
			System.out.println(a);
		}
	}
}