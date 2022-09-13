package ch13.lecture.p04genericMethod;

import java.util.Arrays;
import java.util.List;

public class C02Method {
	public static void main(String[] args) {
		List<String> list1 = Arrays.<String>asList("java", "spring", "jsp");
		List<Integer> list2 = Arrays.<Integer>asList(3, 4, 5);
		
		List<String> list3 = Arrays.asList("java", "spring", "jsp");
		List<Integer> list4 = Arrays.asList(3, 4, 5);
		
		
	}
}
