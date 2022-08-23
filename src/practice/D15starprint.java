package practice;

public class D15starprint {
	public static void main(String[] args) {
		System.out.println("=========2차원 배열 별찍기==========");
		starPrint1(5);
		System.out.println("==========오른쪽 삼각형 별찍기==========");
		starPrint2(5);
		System.out.println("==========왼쪽 삼각형 별찍기==========");
		starPrint3(5);
		
	}
//	=======================================================================================
	public static void starPrint1(int a) { //2차원 배열 별찍기
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("*");
			} 
			System.out.println();
		}
	}
//	====================================================================================
		public static void starPrint2 (int b) { //오른쪽 삼각형 별찍기
		for (int i = 0; i < b; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
//		====================================================================================
		public static void starPrint3 (int c)  {//왼쪽 삼각형 별찍기 ?
			for (int i = 0; i < 5; i++) {
				for (int j = 5; j >= 0; j--) {
					if (i < j) {
						System.out.print(" ");
					} else {
						System.out.print("*");
					}
				}
				System.out.println();
			}
		
		
		
		}
			
		
		
		
}	
	
	
	
	

