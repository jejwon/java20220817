package ch06.lecture.p11annotation;

import ch05.book.Week;

public class C02Element {
	@MyAnnotation2(value = "hangman")
	private int i;
	
	
	@MyAnnotation2(value = "ice")
	private int j;
	
	@MyAnnotation2("mav") // (value =) 하나일 때 생략 가능
	private int k;
	
	@MyAnnotation2
	private int l;
	
	@MyAnnotation2(value = "ice" , age = 30)
	private int m;
	
	@MyAnnotation2(week = Week.TUESDAY)
	private int o;
	
	@MyAnnotation2(names = {"mav", "phoenix"})
	private int p;
	
	@MyAnnotation2(names = {"rooster"})
	private int q;
	
	@MyAnnotation2(names = "rooster") //배열이 하나일 때 괄호 생략 가능
	private int r;
}
