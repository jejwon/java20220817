package practice;

public class Test {
	public static void main(String[] args) {
		String s1 = "spring";
		String s2 = "sp";
		
		s2 += "ring";
		
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
	}
}
