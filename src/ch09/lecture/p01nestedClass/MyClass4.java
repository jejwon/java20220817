package ch09.lecture.p01nestedClass;

public class MyClass4 {
	public static void main(String[] args) {
		
		//lambda expression (ch14)
		//클래스 구현, 메소드 시그니처 생략 가능
		//추상메소드가 하나인 경우만 사용 가능 
		MyInterface4 l = () -> { //메소드명 생략- 파라미터부터 작성 가능
			System.out.println("재정의한 메소드"); //재정의할 메소드가 하나일 떄만!(추상)
			//default는 여러개 있어도 o
		};
	}
}

interface MyInterface4{
	void mehtod();
}






