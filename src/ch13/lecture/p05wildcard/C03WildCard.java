package ch13.lecture.p05wildcard;

import java.util.ArrayList;

public class C03WildCard {
	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<>();
		list1.add("mav");
		list1.add("brad");
		
		ArrayList<?> list2 = list1; //ok 어떤 타입이든 올 수 있음 -> 다 못 옴 
//		list2.add(""); //xxx
//		list2.add(101); //
	
		ArrayList<Integer> list3 = new ArrayList<>();
//		list1.add(100);
//		list1.add(200);
		
		// ? : unbounded wildcard
		
		ArrayList<?> list4 = list3;
//		list4.add(300);
//		list4.add("");
//		list4.add(new Object());
		Object o1 = list4.get(0); //object로 꺼내기는 가능
		
	}
}
