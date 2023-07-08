package basic1;

public class StaticKey {
	public static void main(String[] args) {
		StaticKey s = new StaticKey();
		//System.out.println(StaticKey.a);

	}

	 int a = 0;

	public StaticKey() {
		a++;
		System.out.println(a);
	}

	static {
		System.out.println("This is static block");
	}

}
