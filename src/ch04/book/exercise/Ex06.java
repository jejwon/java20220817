package ch04.book.exercise;

public class Ex06 {
	public static void main(String[] args) {
		System.out.println("*");
		
		System.out.println("sysout");
		System.out.print("엔터없이"); //줄바뀜 없음
		System.out.println("붙여서");
		System.out.println("다음줄");//윗줄 ln 줄바뀜 O
		System.out.println();//새로운 줄
		System.out.println("빈 줄");
		
		System.out.println("별표 찍기 print, 분리는 println");
		
		System.out.println("중첩 for문 사용1");
		for (int i = 0; i < 5; i++) {
			
			for (int j = 0; j <= i; j++) {
				System.out.print("j"); //변수 j
			} 
			
			System.out.println(); //변수 i 
		}
		
		
		
		System.out.println("중첩 for문 사용2");
		for (int m = 0; m < 5; m++) {
			
			for (int n = 0; n < (5-m); n++) {
				System.out.print("*"); //변수 n
			} 
			
			System.out.println(); //변수 m
		}
	}
}
