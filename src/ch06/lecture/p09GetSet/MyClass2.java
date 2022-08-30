package ch06.lecture.p09GetSet;

public class MyClass2 {
	//field는 특별한 이유가 없으면 private
	private String name;
	private int age;
	private boolean alive;
	
	//대신 getter, setter method 공개 (public)
	public void getAge(int age) {
		this.age = age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public boolean isAlive() { //boolean type getter는 is로 작성
		return alive;
	}

	public String getName() { //source: generator 
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
