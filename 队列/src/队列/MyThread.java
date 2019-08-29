package ╤сап;

public class MyThread extends Thread {
	private boolean flag = true;
	private int i = 0;

	@Override
	public void run() {

		while(true) {
			if(flag) {
				System.out.println(i ++);
			}	
		}	
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}
}
