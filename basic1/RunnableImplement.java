package basic1;

public class RunnableImplement implements Runnable {
	@Override
	public void run() {
		synchronized (RunnableImplement.class) {
			System.out.println("Thread is running");
			try {
				RunnableImplement.class.wait(5000);
				System.out.println("Hello");
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {
		RunnableImplement t = new RunnableImplement();
		Thread t1 = new Thread(t);
		t1.start();
		Thread.sleep(2000);
		synchronized (t1) {
			t1.notify();
		}
		System.out.println("Hi");
	}

}
