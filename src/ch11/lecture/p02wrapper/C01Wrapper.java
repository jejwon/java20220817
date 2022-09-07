package ch11.lecture.p02wrapper;

import java.util.Arrays;

public class C01Wrapper {
	public static void main(String[] args) {
		//data type: primitive type(ch2-data값 자체 저장), reference type(ch5-instance참조값 저장)
		
		//기본타입 8개 -> 참조타입 8개(p527)
		//int, byte, short, long, char, float, double, boolean
		//Integer, Byte, Short, Long, Character, Float, Double, Boolean
		
		String[] arr1 = new String[3];
		arr1[0] = "mav";
		arr1[1] = "brad";
		arr1[2] = "ice";
		
		int[] arr2 = new int[3];
		arr2[0] = 99;
		arr2[1] = 100;
		arr2[2] = 111;
		
		int a = 3; //기본타입
		Integer b = Integer.valueOf(3); //참조타입
		
		System.out.println(System.identityHashCode(a)); //원래 x
		System.out.println(System.identityHashCode(b));
		
		Object[] arr3 = new Object[3];
		arr3[0] = "coo";
		arr3[1] = Integer.valueOf(99);
		arr3[2] = "chip";
		
		System.out.println(Arrays.toString(arr3));
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
