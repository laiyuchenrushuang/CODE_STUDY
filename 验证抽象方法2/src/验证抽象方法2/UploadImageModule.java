package ��֤���󷽷�2;

import java.util.Map;

public class UploadImageModule extends BaseModule {

	@Override
	public void doWork(Map<String, String> map, String url) {
		 LYService.getInstance().getDataFromServer(map,url, "post",this);
		
	}

	@Override
	public void doWorkResults(String a, boolean isSuccess) {
		System.out.println("����ʵ����ʵ��");
		
	}

}
