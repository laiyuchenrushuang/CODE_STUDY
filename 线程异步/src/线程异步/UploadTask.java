package 线程异步;

import java.util.ArrayList;

public class UploadTask implements Runnable {
	ArrayList<String> data;

	UploadTask(ArrayList<String> data) {
		this.data = data;
	}

	@Override
	public void run() {
		for (String s : data) {
			System.out.println("异步处理任务 : " + s);
		}

	}

}
