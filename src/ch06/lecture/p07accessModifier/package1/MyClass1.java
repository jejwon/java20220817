package ch06.lecture.p07accessModifier.package1;

public class MyClass1 {
	//field
	//접근 제한자 생략하면 같은 패키지 내에서 사용 가능
	//package private (default)
	String name;
	
	//public : 다른 패키지에서도 사용 가능
	public int age;
	
	//private : 클래스 내에서만 사용 가능 (같은 패키지 내에서 사용 가능) 
	private String secret;
	
	
	
	//constructor
	
	//method
	//접근 제한자 생략하면 같은 패키지 내에서 사용 가능
	//package private (default)
	void printName() {
		System.out.println(name);
	}
	
	//public : 다른 패키지에서도 사용 가능
	public void printAge() {
		System.out.println(age);
	}
	
	public void setScret(String secret) {
		this.secret = secret; //secret은 private멤버
		                      //클래스 내에서 사용 가능
	}
	
	
	public void printSecret() {
		System.out.println(secret);
	}
}
