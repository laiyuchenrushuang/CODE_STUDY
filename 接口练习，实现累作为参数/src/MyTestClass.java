
public class MyTestClass implements MyIn.MyInterface {

	@Override
	public void sucess(String i) {
		System.out.println(i);

	}

	public  void getim() {
		MyIn.getToken(MyTestClass.this,this);

	}
}
