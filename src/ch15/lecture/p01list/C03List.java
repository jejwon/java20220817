package ch15.lecture.p01list;

import java.util.Iterator;
import java.util.List;

public class C03List {
	public static void main(String[] args) {
		//모든 아이템 탐색
		List<String> list1 = List.of("mav", "ice", "rooster", "goose");
		
		for(int i = 0; i < list1.size(); i++) {
			System.out.println(list1.get(i));
		}
		
		//향상된 for문
		for(String item: list1) { //Object, CharSequence 가능
			System.out.println(item);
		}
		//forEach메소드
		list1.forEach((e)-> System.out.println(e));
		
		//iterator 사용
		list1.iterator();
		Iterator<String> iterator = list1.iterator();
		while(iterator.hasNext()) { 
			System.out.println(iterator.next());
		}
	}
}
