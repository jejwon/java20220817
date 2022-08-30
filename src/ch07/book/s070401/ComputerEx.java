package ch07.book.s070401;

public class ComputerEx {
	public static void main(String[] args) {
		int r = 10;
		
		Calculator calculator = new Calculator();
		System.out.println("original surface area: " + calculator.areaCircle(r));
		System.out.println();
		
		Computer computer = new Computer();
		System.out.println("original surface area: " + computer.areaCircle(r));
	}
}
