package 验证抽象方法2;

import java.util.Map;

public class Test {

	public static void main(String[] args) {
		BaseModule b = new BaseModule() {
			
			@Override
			public void doWorkResults(String a, boolean isSuccess) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void doWork(Map<String, String> map, String url) {
				// TODO Auto-generated method stub
				
			}
		};
		b.doWorkResults(null, false);
	}
	
}

