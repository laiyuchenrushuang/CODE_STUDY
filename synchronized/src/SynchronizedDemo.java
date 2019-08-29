import java.util.ArrayList;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class SynchronizedDemo implements Runnable {
    private static ArrayList<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            ThreadPoolExecutor thread = new ThreadPoolExecutor(3, 5, 1000, TimeUnit.SECONDS, null);
            System.out.println(thread);
            thread.execute(new Thread(new SynchronizedDemo()));
        }
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("result: " + list.toString());
    }

    @Override
    public void run() {
    	synchronized(list) {
    		for (int i = 0; i < 100000; i++)
                list.add(i);
    	}
        
    }
}