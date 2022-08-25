package ch05.lecture.p03string;

public class C04Garbage {
	public static void main(String[] args) {
		//그림 : 07쓰레기.png
		int[] a = {3, 4};
		a = new int[] {9, 10};
		//교체되고 남은 instance는 자동 제거됨
	}
}
