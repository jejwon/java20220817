package ch15.lecture.p01list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02List {
	public static void main(String[] args) {
		//리스트 만드는 방법1
		List<String> list1 = new ArrayList<>();
		list1.add("goose");
		list1.add("carol");
		list1.add("brad");
		System.out.println(list1);
		
		//리스트 만드는 방법2
		List<String> list2 = Arrays.asList("goose", "carol", "brad");
		System.out.println(list2);
		
		//리스트 만드는 방법3
		List<String> list3 =  List.of("goose", "carol", "brad");
		System.out.println(list3);
		
		//주의! 2,3은 추가 불가능
		list1.add("mav");//ok
//		list2.add("mav");//xxx
		
		//주의! 3은 변경도 불가능
		list1.set(0, "ice"); //ok
		list2.set(0, "ice"); //ok
//		list3.set(0, "ice"); xxx
	}
}
