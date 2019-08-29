package �߳��첽;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Test {

	public static void main(String[] args) {

		ArrayList<String> data = new ArrayList<>();
		data.add("1");
		data.add("2");
		data.add("3");
		data.add("4");
		data.add("5");
		UploadTask upload = new UploadTask(data);
		new Thread(upload).start();
		System.out.println("���������� ������������");
		System.out.println("----------------------------------------------");

		// �̳߳� ThreadPoolExecutor���
		ExecutorService cachedThreadPool = Executors.newFixedThreadPool(3);
		for (int i = 0; i < 10; i++) {

			cachedThreadPool.execute(new Runnable() {

				@Override
				public void run() {
					try {
						System.out.println(Thread.currentThread().getName() + "���ڱ�ִ��");
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			});
		}

		
		
	}

}
