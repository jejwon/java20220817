package ch16.book.p829;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


import ch16.book.p821.Student;

public class GroupingByEx {
	public static void main(String[] args) {
		List<Student> totalList = Arrays.asList(
			new Student("홍길동", 10, Student.Sex.Male, Student.City.Seoul),	
			new Student("김수애", 6, Student.Sex.Female, Student.City.Pusan),
			new Student("신용권", 10, Student.Sex.Male, Student.City.Pusan),
			new Student("박수미", 6, Student.Sex.Female, Student.City.Seoul)
			);
				
		Map<Student.Sex,List<Student>> mapBySex = totalList.stream()
															.collect(Collectors.groupingBy(Student :: getSex));
				
		System.out.println("(남학생)");
		mapBySex.get(Student.Sex.Male).stream()
									.forEach(s->System.out.println(s.getName()+ " "));
		
		System.out.println("(여학생)");
		mapBySex.get(Student.Sex.Female).stream()
		.forEach(s->System.out.println(s.getName()+ " "));
		
		Map<Student.City, List<String>> mapByCity = totalList.stream()
															.collect(
																	Collectors.groupingBy(
																			Student::getCity,
																			Collectors.mapping(Student::getName, Collectors.toList())));
		
		System.out.println("(서울)");
		mapByCity.get(Student.City.Seoul).stream().forEach(s->System.out.print(s + " "));
		System.out.println();
		
		System.out.println("(부산)");
		mapByCity.get(Student.City.Pusan).stream().forEach(s->System.out.print(s + " "));
	
	
	
	
	
	
	}
}
