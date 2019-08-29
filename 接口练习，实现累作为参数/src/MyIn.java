
public class MyIn {
	public interface MyInterface {
		void sucess(String i);
	}

	public static void getToken(MyInterface impl, MyTestClass myTestClass) {
		impl.sucess("OK");
	};
	
	
	void list(MyTestClass myTestClass) {
		getToken(myTestClass, myTestClass);
	}
}
