import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Test {

	public static void main(String[] args) {
		try {
			//避免重复开启service所以在转发端口前先stop一下 
			Runtime.getRuntime().exec("adb shell am broadcast -a NotifyServiceStop");
			//转发的关键代码 只执行这两句命令也可以实现转发
			Runtime.getRuntime().exec("adb forward tcp:10086 tcp:10010");//端口号根据自己的需求
			Runtime.getRuntime().exec("adb shell am broadcast -a NotifyServiceStart");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		createSocket();
	}
	public static void createSocket() {
        try {
            final Socket client = new Socket("127.0.0.1", 10086);

            // 得到socket管道中的输出流--------------像手机端写数据
            final BufferedOutputStream out = new BufferedOutputStream(client.getOutputStream());
            // 得到socket管道中的输人流--------------读取手机端的数据
            final BufferedInputStream in = new BufferedInputStream(client.getInputStream());
            new Thread(new Runnable() {

                @Override
                public void run() {
                    String readMsg = "";
                    while(true) {
                        if(!client.isConnected()) {
                            break;
                        }
                        readMsg = readMsgFromSocket(in);
                        System.out.println("result = "+readMsg);
                        if(readMsg.length() == 0) {
                            break;
                        }
                        // 将要返回的数据发送给pc 
                        try {
                            out.write((readMsg).getBytes());
                            out.flush();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }).start();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
    //一个读取输入流的方法
    public static String readMsgFromSocket(InputStream in) {
        String msg = "";
        byte[] tempbuffer = new byte[1024];
        try {
            int numReadedBytes = in.read(tempbuffer, 0, tempbuffer.length);
            msg = new String(tempbuffer, 0, numReadedBytes, "utf-8");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return msg;
    }
}

