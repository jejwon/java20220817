package ch15.book.p729;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListEx {
	public static void main(String[] args) {
		List<String> list1 = Arrays.asList("블랙폰", "9명", "노스맨");
		for(String name : list1) {
			System.out.println(name);
		}
		
		list1.forEach((e)->System.out.println(e));
		
		
		
		List<Integer> list2 = Arrays.asList(1, 2, 3);
		for(int value : list2) {
			System.out.println(value);
		}
		
		list2.iterator();
		Iterator<Integer> iterator = list2.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	}
}
