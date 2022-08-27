package ch06.lecture.p03method;

public class MyClass4 {
	
	//메소드리턴 타입: 메소드 내에서 반환하는 값의 타입
	//단, void는 리턴값이 없음
	void method1() {
		return; //메소드 종료의 의미로만 사용 가능
		//return: 메소드 종료, 값 반환
	}
	
	int method2() {
		return 3;
	}
	
	int method3() {
		return 5;
	}
	
	int method4() { //코드가 return값을 만나도록 작성
		int a = 3;
		if (a == 3) { //조건문이 return값을 만날 수 없다고 판단되어 오류
			return 10;
		}
		return 9; //return값 하나 더 
	}
	
	
}
