package ch16.lecture.p02stream;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class C22GroupingBy {
	public static void main(String[] args) {
		Map<String, List<Integer>> map = Stream.of(3, 4, 5, 6, 7, 8, 9, 10)
			.collect(Collectors.groupingBy((e)-> (e % 2 == 0 ? "even" : "odd")));
		System.out.println(map);
		
		 Map<String, IntSummaryStatistics> map2 = Stream.of(3, 4, 5, 6, 7, 8, 9, 10)
				.collect(Collectors.groupingBy((e)-> (e % 2 == 0 ? "even" : "odd")
						, Collectors.summarizingInt(Integer::intValue)));
		 
		 
			System.out.println("even sum" + map2.get("even").getSum());
			System.out.println("odd sum" + map2.get("odd").getSum());
			
		Map<String, Long> map3 = Stream.of(3, 4, 5, 6, 7, 8, 9, 10)
				.collect(Collectors.groupingBy((e) -> (e % 2 == 0) ? "even" : "odd"
						, Collectors.counting()));
						
						System.out.println(map3);
	}
}
