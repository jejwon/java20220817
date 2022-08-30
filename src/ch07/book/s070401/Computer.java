package ch07.book.s070401;

public class Computer extends Calculator {
	@Override
	double areaCircle(double r) {
		System.out.println("execute areaCircle() in object,Calculator");
		return Math.PI * r * r;
	}
	
}
