
public class People {
	public DataBean data;
	
	public static class DataBean{
		String name;
		String age;
	}
	public void setData(DataBean data) {
		this.data = data;
	}
	public DataBean getData() {
		return data;
	}
}
