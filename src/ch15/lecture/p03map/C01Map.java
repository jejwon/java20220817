package ch15.lecture.p03map;

import java.util.*;

public class C01Map {
	public static void main(String[] args) {
		//Map
		//(key, value) 쌍(entry)으로 저장
		//key는 중복될 수 없음
		//key는 하나의 value에 매핑됨
		
		Map<String, String> map = new HashMap<>();
		
		//entry 추가
		map.put("batman", "dc");
		map.put("ring", "novel");
		map.put("captain", "marvel");
		map.put("dare", "blind");
		map.put("aqua", "dc");
		map.put("batman", "comics"); //이미 있는 키, 밸류 덮어씀
	
		//entry 수 얻기
		int size = map.size();
		System.out.println(size);
	
		//지우기
		map.remove("batman");
		System.out.println(map.size());
		
		//이미 있는 키인가?
		boolean hasRing = map.containsKey("ring");
		System.out.println(hasRing);
		System.out.println(map.containsKey("batman"));
	
		//value 얻기
		String val1 = map.get("ring");
		System.out.println(map.get("dare"));
		System.out.println(map.get("batman"));
	
	
	
	}
}
