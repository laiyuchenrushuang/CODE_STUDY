import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("1", "lylog1");
		map.put("2", "lylog2");
		map.put("3", "lylog3");
		map.put("4", "lylog4");
		map.put("5", "lylog5");
		System.out.println(map.toString());
		Set<String> setc = map.keySet();
		System.out.println(setc.toString());
		for(String key : setc) {
			System.out.println(map.get(key));
		}
		for(Entry<String, String> data : map.entrySet()) {
			
			System.out.println(data.getKey()+"--->"+data.getValue());
		}
		
	}

}
