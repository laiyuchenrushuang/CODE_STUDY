package ɾ��Ŀ¼�µ������ļ�;

import java.io.File;
import java.util.Iterator;

public class Test {

	public static void main(String[] args) {
		String path = "C:\\Users\\tcb\\Desktop\\lai";

		delZSPic(path);
		System.out.println("�ļ��h�����");
	}

	private static void delZSPic(String path) {
		File file = new File(path);
		if (!file.exists()) {
			System.out.println("û���ļ�ɾ������");
		} else {
			File[] filePaths = file.listFiles();
			if (filePaths.length == 0) {
				System.out.println("�ļ��o����");
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
