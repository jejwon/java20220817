package ch03.lecture.p2binary;

public class C02Arihtmetic {
	public static void main(String[] args) {
		//사용하는 자료형 주의해서 선택
		
		int i = 10_0000_0000;
		int j = 10_0000_0000;
		
		int k = i + j;
		System.out.println(k);
		
		k = k + i;
		System.out.println(k); //overflow
		
		
		long x = 10_0000_0000;
		long y = 10_0000_0000;
		long z = x + y;
		
		System.out.println(z);
		
		
		
		
		
		
		
		
	}
}
