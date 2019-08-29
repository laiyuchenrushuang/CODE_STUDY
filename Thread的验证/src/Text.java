
public class Text {

	public static void main(String[] args) {

		MyThread thread = new MyThread();
		thread.start();
  
		
		stopThread(thread);
	}

	private static void stopThread(MyThread thread) {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		thread.stop();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		MyThread thread1 = new MyThread();
		thread1.start();
	}
}
