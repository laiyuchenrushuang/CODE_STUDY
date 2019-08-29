package 监听字符串变化;

public class Test {

	protected static String dataB ="1";
	static A a = new A();
	public static void main(String[] args) {

		new Thread(new Runnable() {

			@Override
			public void run() {
				while (true) {
					System.out.println(dataB +"     "+a.data);
					if (dataB != a.data) {
						System.out.println("发送消息");
						dataB = a.data;
						return;
					}
				}
			}
		}).start();
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				
				
				try {
					Thread.sleep(10000);
					a.data = "333";
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
			}
		}).start();
	}

}
