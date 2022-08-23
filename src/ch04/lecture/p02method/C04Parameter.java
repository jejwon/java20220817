package ch04.lecture.p02method;

public class C04Parameter {
	public static void main(String[] args) {
		
		printTriangle(5);
		printTriangle(10);
}
	public static void printTriangle (int a) {
		for (int i = 0; i < a; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
