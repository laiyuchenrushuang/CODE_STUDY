package 接口作为参数的验证;

public class Test {

	public static void main(String[] args) {
		send(new A());

	}

	private static void send(B a) {
		a.gg();
	}
}
