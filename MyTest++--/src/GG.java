
import java.lang.Thread.State;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.xml.crypto.Data;

public class GG {
	static int data = 0;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SyncThread syncThread = SyncThread.getInstance();
		SyncThread syncThread1 = SyncThread.getInstance();
		System.out.println(syncThread);
		System.out.println(syncThread1);
		Thread thread1 = new Thread(syncThread, "JACK");
		Thread thread2 = new Thread(syncThread1, "ROSE");
		thread1.start();
		thread2.start();
		
		System.out.println(Math.cos(Math.PI*2/6));
	}	
	
}