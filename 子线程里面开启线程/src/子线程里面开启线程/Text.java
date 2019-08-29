package 子线程里面开启线程;

import java.util.concurrent.ThreadFactory;

public class Text {

	public static void main(String[] args) {
		ThreadFactory tf = new ThreadFactory() {
			
			@Override
			public Thread newThread(Runnable r) {
				System.out.println("LY TEST");
				return null;
			}
		};
		new Thread(new Task()).start();
	}

}
