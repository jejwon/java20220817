package ch10.book;

public class P424 {//ArrayIndexOutOfBoundsException: 실행 매개값을 주지 않음, 인덱스 사용 불가
	public static void main(String[] args) {
		String data1 = args[0];
		String data2 = args[1];
		
	
		System.out.println("args[0]: " + data1);
		System.out.println("args[1]: " + data2);
	}
}
