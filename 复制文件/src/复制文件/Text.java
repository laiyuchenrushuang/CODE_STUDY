package 复制文件;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Text {

	public static void main(String[] args) throws FileNotFoundException {
		FileInputStream infile = new FileInputStream("D:\\lyzy\\11.txt");// 新建输入流
		BufferedInputStream inbuf = new BufferedInputStream(infile);// 对输入流进行缓冲

		File file = new File("D:\\lyzy\\copyTest\\");
		if (!file.exists()) {
			file.mkdirs();
		}
		FileOutputStream outfile=new FileOutputStream(file+"\\11.txt");
		
        BufferedOutputStream outbuf=new BufferedOutputStream(outfile);//对输出流进行缓冲

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
