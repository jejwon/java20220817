package ch16.lecture.p02stream;

import java.util.Optional;
import java.util.stream.Stream;

public class C03TerminalOperation {
	public static void main(String[] args) {
		Stream<String> stream1 = Stream.of("ironman", "hangman", "batman", "superman", "iceman");
		stream1.forEach((e)->System.out.println(e)); //순서 보장 안됨
		
		Stream<String> stream2 = Stream.of("ironman", "hangman", "batman", "superman", "iceman");
		Optional<String> o1 = stream2.reduce((a,b)-> a+ "," + b);
		System.out.println(o1.get());
		
		Stream<String> stream3 = Stream.of("ironman", "hangman", "batman", "superman", "iceman");
		String o2 = stream3.reduce("heros",(a,b)-> a + "," + b); //초기값이 있음->바로 받기, optional xx
		System.out.println(o2);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
