package ch07.book.s0706.package2;

import ch07.book.s0706.package1.A;

public class D extends A{
	public D() { //new연산자 xxx, 자식 생성자에서 super()로 A생성자 호출
	super(); //o
	this.field = "value";//o
	this.method();//o
	}
}
