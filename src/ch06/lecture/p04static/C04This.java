package ch06.lecture.p04static;

public class C04This {
	//this : 생성된 instance 참조값
	//this() : 다른 생성자 호출
	
	C04This(){ //1
		
	}
	C04This(int a){ //2
		this();	//2가 실행되면 1호출
		//field 초기화...
	}
	
	C04This(String s){ //3
		this(3);  // 3실행되면 2호출-> 2가 1호출
	}
}
