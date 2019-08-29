package 验证抽象方法2;

import java.util.Map;

public class UploadImageModule extends BaseModule {

	@Override
	public void doWork(Map<String, String> map, String url) {
		 LYService.getInstance().getDataFromServer(map,url, "post",this);
		
	}

	@Override
	public void doWorkResults(String a, boolean isSuccess) {
		System.out.println("抽象实现类实现");
		
	}

}
