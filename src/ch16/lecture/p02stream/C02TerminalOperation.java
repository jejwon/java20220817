package ch16.lecture.p02stream;

import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class C02TerminalOperation {
	public static void main(String[] args) {
		//stream 연산
		//1. 중간 연산 (중간 처리) intermediate operation
		//2. 종료 연산 (최종 처리) terminal operation
		
		//구분법: 중간 연산(method)은 리턴타입이 stream
		//        최종 연산(method)는 리턴타입이 stream이 아님(주로)
		
		Stream<String> stream1 = List.of("ironman", "hangman", "batman", "superman", "iceman").stream();
		
		//findAny : 아무거나 하나
		Optional<String> option1 = stream1.findAny();
		System.out.println(option1.orElse("없네용"));
		
		//findFirst: 첫번째 element
//		Optional<String> option2 = stream1.findFirst(); xxx 앞에서 종료 연산 -> 재사용 불가
//		System.out.println(option2.orElse("없네용"));   xxx
		
		Stream<String> stream2 = List.of("ironman", "hangman", "batman", "superman", "iceman").stream();
		
		//findFirst: 첫번째 element
		Optional<String> option2 = stream2.findFirst(); 
		System.out.println(option2.orElse("없네용"));   
		
		//max: 가장 큰 element
		Stream<String> stream3 = List.of("ironman", "hangman", "batman", "superman", "iceman").stream();
		Optional<String> option3 = stream3.max((a,b)-> a.compareTo(b));
		System.out.println(option3.get());
		
		//min: 가장 작은 element
		Stream<String> stream4 = List.of("ironman", "hangman", "batman", "superman", "iceman").stream();
		Optional<String> option4 = stream4.min((a,b)-> a.compareTo(b));
		System.out.println(option4.get());
				
		//
		IntStream stream5 = IntStream.of(100, 200, 300, 50, 40, -7, -89);
		OptionalInt max1 = stream5.max();
		System.out.println(max1.getAsInt());
		
		
		IntStream stream6 = IntStream.of(100, 200, 300, 50, 40, -7, -89);
		OptionalInt min2 = stream6.min();
		System.out.println(min2.getAsInt());
		
		
		
		
		
	}
}
