package sef.module9.sample;

import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapSample {
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
			
		Map map = new HashMap();
		map.put("1", "A String");
		map.put("2", new Date());
		map.put("3", new Integer(42));
		map.put("4", new Date());
		//beware of using the same key twice cause it will overwrite the value
		map.put("1", "same key as A String");
		
		System.out.println(map.get("3"));
		System.out.println(map.get("2"));
		System.out.println(map.get("1"));
		
		//keys are maintained as set in map
		Set keys = map.keySet();
		//keys are maintained as list in map
		Collection values = map.values();
		
		System.out.println(keys);
		System.out.println(values);
	}
}
