package basic1;

public class ThreadExtend  extends Thread{
	public void run() {
		System.out.println("Hello");
	}

	public static void main(String[] args) {
		ThreadExtend t = new ThreadExtend();
		t.start();
	}
	

}
