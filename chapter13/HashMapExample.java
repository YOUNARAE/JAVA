package chapter13;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("신용균", 85);
		map.put("홍길동", 90);
		map.put("동장군", 80);
		map.put("홍길동", 95); //set이랑 다르게 map은 덮어씌워진다
		System.out.println(map.size());//키 값이 중복되면 덮어쓴다
		
		Integer hongValue = map.get("홍길동");
		System.out.println(hongValue);
		System.out.println();
		
		
		// 모든 요소 출력
		//1.Entry를 이용해서 가져오는 방법
		//1-1 iterator를 이용
		Iterator<Entry<String, Integer>> entryiterator = map.entrySet().iterator(); //Entry의 집합
		while (entryiterator.hasNext()) {
			Entry<String, Integer> entry = entryiterator.next();
			System.out.println(entry.getKey()+": "+entry.getValue());
		} //키와 밸류형태의 데이터가 들어가있
		System.out.println();
		
		//1-2 foreach문 이용
		for (Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey()+": "+entry.getValue());
		}
		
		System.out.println();
		
		
		
		//2.Key를 이용해서 가져오는 방법-key는 집합이다
		Iterator<String> iterator = map.keySet().iterator();
		while(iterator.hasNext()) {
			String key = iterator.next();
			System.out.println(key + ": "+map.get(key));
		}
		
		System.out.println();
		
		Set<String> keySet = map.keySet();
		for (String key : keySet) {
			System.out.println(key + ": "+map.get(key));			
		}
		
		
		
		System.out.println();
		
		//3.Value를 직접 이용하는 방법
		Collection<Integer> values = map.values();
		for (Integer value : values) {
			System.out.println(value);
		}
		
		
		//반복문 1.for i문, 2.for each문, 3.foreach 함수사용
		values.forEach(System.out::println);

	}
}
