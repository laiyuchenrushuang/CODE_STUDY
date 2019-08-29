package 验证抽象方法2;

import java.util.Map;

public class LYService {
	private BaseModule mBaseModule;

	public static LYService getInstance() {
		return new LYService();
	}

	public void getDataFromServer(Map<String, String> map, String url, String string,
			UploadImageModule uploadImageModule) {
		this.mBaseModule=uploadImageModule;
		
	}
}
