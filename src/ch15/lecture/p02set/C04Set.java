package ch15.lecture.p02set;

import java.util.*;

public class C04Set {
	public static void main(String[] args) {
		//element가 같은 지 판단?
		//equals 메소드로 한다
		
		Set<String> set = new HashSet<>();
		System.out.println(set.add("bat"));
		set.add("super");
		set.add("wonder");
		System.out.println(set.add(new String("wonder")));
		
		System.out.println(set);
		
	}
}
