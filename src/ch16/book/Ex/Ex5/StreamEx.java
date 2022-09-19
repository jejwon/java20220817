package ch16.book.Ex.Ex5;

import java.util.*;

public class StreamEx {
	public static void main(String[] args) {
		List<String> list = Arrays.asList(
				"This is a java book",
				"Lambda Expression",
				"Java8 supports lambda expressions");
		list.stream()
		.filter((s) -> s.toUpperCase().contains("java".toUpperCase()))
		.forEach(a-> System.out.println(a));
	}
}
