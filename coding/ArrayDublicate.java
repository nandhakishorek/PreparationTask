package coding;

public class ArrayDublicate {
	public static void main(String[] args) {
		int[] a = { 2, 6, 7, 8, 10, 15, 2, 10, 2 };
		for (int i = 0; i < a.length; i++) {
			int count = 1;
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					count++;
					a[j] = 'a';
				}
			}
			if (count > 1 && a[i] != 'a') {
				System.out.println(a[i] + "-" + count);
			}

		}
	}

}
