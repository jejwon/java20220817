package ch04.lecture.p01control;

public class C19DoWhile {
	public static void main(String[] args) {
		System.out.println(1);
		
		do { //무조건 한 번은 실행되고 while의 조건 확인 후 실행되거나 종료됨
			System.out.println(2);
			System.out.println(3);
		} while (false);
		System.out.println(4);
	}
}
