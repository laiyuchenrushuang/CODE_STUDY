
public class Test {

	public static void main(String[] args) {
		 String s = new String("徐腾");   
		 DecryptMD5 dm = new DecryptMD5();
		  System.out.println("原始数据：" + s);   
		  System.out.println("MD5后：" + dm.MD5(s));   
		  System.out.println("MD5后再加密：" + dm.KL(dm.MD5(s)));   
		  System.out.println("解密为MD5后的：" + dm.JM(dm.KL(dm.MD5(s)))); 
	}

}
