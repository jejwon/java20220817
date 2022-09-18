package ch15.lecture.p03map;

import java.util.*;

public class C02Map {
	public static void main(String[] args) {
		//전체 entry 탐색
		
		
		Map<String, String> map = new HashMap<>();
		map.put("Korea", "seoul");
		map.put("Japan", "tokyo");
		map.put("US", "newyork");
		map.put("UK", "london");
		map.put("France", "paris");
		
		//keySet 이용
		Set<String> keys = map.keySet();
		for(String key : keys) {
			String val = map.get(key);
			System.out.println(key + ":" + val); //순서 보장 안됨
		}
		
		//EntrySet 이용
		Set<Map.Entry<String, String>> entries = map.entrySet();
		for(Map.Entry<String, String> entry : entries) {
			System.out.println(entry.getKey()+ ":" + entry.getValue());
		}
		
		//forEach 메소드 사용
		map.forEach((k,v) -> System.out.println(k + ":" + v));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
