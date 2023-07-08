package basic2;

import java.util.ArrayList;
import java.util.List;

public class MainLength {
	public static void main(String[] args) {
		StringLength s = new StringLength();
		FindStringLength f = s::findStringLength;
		List<String> words = new ArrayList<>();
		words.add("moon");
		words.add("Onesoft");
		words.add("technology");
		words.add("sky");
		f.findlength(words);
		
	}

}
