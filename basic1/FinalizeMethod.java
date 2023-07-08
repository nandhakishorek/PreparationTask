package basic1;

public class FinalizeMethod {
	@Override
	public void finalize() {
		System.out.println("Collected");

	}

	public static void main(String[] args) {
		FinalizeMethod f1 = new FinalizeMethod();
		System.out.println(f1.hashCode());
		f1 = new FinalizeMethod();
		System.out.println(f1);
		System.gc();
	}

}
