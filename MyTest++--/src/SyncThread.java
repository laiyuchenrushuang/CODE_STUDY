/**
 * 同步线程
 */
class SyncThread implements Runnable {

	private static int count;
	private final String TAG = "SyncThread";
	static SyncThread instance;

	public static SyncThread getInstance() {
		if (instance == null) {
			System.out.println("aaa"+new SyncThread());
			return new SyncThread();
		} else {
			System.out.println("aaa"+instance);
			return instance;
		}
	}

	public SyncThread() {
		count = 0;
		System.out.println("我执行了，count=" + count);
	}

	public void run() {
		System.out.println("lylog+"+this);
		synchronized (this) {
			for (int i = 0; i < 5; i++) {
				try {
					System.out.println(Thread.currentThread().getName() + ":" + (count++));
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}