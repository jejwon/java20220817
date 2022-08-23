package ch04.lecture.p02method;

public class C05Parameter {
	public static void main(String[] args) {
		method1(3);
		method2(3.14);
		method2(5);
//		method1(3.14); //자동 형변환 되는 타입으로 넣기
//		method2("스트링")
		
		int a = 3;
		method1(a);
		
		double b = 3.14;
		method2(b);
		
//		method3(1); //x 개수 맞춰서 넣기
		method3(1, 2, 3);
		
		method4(3, 3.14);
	}
	
	
	public static void method3(int p1, int p2, int p3 ) {
		
	}
	
	public static void method4(int q1, double q2) {
		
	}
	
	
	
	public static void method1(int param) {
		
	}
	
	public static void method2(double param) {
 }
}