import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

class Temp {

}

public class App {

	public static void main(String[] args) {
		// not ordered
		Map<Integer, String> hashMap = new HashMap<Integer, String>();
		// not ordered
		Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
		// natural order
		Map<Integer, String> treehMap = new TreeMap<Integer, String>();

		testMap(treehMap);

	}

	public static void testMap(Map<Integer, String> map) {
		map.put(9, "fox");
		map.put(4, "cat");
		map.put(8, "dog");
		map.put(1, "giraffe");
		map.put(0, "swan");
		map.put(15, "bear");
		map.put(6, "snake");

		for (Integer key : map.keySet()) {
			String value = map.get(key);
			System.out.println(key + ": " + value);
		}
	}

}
