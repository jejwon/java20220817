package ch13.lecture.p01generic;

import java.util.ArrayList;

public class C06Generic {
	public static void main(String[] args) {
		//타입 파라미터에 기본 타입은 넣을 수 없음 -> boxing
		//ArrayList<int> = new ArrayList<int>();
	
		ArrayList<Integer> list = new ArrayList<Integer>();
//		list.add("3"); xxx
		list.add(3);
	
		int v1 = list.get(0);
		Integer v2 = list.get(1);
		
		System.out.println(v1);
		System.out.println(v2);
	}
}
