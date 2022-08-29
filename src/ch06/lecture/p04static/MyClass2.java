package ch06.lecture.p04static;

public class MyClass2 {
	//(instance) field
	String name;
	
	
	//static field
	static String company = "topgun";
	static int rank;
	
	static { //여러개의 초기화, statement, 연산이 필요할 때
		int a = 30; // static block에 넣기
		int b = 90;
		rank = a * b;
	}
	
	static {
		
	}
	
	
	public MyClass2 (String name) {
		this.name = name;
	}
}
