
public class Test {

	public static void main(String[] args) {
		 String s = new String("����");   
		 DecryptMD5 dm = new DecryptMD5();
		  System.out.println("ԭʼ���ݣ�" + s);   
		  System.out.println("MD5��" + dm.MD5(s));   
		  System.out.println("MD5���ټ��ܣ�" + dm.KL(dm.MD5(s)));   
		  System.out.println("����ΪMD5��ģ�" + dm.JM(dm.KL(dm.MD5(s)))); 
	}

}
