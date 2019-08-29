package 验证抽象方法2;

import java.util.Map;

public abstract class BaseModule {
	public abstract void doWork(Map<String,String> map ,String url);
    public abstract void doWorkResults(String a, boolean isSuccess);
}
