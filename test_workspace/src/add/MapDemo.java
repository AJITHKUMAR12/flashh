package add;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
	public static void main(String[] args) {
		Map map = new HashMap();
		map.put("name","Ajith");
		map.put("actor","vijay");
		map.put("music","ARR");
		map.put("name", "Aji");
		map.put("actor", "Aji");
		System.out.println(map);
		System.out.println(map.get("name"));
		Set<String> keys = map.keySet();
		for(String key : keys) {
			System.out.println(key + " "+ map.get(key));
		}
	}

}
