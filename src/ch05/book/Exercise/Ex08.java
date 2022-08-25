package ch05.book.Exercise;

public class Ex08 {
	public static void main(String[] args) {
		int[][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		
		
		int sum = 0;
		double avg = 0.0;
		
		double cnt = 0;
		int allLength = 0;
		
		
		for (int i = 0; i < 1; i++) {	 
			for (int j = 0; j < array[i].length; j++) {
				sum += array[i][j];	
				cnt++;
			}
			
			allLength += array[i].length;
		}
//		for (int i = 1; i < 2; i++) {	 
//			for (int j = 0; j < 3; j++) {
//				sum += array[i][j];	
//			}
//		}
//		
//		for (int i = 2; i < 3; i++) {
//			for (int j = 0; j < 5; j++) {
//				sum += array[i][j];
//			}
//		}
//		
		avg = (double) sum / cnt;
		avg = sum / (double)allLength;
		
		
		System.out.println("sum: " + sum);
		System.out.println("avg: " + avg);

	}
}
