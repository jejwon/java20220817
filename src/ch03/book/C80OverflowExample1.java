package ch03.book;

public class C80OverflowExample1 {
	public static void main(String[] args) {
		int x = 100_0000;
		int y = 100_0000;
		int z = x + y;
		System.out.println(z);
	}
}
