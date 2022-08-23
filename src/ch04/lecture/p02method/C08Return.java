package ch04.lecture.p02method;

public class C08Return {
	public static void main(String[] args) { //실행흐름 주의
		System.out.println(1);
		
		int r = method1(); //5로 치환 -> 변수에 대입해서 쓰기
		System.out.println(r);
		
		System.out.println(2);
		
		int s = method1();
		System.out.println(3);
		System.out.println(s);
	}
	
	public static int method1 () {
		return 5; //호출한 곳으로 5 반환
	}
}
