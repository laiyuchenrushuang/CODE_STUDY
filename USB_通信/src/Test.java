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
			//�����ظ�����service������ת���˿�ǰ��stopһ�� 
			Runtime.getRuntime().exec("adb shell am broadcast -a NotifyServiceStop");
			//ת���Ĺؼ����� ִֻ������������Ҳ����ʵ��ת��
			Runtime.getRuntime().exec("adb forward tcp:10086 tcp:10010");//�˿ںŸ����Լ�������
			Runtime.getRuntime().exec("adb shell am broadcast -a NotifyServiceStart");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		createSocket();
	}
	public static void createSocket() {
        try {
            final Socket client = new Socket("127.0.0.1", 10086);

            // �õ�socket�ܵ��е������--------------���ֻ���д����
            final BufferedOutputStream out = new BufferedOutputStream(client.getOutputStream());
            // �õ�socket�ܵ��е�������--------------��ȡ�ֻ��˵�����
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
                        // ��Ҫ���ص����ݷ��͸�pc 
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
    //һ����ȡ�������ķ���
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

