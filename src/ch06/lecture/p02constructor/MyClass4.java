package ch06.lecture.p02constructor;

public class MyClass4 {
	//fields
	String name;
	int age;
	
	//constructors
	public MyClass4(String name, int age) {
		//this: 앞으로 만들어질 객체의 참조값
		this.name = name; //field초기화 실패
		this.age = age;   //가까운 변수로 연산됨
		
	}

}
