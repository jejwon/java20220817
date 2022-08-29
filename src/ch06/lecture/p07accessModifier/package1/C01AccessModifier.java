package ch06.lecture.p07accessModifier.package1;

public class C01AccessModifier {
	public static void main(String[] args) {
		

		MyClass1 o1 = new MyClass1();
		o1.name = "ice";
		o1.printName();
		
		o1.age = 99;
		o1.printAge();
		
		
		//private member는 같은 패키지여도 사용 불가
		//같은 클래스 내에서만 사용 가능
		//o1.secret = "mysecret";
		o1.setScret("my secret");
		o1.printSecret();
		
		String s = "java"; //f3 소스보기 
	}
}
