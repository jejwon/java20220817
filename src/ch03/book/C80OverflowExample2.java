package ch03.book;

public class C80OverflowExample2 {
	public static void main(String[] args) {
		long x = 100_0000;
		long y = 100_0000;
		long z = x + y;
		System.out.println(z);
	}
}
