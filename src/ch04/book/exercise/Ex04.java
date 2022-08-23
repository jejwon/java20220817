package ch04.book.exercise;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		
		while (true) {
		int x = (int) (Math.random() * 6) + 1;
		int y = (int) (Math.random() * 6) + 1;
		
		Scanner scanner = new Scanner(System.in);
		
		
			System.out.println("주사위:" + "(" + x + " , " + y + ")");
			if ((x + y) == 5) {
				System.out.println("두 눈의 합이 5입니다.");
				break;
			} else {
				System.out.println("두 눈의 합이 5가 아닙니다.");
			}
			
		}
		
//		System.out.println("do while ================");
//		int x, y;
//		do {
//			int x = (int) (Math.random() * 6) +1;
//			int y = (int) (Math.random() * 6) +1;
//			
//			System.out.println("두 눈의 합이 5입니다.");
//		} while ( x + y != 5);
//		
//		
	}
}
