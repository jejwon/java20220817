package ch15.lecture.p04sortedSet;

import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class C02SortedSet {
	public static void main(String[] args) {
		SortedSet<Integer> set = new TreeSet<>();
		
		set.add(300);
		set.add(1);
		set.add(20);
		set.add(-1);
		System.out.println(set);
		
		System.out.println(set.first());
		System.out.println(set.last());
		
		System.out.println(set.headSet(100)); //100보다 작은 값
		System.out.println(set.tailSet(100)); //100보다 큰 값
		
		NavigableSet<Integer> nset = (NavigableSet<Integer>)set; //형변환
		
		System.out.println(nset.lower(99)); //99보다 작은 값
		System.out.println(nset.floor(99)); //99포함 작은 값
		System.out.println(nset.higher(100));// 100보다 큰 값
		System.out.println(nset.ceiling(100));//100포함 큰 값
		
		
		
		
		
		
	}
}
