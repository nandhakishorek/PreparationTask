package coding;

public class NumWords {
	public static void main(String[] args) {

		int number = 181;

		String text = convertNumberToText(number);

		System.out.println(text);

	}

	public static String convertNumberToText(int number) {

		String[] units = { "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven",

				"twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen" };

		String[] tens = { "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety" };

		String text = "";

		if (number == 0) {

			return "zero";
		}
		if (number < 0) {
			text = "Minus ";
			number = -number;
		}
		if ((number / 100) > 0) {

			text += units[number / 100] + " hundred";
			number %= 100;
		}
		if (number > 0) {
			if (!text.isEmpty()) {
				text += " and ";
			}
			if (number < 20) {
				text += units[number];
			} else {
				text += tens[number / 10];
				if ((number % 10) > 0) {
					text += units[number % 10];
				}
			}
		}
		return text;
	}
}
