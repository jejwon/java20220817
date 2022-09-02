package ch08.lecture.p01interface;

import java.io.Serializable;

public class C04Casting {
	public static void main(String[] args) {
		CharSequence o1 = "topgun";
		int len = o1.length();
		char c = o1.charAt(3);
		
		
		String o2 = (String) o1; //하위타입으로 강제형변환해서 쓸 수 있음
		
		//o1의 타입이 CharSequence-> 안에 있는 메소드만 쓸 수 있음
		byte[] bytes = o2.getBytes();
		
		Object o3 = (Object) o1;
		Serializable o4 = (Serializable) o1;
		Comparable<String> o5 = (Comparable<String>) o1;
		
//		StringBuilder o6 = (StringBuilder) o1; xxx
		
		System.out.println("프로그램 실행됨");
		
		
		
		
		
		
		
		
		
		
	}
}
