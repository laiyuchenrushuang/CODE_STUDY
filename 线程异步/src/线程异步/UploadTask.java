package �߳��첽;

import java.util.ArrayList;

public class UploadTask implements Runnable {
	ArrayList<String> data;

	UploadTask(ArrayList<String> data) {
		this.data = data;
	}

	@Override
	public void run() {
		for (String s : data) {
			System.out.println("�첽�������� : " + s);
		}

	}

}
