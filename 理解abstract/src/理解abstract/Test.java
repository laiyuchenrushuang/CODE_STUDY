package Àí½âabstract;

import java.util.ArrayList;
import java.util.List;

public class Test {
static List<String> s = new ArrayList<>();
	public static void main(String[] args) {
		A a = new A();
		((BaseA)a).downloadProgress("OK");
		s.add("seatrendtec");
		s.add("seatrendtec");
		s.add("seatrendtec");
		s.add("seatrendtec");
		s.add("seatrendtec");
		s.add("seatrendtec");
		s.add("seatrendtec");
		s.add("seatrendtec1");
		String wifiName = "seatrendtec1";
		if (s.contains(wifiName)) {
			System.out.println("OK");
		}
	}

}
