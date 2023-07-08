package coding;

public class A3b2c4 {
	public static void main(String[] args) {
		String word = "a3b2c4";
		for (int i = 0; i < word.length(); i++) {
			if (Character.isAlphabetic(word.charAt(i))) {
				// System.out.print(word.charAt(i));
			} 
			else {
				int num = Character.getNumericValue(word.charAt(i));
				for (int j = 0; j < num; j++) {
					System.out.print(word.charAt(i - 1));
				}
			}
		}
	}

}
