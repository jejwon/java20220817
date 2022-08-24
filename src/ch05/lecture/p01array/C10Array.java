package ch05.lecture.p01array;

public class C10Array {
	public static void main(String[] args) {
		int[][] a = {{3,4,5},{1,2,3}};
		int[][] b = new int [2][3];
		int[][] c = new int [3][]; //각 아이템 null
		
		System.out.println(b[0][0]);
		System.out.println(b[0][2]);
		System.out.println(b[0][1]);
		
		b[0][0] = 93;
		b[0][1] = 50;
		b[0][2] = 100;
		
		c[0] = new int[] {99, 88};
		System.out.println(c[0][0]);
		System.out.println(c[0][1]);
		
		c[1] = new int[] {1, 2};
		System.out.println(c[1][0]);
		System.out.println(c[1][1]);
		
		c[2] = new int[] {11, 23};
		System.out.println(c[2][0]);
		System.out.println(c[2][1]);
		
		
	}
}
