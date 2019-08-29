package 子线程里面开启线程;

public class Task implements Runnable {

	@Override
	public void run() {
		System.out.println("Hello LYC");
	}
}
