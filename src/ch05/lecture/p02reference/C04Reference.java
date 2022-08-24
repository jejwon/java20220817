package ch05.lecture.p02reference;

public class C04Reference {
	public static void main(String[] args) {
		int a = 3; // 기본타입
		printVar(a); // a가 가지고 있는 값 3을 넘겨줌
		int b = 5;
		printVar(b); // 5 
		
		int[] c = {9, 1, 2}; //참조타입
		printArray(c); //9
		
		int[] d = {99, 88, 77};
		printArray(d); //99
	}

	private static void printVar(int a) { //기본타입
		System.out.println(a);
	}
	
	private static void printArray(int[] c) { //참조타입
		System.out.println(c[0]);
	}

}
