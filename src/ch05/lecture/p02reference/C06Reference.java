package ch05.lecture.p02reference;

public class C06Reference {
	public static void main(String[] args) {
	int[] a = {9, 8};
	changeItems(a);
	
	System.out.println(a[0]);//9, a를 바꾸는 식 없음
}
	
	public static void changeItems(int[] arr) {
		System.out.println(arr[0]); //9
		arr = new int[] {3, 4}; //리턴하지 않아서 a가 바뀌지 않음
	}
}
