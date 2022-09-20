package ch16.book.p821;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ToListEx {
	public static void main(String[] args) {
		List<Student> totalList = Arrays.asList(
				new Student("홍길동", 10, Student.Sex.Male),
				new Student("김수애", 6, Student.Sex.Female),
				new Student("신용권", 10, Student.Sex.Male),
				new Student("박수미", 6, Student.Sex.Female)
				);
		
		List<Student> maleList = totalList.stream()
											.filter(s->s.getSex()==Student.Sex.Male)
											.collect(Collectors.toList());
		maleList.stream()
				.forEach(s -> System.out.println(s.getName()));
		
		System.out.println();
		
	}
}
