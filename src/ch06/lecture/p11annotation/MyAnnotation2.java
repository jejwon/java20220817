package ch06.lecture.p11annotation;

import ch05.book.Week;

public @interface MyAnnotation2 {
	String value() default ""; //element(attribute)
	int age() default 0; //모든 element가 default값을 가지고 있는 상태-> 값을 안줘도 됨
	Week week() default Week.MONDAY;
	
	String[] names() default {};
}
