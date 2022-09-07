package ch11.lecture.p01object;

import java.util.Scanner;

public class C01Object {
	public static void main(String[] args) {
		//모든 클래스의 상위 클래스
		
		
		
		Object o1 = "topgun"; //reference type
		Object o2 = new Scanner("java");
		Object o3 = new ArrayIndexOutOfBoundsException();
		Object o4 = new int[] {3, 4, 5};
		Object o5 = new String[] {"mav", "roo", "ice"};
		
		
		//심지어 기본 타입도 대입 가능
		Object o6 = 3; //int: primitive type은 상속관계가 없음
		Object o7 = true;
		Object o8 = 3.14;
		
		
		Object[] o9 = {"goose", 
				new int[] {3,4}, 
				new ArrayIndexOutOfBoundsException(),
				3,
				true};
	}
}
