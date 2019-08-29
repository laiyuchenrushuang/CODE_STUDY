package 代理模式;

public class Text {

	public static void main(String[] args) {
//		 Person person = (Person) new HomeLink().getInstance(new Master());
		
		Person person = (Person) new HomeLine().getInstance(new Master());
	        person.searchHouse();

	}

}
