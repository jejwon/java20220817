package ch15.lecture.p02set;

import java.util.*;

public class C03Set {
	public static void main(String[] args) {
		//Set 만들기
		Set<String> set1 = new HashSet<>(); //수정 가능한 Set
		set1.add("bob");
		set1.add("hangman");
		set1.add("seresin");
		
		set1.remove("seresin");
		
		System.out.println(set1);
		
		//수정 불가능한 Set
		Set<String> set2 = Set.of("batman", "wonder", "super");
//		set2.add("aqua"); xxx
//		set2.remove("wonder"); xxx
		
		System.out.println(set2.contains("super"));
		System.out.println(set2.size());
	}
}
