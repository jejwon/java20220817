package ch15.book.p737;

import java.util.*;

public class HashSetEx {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("iBATIS");
		
		int size = set.size();
		System.out.println("총 객체수: " + size);
		
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t" + element);
		}
		
		set.remove("JDBC");
		set.remove("iBATIS");
		
		System.out.println("총 객체수: " + set.size());
		
		iterator = set.iterator();
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t" + element);
		}
		//향상된 for문
		for(String element : set) {
			System.out.println(element);
		}
		
		//forEach 메소드 사용
		set.forEach((e) -> System.out.println(e)); 
		
		set.clear();
		if(set.isEmpty()) {
			System.out.println("비어있음");
		}
	}
}
