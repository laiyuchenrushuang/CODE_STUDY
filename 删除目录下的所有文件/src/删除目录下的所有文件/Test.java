package 删除目录下的所有文件;

import java.io.File;
import java.util.Iterator;

public class Test {

	public static void main(String[] args) {
		String path = "C:\\Users\\tcb\\Desktop\\lai";

		delZSPic(path);
		System.out.println("文件刪除完成");
	}

	private static void delZSPic(String path) {
		File file = new File(path);
		if (!file.exists()) {
			System.out.println("没有文件删除对象");
		} else {
			File[] filePaths = file.listFiles();
			if (filePaths.length == 0) {
				System.out.println("文件無內容");
				return;
			}
			for (File f : filePaths) {
				if (f.isFile()) {
					f.delete();
				}
				if (f.isDirectory()) {
					String fpath = f.getPath();
					delZSPic(fpath);
					f.delete();
				}
			}
		}
	}

}
