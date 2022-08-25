package ch05.lecture.p03string;

public class C01String {
	//그림 06String.png
	public static void main(String[] args) {
		int a = 3;
		int b = 3;
		
		System.out.println(a==b);//true
		
		String s1 = "java";
		String s2 = "java";
		String s3 = "ja";
		String s4 = "va";
		String s5 = s3 + s4; //java 
		
		System.out.println(s1 == s2); //true
		System.out.println(s1 == s5); //false //content를 비교하지 않음 XXX
		
		
		System.out.println(System.identityHashCode(s1)); //참조변수가 가지고 있는 참조값
		System.out.println(System.identityHashCode(s2));// s1 = s2 참조값이 같음
		
		System.out.println(System.identityHashCode(s5)); //참조값이 다름
		
		//string content 비교
		System.out.println(s1.equals(s5));
		System.out.println(s1.contentEquals(s5));
	}
	
}
