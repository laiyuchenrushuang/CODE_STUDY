package 线程理解1;

public class Test {

	public static void main(String[] args) {

		new Thread( new Runnable() {
			 int y = 0;
			@Override
			public void run() {
				do {
					System.out.println(y++);
				}while(y >0 && y <10);
				
			}
		}).start();

	}
}
