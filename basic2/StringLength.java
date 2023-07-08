package basic2;

import java.util.List;

public class StringLength {
	public void findStringLength(List<String> a) {
		a.stream().filter(b->b.length()>4).forEach(z->System.out.println(z));
	}

}
