package ch06.lecture.p01field;

public class C03Field {
	public static void main(String[] args) {
		MyClass2 o1 = new MyClass2();
	
		o1.name = "java";
		o1.color = "blue";
		o1.age = 90;
		o1.score = 87;
		
		System.out.println(o1.name);
		
		
		MyClass2 o2 = new MyClass2();
		o2.name = "turner";
		o2.color = "blonde";
		o2.age = 35;
		o2.score = 110;
		
		System.out.println(o2.name);
	
		MyClass2 o3 = o1;
		System.out.println(o3.name); //o1과 같은 참조값을 가짐
	
	}
}
