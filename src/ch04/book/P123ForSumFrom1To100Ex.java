package ch04.book;

public class P123ForSumFrom1To100Ex {
	public static void main(String[] args) {
		int sum = 0;
		
		int i = 0; //for문 이후 i카운터 변수를 사용하려면 
		           //for문 이전에 선언
		for (i =1; i <= 100; i++) {
			sum += i;
		}
		System.out.println("1~" + (i-1) + "합 :" + sum);
	}
}
