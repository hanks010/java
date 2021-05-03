package test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Hashmap {

	public static void main(String[] args) {
	Map<String,String> map = new HashMap<>();
	map.put("김예환", "컴공");
	map.put("金艺焕", "计算机工学");
	map.put("취미", "피아노");
	
	Set <String> set = map.keySet();
	Iterator<String> iter = set.iterator();
	while(iter.hasNext()) {
		String key = iter.next();
		System.out.println(key+" - "+map.get(key));
	}
	System.out.println("===============================");
	Set<Map.Entry<String, String>> entry_set = map.entrySet();
	Iterator<Map.Entry<String, String>> entryIter = entry_set.iterator();
	while(entryIter.hasNext()) {
		Map.Entry<String, String> entry = entryIter.next();
		String key = entry.getKey();
		String value = entry.getValue();
		System.out.println(key +" - "+value);
	}
	
	}//main

}
