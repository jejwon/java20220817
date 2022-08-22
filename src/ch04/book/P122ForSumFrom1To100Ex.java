package ch04.book;

public class P122ForSumFrom1To100Ex {
	public static void main(String[] args) {
		int sum = 0;
		
		for(int i =1; i <=100; i++) {
			sum +=i; //sum = sum +i 
		}
		System.out.println("1~100 합 :" + sum);
	}
}
