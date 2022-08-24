package ch05.lecture.p01array;

public class C01Array {
	public static void main(String[] args) {
		// array : 여러 값을 저장하는 공간
		// 타입[]변수명;
		
		int [] arr1; //arr1배열이 저장하는 값의 타입은 int
		double[] arr2; 
		String[] arr3;
		
		int[] arr4;
		arr4 = new int[5]; //int 값 5개 저장할 공간 생성, 할당 (new연산자)
		
		arr4[0] = 10; //0번 인덱스에 10을 넣음
		arr4[1] = 11;
		arr4[2] = 12;
		arr4[3] = 13;
		arr4[4] = 14;
//		arr4[5] = 15; //5번 인덱스 없음
		
		System.out.println(arr4[0]);
		System.out.println(arr4[3]);
		
		int a = arr4[4];
		System.out.println(a);
		
		
		
		
		
		
		
		
		
		
		
	}
}
