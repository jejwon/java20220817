package ch11.lecture.p01object;

public class C02Equals { //object의 equals 메소드
	public static void main(String[] args) {
		Object o1 = new Object();
		Object o2 = new Object();
		
		System.out.println(o1.equals(o2));//false
		System.out.println(o2.equals(o1));//false
		System.out.println(o1.equals(o1));//true
		System.out.println(o2.equals(o2));//true
		
		System.out.println("String equals()");
		
		Object o3 = new String("topgun"); //내용물만 같고 전혀 다른 객체
		Object o4 = new String("topgun"); //override: 문자열이 같으면 true  
		
		System.out.println(o3.equals(o4)); //true
		System.out.println(o4.equals(o3));//true
		System.out.println(o3.equals(o3));//true
		System.out.println(o4.equals(o4));//true
		
		System.out.println("String ==");
		System.out.println(o3 == o4); //false, 객체의 참조값 비교 
	}
}
