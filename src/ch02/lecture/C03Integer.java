package ch02.lecture;

public class C03Integer {
	public static void main(String[] args) {
		// 정수 : byte(1), short(2), int(4), long(8)
		
		// 1byte ==> 8bit (0000 0000)2진법으로 8자리 표현
		// 0 ~ 255(1111 11110)
		
		// byte (1byte) 1000 0000 앞자리가 1이면 음수
		// -128 ~ 127 (byte 범위)
		
		byte a = 0;
		byte b = 127;
		byte c = -128;
//		byte d = -129;
		
		//short (2bytes)
		//-32768 ~ 32767
		short e = 32767;
		
		// int (4byte)
		// 큰 값 (p38 참고)
		
		//long (8bytes)
		//매우 큰 값
		
		// 정수 literal 작성시 주의할 점
		// 정수 literal은 int로 취급
		// 범위를 넘어갈 땐 long타입 표시 (대문자 L)
		//작성하는 수가 클 땐 _와 조합 가능
		
		long q = 2_100_000_000;
		long r = 21000000000L;
		
		// 연산시 주의
		int s = 2147483647;
		int t = s + 1; // 2147483648 x 
		// 연산시 overflow 주의
		System.out.println(t); // -2147483647 o
		
		
		
		
		
		
		
		
		
	}
}
