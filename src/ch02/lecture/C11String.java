package ch02.lecture;

public class C11String {
	public static void main(String[] args) {
		//String : 문자열
		
		//char : 문자 1개
		
		char a = '양'; //작은 따옴표
		String b = "java"; //큰 따옴표
		String c = ""; // 빈 문자열 가능 
		
		//+ 연산(연결연산)의 결과는 String
		String d = "hello";
		char e = '!';
		String f = d + e;
		System.out.println(f);
		
		String g = d +100;
		System.out.println(g);
		
		String h = d + 3.14;
		System.out.println(h);
		
		String i = d + true;
		System.out.println(i);
		
		String j = d + "world";
		System.out.println(j);
		
		//참조타입 (객체) ; 필드와 메소드가 있음
		
		String k = "bts";
		char l = k.charAt(0);  //charAt 메소드 : 그 순서에 있는 문자를 리턴
		int m = k.charAt(0);  //자동형변환
		
		char n = k.charAt(0);  //b
		char o = k.charAt(1);  //t
		char p = k.charAt(2);  //s
		
		
		System.out.println(n);
		System.out.println(o);
		System.out.println(p);
		
		
//		k.charAt(3); //IndexOutOfBoundsException 던져짐 (발생)
//		char q = k.charAt(-1);  //x
//		System.out.println(q);
		
		// length : 길이 리턴
		int s = k.length();
		System.out.println(s);
		
		String r = "javascript";
		System.out.println(r.length());
		
		System.out.println("hello world".length());
		System.out.println("".length());
		
		System.out.println(r.charAt(r.length()-1));
		
		// substring (int) : 그 순서의 문자부터 출력 from~부분스트링 리턴
		
		String t = r.substring(0);
		System.out.println(t);
		String t1 = r.substring(1);
		System.out.println(t1);
		String t3 = r.substring(3);
		System.out.println(t3);
		String t9 = r.substring(9);
		System.out.println(t9);
		String t10 = r.substring(10);
		System.out.println(t10);  //빈문자
		
		
		// substring (int, int) 2번째 parameter-1의 값까지 나옴
		String u = r.substring(0, 9);
		System.out.println(u);
		String u4 = r.substring(0, 4);
		System.out.println(u4);  //java
		System.out.println(r.substring(2, 4)); //va
		
			
	}
}
