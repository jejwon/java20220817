package ch05.lecture.p01array;

public class C11ForEach {
	public static void main(String[] args) {
		//향상된 for (enhanced for, for-each)
		
		int[] a = {5, 7, 9, 11};
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]); //인덱스 필요o
		}
		System.out.println("향상된 for문");
		for (int item : a) { //a배열에 있는 각 아이템마다 코드블럭 실행
			System.out.println(item); //인덱스 필요x
		}
  }
}