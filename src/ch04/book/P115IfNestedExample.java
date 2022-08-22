package ch04.book;

public class P115IfNestedExample {
	public static void main(String[] args) {
		int score = (int)(Math.random()*20) + 81; //(0 ~ 19)+81=> 81~100
		System.out.println("점수:" + score);
		
		String grade;
		
		if (score >= 90) {
			if (score >= 95) {
				grade = "A+";
			} else {
				grade = "A";
			} 
			} else { //첫번째 if의 else
				if (score >= 85) {
					grade = "B+";
				} else {
					grade = "B";
			}
		}
	  System.out.println("학점:" + grade);
	}
}
