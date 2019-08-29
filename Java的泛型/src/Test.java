import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {

	@SuppressWarnings("unchecked")
	public static <E, K, V, T> void main(String[] args) {
//		C1 c = new C1();
//		getmethed(c);
		List<T> t = new ArrayList<T>();
		t.add((T) "1");
		System.out.println(t.get(0));
		List<Object> m = new ArrayList<Object>();
		m.add(1);
		System.out.println(m.get(0));
		
		ArrayList<E> a = new ArrayList<>();
		Map<K, V> map = new HashMap<>();
		Map<Object, Object> mapm = new HashMap<>();
		mapm.putAll(map);
		
		Map<String, String> map1 = new HashMap<>();
		map1.put("1", "2");

		Map<Integer, Integer> map2 = new HashMap<>();
		map2.put(1, 2);
		a.add((E) "laiyu");
		map.putAll((Map<? extends K, ? extends V>) map1);
		map.putAll((Map<? extends K, ? extends V>) map2);
//		System.out.println(m.toString());
	}

	public class C1<E> implements B {
		ArrayList<E> a = new ArrayList<>();

		public C1() {

		}

		@Override
		public void methed1() {
			// TODO Auto-generated method stub

		}

		@Override
		public void methed2() {
			// TODO Auto-generated method stub

		}

	}

}
