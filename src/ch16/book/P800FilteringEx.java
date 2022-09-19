package ch16.book;

import java.util.*;

public class P800FilteringEx {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("hang", "bob", "babe", "roo", "mav");
		
		names.stream()
			.distinct() //중복제거
			.forEach(n -> System.out.println(n));
	
		names.stream()
		.filter(n -> n.startsWith("b"))
		.forEach(n->System.out.println(n));	
		
		
		names.stream()
			.distinct()
			.filter(n->n.startsWith("b"))
			.forEach(n->System.out.println(n));
	}
}
