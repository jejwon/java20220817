package ch15.book.Ex.Ex10;

import java.util.TreeSet;

public class TreeSetEx {
	public static void main(String[] args) {
		TreeSet<Student> treeSet = new TreeSet<>();
		treeSet.add(new Student("blue", 39));
		treeSet.add(new Student("red", 86));
		treeSet.add(new Student("white", 92));
		
		Student student = treeSet.last();
		System.out.println("최고점수: " + student.score);
		System.out.println("최고 점수를 받은 아이디: " + student.id);
		
		
	}
}
