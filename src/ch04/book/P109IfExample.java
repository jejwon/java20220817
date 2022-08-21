package ch04.book;

public class P109IfExample {
	public static void main(String[] args) {
		int score = 93;
		
		if (score >= 90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A입니다");
		}
		
		if (score < 90)
			System.out.println("점수가 90보다 작습니다."); //중괄호 생략 가능 
			
		System.out.println("등급은 B입니다."); //if 코드블럭이 아님. 들여쓰기 하기
		
	}
}
