package ch05.book.Exercise;

public class Ex07 {
	public static void main(String[] args) {
		int max = 0; 
		int[] array = {1, 5, 3, 8, 2};
		
		for (int i = 1; i < array.length; i++) {
			if ((array [i] > array[i -1]) && (array[i] > array[i + 1]) ) {
				max = array [i];
				
			}
		}
		
//		 int max = Integer.MIN_VALUE;
//        int[] array = {1, 5, 3, 8, 2};
//		
//		for (int i = 1; i < array.length; i++) {
//			if ((array [i] > array[i -1]) && (array[i] > array[i + 1]) ) {
//				max = array [i];
//				
//			}
//		}
		
		for (int i = 0; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
			}
		}
		
		//가장 작은 값 구하기
		int min = Integer.MAX_VALUE; //적절히 바꾸기
		for (int i = 0; i < array.length; i++) {
			if (min > array[i]) {
				min = array[i];
			}
		}
		System.out.println("min: " + min);
		
		
		
		System.out.println("max: " + max);
	}
}
