package ch05.book;

public class P157ArrayCreateByNewEx {
	public static void main(String[] args) {
		int[] arr1 = new int[3]; //선언과 동시에 값 할당
		for (int i = 0; i < 3; i++) {
			System.out.println("arr1[" + i + "] : " +arr1[i]);
		} //for문으로 어떤 값이 있는지 읽어봄, 초기값 0
		
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		for (int i = 0; i < 3; i++) {
			System.out.println("arr1[" + i + "] : " + arr1[i]);
		}
		
		double[]arr2 = new double [3];
		for (int i = 0; i < 3; i ++) {
			System.out.println("arr2[" + i + "] : " + arr2[i]);
		}
		
		arr2[0] = 0.1;
		arr2[1] = 0.2;
		arr2[2] = 0.3;
		for (int i = 0; i < 3; i++) {
			System.out.println("arr2[" + i + "] : " +arr2[i]);
		}
		
		String[]arr3 = new String[3];
		for (int i = 0; i < 3; i++) {
			System.out.println("arr3[" + i + "] : " + arr3[i]);
		}
		arr3 [0] = "Jan";
		arr3 [1] = "Feb";
		arr3 [2] = "Mar";
		
		for (int i = 0; i < 3; i++) {
			System.out.println("arr3[" +i + "] : " + arr3[i]);
		}
		
	}
}
