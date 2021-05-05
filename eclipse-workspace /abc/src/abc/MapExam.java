package abc;
/*
 Map 같은 키 값이 두 개 이상 올 수 없고, 한 쌍의 데이터가 필요
 같은 키 값이 새로 들어올 경우 기존의 값에 덮어쓴다.
 */
import java.util.*;
public class MapExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> map = new HashMap<>();
		map.put("001","kim");
		map.put("002","lee");
		map.put("003","choi");
		
		map.put("001","kang");
		
		System.out.println(map.size());
		System.out.println(map.get("001"));
		Set<String> keys = map.keySet();
		
		Iterator<String> iter = keys.iterator();
		while(iter.hasNext()) {
			String key = iter.next();
			String value = map.get(key);
			System.out.println(key +":"+ value);
		}
	}

}
