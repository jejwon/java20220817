package practice;

public class C1prac1 {
	public static void main(String[] args) {
		int i = 3;
		int j = 0;
		
		j = i++; //3
		
		System.out.println("1 :" + i); //4
		System.out.println("2 :" + j); //3
		
		j = i - j;
		System.out.println("3 :" + -i); //-4
		System.out.println("4 :" + (j = -j)); //-1
		
		i++; //5
		++j; //0
		
		System.out.println("5 :" + i++); //5
		System.out.println("6 :" + ++j); //1
		System.out.println("7 :" + -i); //-6
		System.out.println("8 :" + -++j); //-2
		
		
		
		
	} 
}
