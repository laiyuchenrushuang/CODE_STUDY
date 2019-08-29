package 求一个素数;

public class Text {

	public static void main(String[] args) {
		int i, j;
		for (i = 1; i <= 20; i++) {
			for (j = 2; j < i; j++) {
				if (i % j == 0) {
					break;
				}
			}
			if (i == j) {
				System.out.println(i + "是素数");
			}
		}
	}

}
