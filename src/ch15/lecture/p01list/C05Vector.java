package ch15.lecture.p01list;

import java.util.List;
import java.util.Vector;

public class C05Vector {
	public static void main(String[] args) {
		List<String> list = new Vector<>();
		list.add("roy");
		list.add("orange");
		list.add("catinca");
		
		System.out.println(list);
		
		list.remove(0);
		System.out.println(list);
		
		list.add(0, "the fall");
		System.out.println(list);
		
		for(String item : list) {
			System.out.println(list);
		}
	}
}
