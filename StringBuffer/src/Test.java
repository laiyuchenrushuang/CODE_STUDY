import java.util.HashMap;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
		StringBuffer buffer = new StringBuffer();
		HashMap<String, String> map = new HashMap<>();
	
		buffer.append("?");
		for (Map.Entry<String, String> entry : map.entrySet()) {
            buffer.append(entry.getKey().trim()+"="+entry.getValue().trim()+"&");
        }

		String s = buffer.toString();
		String parameter = s.substring(0, s.length() - 1);

		System.out.println("sss = "+parameter);
	}

}
