package ch04.lecture.p01control;

import java.util.Scanner; //ctrl+shift+o : import 추가

public class C18GuessNumber {
	public static void main(String[] args) {
		//컴퓨터 1 ~ 100 random
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("숫자 맞추기");
		
		while (true) {
			
			System.out.print("번호를 입력하세요(1~100):");
			int user = scanner.nextInt();
			
			int c = (int)(Math.random()*100) + 1;
			
			System.out.println("숫자 결과: " + c);
			
			if (user == c) {
				System.out.println("정답입니다.");
				break;
			} else if (user < c) {
				System.out.println("더 큰 수를 입력해보세요.");
			} else {
				System.out.println("더 작은 수를 입력해보세요.");
			}
		}
		
		
	}
}
