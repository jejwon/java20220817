package ch05.book;

import java.util.Arrays;

public class P164ArrayInArrayEx {
	public static void main(String[] args) {
		
		
		int[][] mathScores = new int[2][3]; //전체 길이가 2, 아이템의 길이는 3
		for (int i = 0; i < mathScores.length; i++) {
			for (int k = 0; k<mathScores[i].length; k++) {
			System.out.println("mathScores[" + i + "][" + k +"]=" + mathScores[i][k]);
		}
	}
		System.out.println();
		
		int[][]englishScores = new int[2][];
		
		englishScores[0] = new int[2]; //아이템의 길이 설정: 아이템 0번은 2개의 아이템을 담을 수 있음
		englishScores[1] = new int[3]; //아이템 1번은 3개의 아이템을 담을 수 있음
		for (int i = 0; i<englishScores.length; i++) {
			for (int k = 0; k < englishScores[i].length; k++) {
				System.out.println("englishScores[" + i + "][" + k + "]=" + englishScores[i][k] );
			}
		}
		System.out.println();
		
		int[][]javaScores = {{95, 80} , {92, 96, 80}}; //배열을 만들 때 초기값 바로 설정
		for (int i = 0; i < javaScores.length; i++) {
			for(int k = 0; k < javaScores[i].length; k++) {
				System.out.println("javaScores[" + i + "][" + k + "]=" +javaScores[i][k]);
			}
		}
		
		//for 없이 배열 item 출력
		int[] a = {2, 3, 4, 5};
		System.out.println(Arrays.toString(a)); //import필요
		
		
		System.out.println(Arrays.toString(javaScores)); //의도대로 안됨
		
		System.out.println(Arrays.toString(javaScores[0]));
		System.out.println(Arrays.toString(javaScores[1]));
		
		System.out.println(Arrays.deepToString(javaScores)); //2차원 배열 출력 가능
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}

}
