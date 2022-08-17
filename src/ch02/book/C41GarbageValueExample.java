package ch02.book;

public class C41GarbageValueExample {
	public static void main(String[] args) {
		byte var1 = 125;
		byte var2 = 125;
		for (int i = 0; i < 5; i++) { //for문 block 5번 실행
			var1++;                   //overflow : garbage value
			var2++;
			System.out.println("var1: " + var1 + "\t" + "var2: " +var2);
		}
	}
}
