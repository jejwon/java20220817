package ch04.book;

public class P123ForFloatCounterEx {
	public static void main(String[] args) {
		for(float x = 0.1f; x <= 1.0f; x += 0.1f) {
			System.out.println(x);
		} //0.1은 float타입으로 정확히 표현 불가
		  //x에 더해지는 실제값이 0.1보다 약간 큼
		  // 루프는 9번만 실행됨
	}
}
