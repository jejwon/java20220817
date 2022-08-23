package ch04.lecture.p01control;

public class C09For {
	public static void main(String[] args) {
		System.out.println("============ex1============");
		for (int i = 0; i < 5; i++) {  
			for (int j = 0; j < 5; j++) {
				System.out.print(j);
			} 
			System.out.println();
		} 
		System.out.println("============ex2============");
		
		for (int i = 0; i < 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("============ex3============");
		
		for (int i = 0; i < 5; i++) {
			for (int j = 5; j > 0; j-- ) {
				System.out.print(j);
			} 
			System.out.println();
		}
		System.out.println("============ex4============");
		
		for (int i = 0; i < 5; i++) {
			for (int j = 4; j >= 0 ; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("============ex5============");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("============ex6============");
		for (int i = 1; i < 6; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("============ex7============");
		int k = 0;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(k);
				k++;
			}
			System.out.println();
		}
		
		System.out.println("============ex8============"); //별
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("============ex9============");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < (5-i); j++ ) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("============ex10============");
		for (int i = 0; i < 5; i++) {
			// space 출력
			for (int j = 0; j < i; j++ ) {
				System.out.print(" "); //왼쪽 늘어나는 공백 
			} 
			//* 출력
			for (int h = 5; h > i; h--) {
				System.out.print("*");
			}
			System.out.println();         // 실행흐름에 따라 공백 먼저, 그 다음에 *
		} 
			
	
		System.out.println("============ex11============");
		for (int i = 0; i < 5; i++) {
			//space 출력
			for (int j = 4; j > i; j--) {
				System.out.print(" ");
			}
			
			//* 출력
			for (int l = 0; l <=i; l++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		
		System.out.println("============ex12============");
		int h = 0;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print((h++)%10);
			} 
			System.out.println();
		}
	}
}
