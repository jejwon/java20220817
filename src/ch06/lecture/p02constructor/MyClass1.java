package ch06.lecture.p02constructor;

public class MyClass1 {
	//fields
	String name;
	
	//생성자(constructor)
	//하는일: instance생성시 초기화 
	//생성자명 : 클래스명과 같다
	// () :파라미터 목록
	//{} :실행코드
	public MyClass1(){
		System.out.println("파라미터 없는 생성자 실행됨");
		}
	
	//생성자는 파라미터 타입, 갯수, 순서를 구분해서 여러개 만들 수 있음
	//생성자 overloading
	
	public MyClass1 (String n) {
		System.out.println("스트링 파라미터 하나 받는 생성자 실행됨");
		name = n;
	}
}
