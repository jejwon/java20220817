package practice;

public class C1prac2 {
	public static void main(String[] args) {
		int i = 0;
		int j = 0;
		
		i++; //1
		
		System.out.println("1:" + i); //1
		
		++i; //2
		
		System.out.println("2:" + i); //2
		
		j = i++; //2 -> 3
		
		System.out.println("3:" + j); //2
		
		j = ++i; //4
		
		System.out.println("4:" + j); //4
		
		j = i++; //4 -> 5
		
		System.out.println("5:" + i++); //5
		System.out.println("6:" + ++j); //5
	}
}
