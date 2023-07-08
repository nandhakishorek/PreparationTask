package basic2;

public class NotVowel {
	public static void main(String[] args) {
		String[] words = { "sun", "moon", "sky","xyz" };
		Vowel notVowel = (a) -> {
			for (String a1 : a) {
				if (a1.contains("a") || a1.contains("e") || a1.contains("i") || a1.contains("o") || a1.contains("u")) {
				} else {
					System.out.println(a1);
				}
			}
		};
		notVowel.findNotVowels(words);
	}
}
