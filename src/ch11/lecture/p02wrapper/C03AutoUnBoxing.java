package ch11.lecture.p02wrapper;

public class C03AutoUnBoxing {
	public static void main(String[] args) {
		
		Integer a = 99;
		//참조타입을 기본타입으로 변경(unboxing)_
		int b = a.intValue(); 
		
		//참조타입을 기본타입으로 자동 변경(auto unboxing)
		int c = a; //ok
		
		Object d = 99;
//		Integer e = d; 상위타입을 하위타입이라고 할 수 없음
//		int f = d; 
		
		int g = (Integer) d; //o
		
		Object[] arr = {"java", 3, 3.14};
		String s = (String) arr[0];
		Integer i = (Integer) arr[1];
		double j = (Double) arr[2];
		
		double k = (double)arr[2]; 
		
		System.out.println("프로그램 실행 이어감");
	}
}
