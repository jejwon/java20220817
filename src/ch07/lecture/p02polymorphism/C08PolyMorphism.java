package ch07.lecture.p02polymorphism;

public class C08PolyMorphism {
	public static void main(String[] args) {
		String a = "mav";
		
		System.out.println(a.length());
		
		Object b = "brad";
		
//		System.out.println(b.length()); //object에는 length method xxx
		                                //상속되면서 String에 메소드 추가됨
	
		String c = (String) b;
		System.out.println(c.length()); //하위 타입으로 강제 타입변환
										//값을 잃을 수 있음
	
	
	}
}
