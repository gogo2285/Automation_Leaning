package Java_Handson;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class maps {

	public static void main(String[] args) {

		Map<String, String> map = new HashMap<>();
		map.put("car", "1000");
		map.put("laptop", "20000");
		map.put("watch", "5000");
		System.out.println(map);
		System.out.println("the value of car is  " + map.get("car"));
		Set<String> keys = map.keySet();
		for (String key : keys) {
			System.out.println("value of " + key + " is " + map.get(key));
		}
	}

}
