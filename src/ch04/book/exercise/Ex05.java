package ch04.book.exercise;

public class Ex05 {
	public static void main(String[] args) {
		// 4x + 5y  = 120
		// 1 <= x, y <= 10
		
		for (int x = 1; x <= 50; x++) {
			for (int y = 1; y <= 50; y++) {
				int result = (4 * x)  + (5 * y);
				if (result == 120) {
					System.out.println("(" + x + " , " + y + ")");
				}
			}
		}
		
		
		
		
		

		
		
//		for (int x = 1; x <= 10; x++ ) {
//			for (int y = 1; y <= 10; y++) {			
//				
//				int result = (4 * x) + (5 * y);
//				if (result == 60) {
//					System.out.println("(" + x + " , " + y +")");
//				}
//			}
//		}
//		
	}
}
