
public class Test {
	public static void main(String[] args) {
		int i = 8;
		do {
			i = i / 2;
			int a = 0;
			switch (i) {
			
			case 4:
				a++;
				System.out.println(4);
				break;
			case 2:
				a++;
				System.out.println(2);
				break;
			case 1:
				a++;
				System.out.println(1);
				System.out.println(a);
				break;
			}

		} while (i != 1);
	}

}
