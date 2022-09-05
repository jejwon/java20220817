package ch10.lecture.p02try;

public class C06Catch {
	public static void main(String[] args) {
		try {
			int a = 3 / 0;
		} catch(RuntimeException e) { //Exception, Throwable
			System.out.println("0으로 나눌 수 없음");
		}
	}
}
