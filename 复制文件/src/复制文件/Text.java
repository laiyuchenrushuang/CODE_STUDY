package �����ļ�;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Text {

	public static void main(String[] args) throws FileNotFoundException {
		FileInputStream infile = new FileInputStream("D:\\lyzy\\11.txt");// �½�������
		BufferedInputStream inbuf = new BufferedInputStream(infile);// �����������л���

		File file = new File("D:\\lyzy\\copyTest\\");
		if (!file.exists()) {
			file.mkdirs();
		}
		FileOutputStream outfile=new FileOutputStream(file+"\\11.txt");
		
        BufferedOutputStream outbuf=new BufferedOutputStream(outfile);//����������л���

        byte []  bt=new byte[2048];
        
        int len;
        try {
			while ((len = inbuf.read(bt)) != -1) {
				outbuf.write(bt);
			    outbuf.flush();
		        infile.close();
		        inbuf.close();
		        outfile.close();
		        outbuf.close();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
    
	}

}
