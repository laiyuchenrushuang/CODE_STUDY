
public class MyThread extends Thread{

	@Override
	public void run(){
		for (int i = 0;i<100;i++) {
			System.out.println();
			try {
				System.out.println("��ǰ���֣�"+i);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		
	}

}
