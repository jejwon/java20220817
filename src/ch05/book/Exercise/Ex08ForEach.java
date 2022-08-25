package ch05.book.Exercise;

public class Ex08ForEach {
	public static void main(String[] args) {
		int[][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		
		
		int sum = 0;
		double avg = 0.0;
		int cnt = 0;
		
		for (int arr[]: array) {
			for (int inner: arr) {
				sum = sum + inner;
				cnt++;
			}
		}
		System.out.println("총합:" + sum);
		
		avg = (double)sum / cnt;
		System.out.println("평균:" + avg);
	}
}
