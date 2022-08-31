package ch07.book.s070705;

public class ChildEx {
	public static void main(String[] args) {
		Parent parent = new Child();
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
//		parent.field2 = "data2"; //x  object와 string의 관계 *C08
//		parent.method3(); //x
		
		Child child = (Child)parent; //하위 타입으로 강제 타입변환
		child.field2 = "yyy";
		child.method3();
	}
}
