package ch16.lecture.p02stream;

import java.util.stream.Stream;

public class C17MethodReference {
	public static void main(String[] args) {
		Stream.of("spring" , "summer", "fall", "winter")
			.forEach(e -> System.out.println(e));
		
		Stream.of("spring" , "summer", "fall", "winter")
			.forEach(System.out:: println);
	}
}
