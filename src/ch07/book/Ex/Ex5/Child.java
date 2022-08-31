package ch07.book.Ex.Ex5;

public class Child extends Parent{
	private int studentNo;
	
	public Child(String name, int studentNo) {
		super(name); //부모클래스 호출,초기화
//		this.name = name; //할 필요 없어짐
		this.studentNo = studentNo;
	} 

}