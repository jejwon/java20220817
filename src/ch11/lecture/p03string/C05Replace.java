package ch11.lecture.p03string;

public class C05Replace {
	public static void main(String[] args) {
		String s1 = "hangman";
		
		String s2 = s1.replace('a', 'e'); //바뀐 걸 리턴해줌/ s1자체가 바뀌는 것이 아님
		System.out.println(s1);
		System.out.println(s2);
		
		
		
		String s3 = "hashcode is code of";
		String s4 = s3.replace("code", "Koog");
		System.out.println(s3);
		System.out.println(s4);
	}
}
