package ch04.book;

public class P125WhileSumFrom1To10Ex2 {
	public static void main(String[] args) {
		int sum = 0;
		
		int i = 1; //변수 미리 선언
		
		while(i <=100) {
			sum += i;
			i++;
		}
		System.out.println("1 ~ "+(i-1) + "합 :" + sum);
	}
}
