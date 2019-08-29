import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		People p = new People();
		People.DataBean ab =new People.DataBean();
		ab.name = "lai";
		ab.age = "21";
		p.setData(ab);
	    Map<String,String> m = new HashMap<>();
	    m.put("name", "lai");
	    m.put("age", "21");
	 
	    Set<String> keys = m.keySet();
	    System.out.println(keys.toString());
	    for (String string : keys) {
			System.out.println(string);
		}
	}

}
