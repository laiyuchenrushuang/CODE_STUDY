package 队列;

import java.util.ArrayDeque;

public class Test {

	public static void main(String[] args) {
		ArrayDeque<BaseSyncTask> pendingQueue = new ArrayDeque<>();
		
		final BaseSyncTask task = new BaseSyncTask() {
            @Override
            public void doTask() {
            	System.out.println("任务1");
            }
        };
        MyThread m = new MyThread();
        
        m.start();
        
        try {
			Thread.sleep(50);
			m.setFlag(false);
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        m.setFlag(true);
	}

}

