package ch05.lecture.p02reference;

public class C08Reference {
	public static void main(String[] args) {
		int[] a = {9, 8, 7};
		a = changeArray(a); //{2,4}로 리턴받음
		System.out.println(a[0]); //2번 실행 : 2
		
		
		int[] b = {5, 6, 7};
		b = changeArray(b); //{2,4}로 리턴받음
		System.out.println(b[0]);
		
		a[0] = 100;
		System.out.println(a[0]); //100으로 바뀜
		System.out.println(b[0]); //2 a의 값만 변경됨/ 다른 창고
		
	}
	
	public static int[] changeArray(int[] arr) {
		System.out.println(arr[0]); //1번 실행(a) : 9 / 3번 실행(b) : 5
		arr = new int[] {2, 4};
		
		return arr;
	}
}
