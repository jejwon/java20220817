package ch08.lecture.p01interface;

import java.io.Serializable;

public class C02Interface {
	public static void main(String[] args) {
		String s1 = "mav";
		
		Object o1 = s1;
		Serializable o2= s1;
		CharSequence o3 = s1;
		Comparable<String> o4 = s1;
		
		System.out.println(s1 instanceof Object); //true
		System.out.println(s1 instanceof Serializable); //true
		System.out.println(s1 instanceof CharSequence); //true
		System.out.println(s1 instanceof Comparable<?>); //true
		//s1을 o1, o3, o4로 바꿔도 됨, 같은 인스턴스를 가리킴
	}
}
