package ch06.lecture.p04static;

public class C01Static {
	public static void main (String[] args) {
		MyClass1 o1 = new MyClass1("payback");
		o1.printName();
		
		MyClass1 o2 = new MyClass1("phoenix");
		o2.printName();
		
		o1.company = "topgun";
		System.out.println(o1.company);
		System.out.println(o1.name);
		
		System.out.println(o2.company);
		
		o1.company = "harddeck";
		System.out.println(o1.company);
		System.out.println(o2.company);
		
		o1.name = "maverick";
		System.out.println(o1.name);
		System.out.println(o2.name);
		
		MyClass1.company = "fightertown";
		System.out.println(o1.company);
		System.out.println(o2.company);
		System.out.println(MyClass1.company);
		
		MyClass1.printCompany();
		o1.printCompany(); //별로 안씀
		
	}
}
