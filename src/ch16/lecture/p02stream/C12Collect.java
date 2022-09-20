package ch16.lecture.p02stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class C12Collect {
	public static void main(String[] args) {
		List<Integer> list1 = IntStream.range(1,100)
				.parallel()
				.filter(e -> e % 2 == 0)
				.collect(() -> new ArrayList<>(), //새 컨테이너 생성
						(c, e) -> c.add(e),       //원소를 컨테이너에 넣음
						(c1, c2)->c1.addAll(c2)); //두 컨테이너 병합
	
	System.out.println(list1);
	}
}
