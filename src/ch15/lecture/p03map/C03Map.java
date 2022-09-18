package ch15.lecture.p03map;

import java.util.*;

public class C03Map {
	public static void main(String[] args) {
		//Map 만들기
		Map<String, String> map1 = new HashMap<>();
		map1.put("seoul", "korea");
		map1.put("busan", "korea");
		map1.put("jeju", "korea");
		map1.put("dokdo", "korea");
		
		System.out.println(map1);
		
		//of 메소드 사용 !수정 불가
		Map<String, String> map2
		= Map.of("seoul", "korea", "busan","korea", "london", "uk");
//		map2.put("newyork", "us");
//		map2.put("busan", "seoul");
//		map2.remove("london");
		
		
		System.out.println(map2); //순서 보장 안됨
		
		Map<String, String> map3
		= Map.of("mav", "cap", "roo", "liu", "hang", "liu", "bob", "baby");
		System.out.println(map3);
  }
	
	


}	
