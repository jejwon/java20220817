package ch16.lecture.p02stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class C05IntStream {
	public static void main(String[] args) {
		
		//IntStream: 기본타입 int가 요소인 Stream
		
		
		//생성 방법1: of (static 메소드)
		int r1 = IntStream.of(9, 8, 7, -2, 3, 10)
				.sum();
		System.out.println(r1);
		
		//생성 방법2: Arrays.Stream (static 메소드)
		Arrays.stream(new int[] {10, 8, 4, 34, -5})
				.sum();
		
		//생성 방법3: IntStream.range (static 메소드)
		//            rangeClosed
		int r3 = IntStream.range(1, 11) //1-10
				.sum();
		System.out.println(r3);
		
		int r4 = IntStream.rangeClosed(1, 10)
				.sum();
		
		System.out.println(r4);
		
		//생성 방법4: IntStream.generate (static 메소드)
		IntStream.generate(()->1)
				.limit(5)
				.forEach(e->System.out.println(e));
		
		IntStream.generate(()->(int)(Math.random()*45)+1)	
				.limit(6)
				.forEach(e->System.out.println(e));
	}	
}
