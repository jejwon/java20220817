package ch14.book.Ex.Ex5;

import java.util.function.IntBinaryOperator;

public class LambdaEx {
	private static int[] scores = {10, 50, 3};
	
	public static int maxOrMin(IntBinaryOperator operator) {
		int result = scores[0];
		for(int score : scores) {
			result = operator.applyAsInt(result, score);
		}
		return result;
	}
	
	public static void main(String[] args) {
		//최댓값 얻기

//		lambda식
//		int max = maxOrMin((x, y) -> Math.max(x, y) );

//		익명 클래스 객체를 바로 파라미터로 전달
		int max = maxOrMin(new IntBinaryOperator() {
			
			@Override
			public int applyAsInt(int left, int right) {
				
				return Math.max(left, right);
			}
		});
		
		System.out.println("최댓값: " + max);
		
		//최소값 얻기
		int min = maxOrMin((x, y) -> Math.min(x, y) );
		
		System.out.println("최소값: " + min);
	}
	
}
