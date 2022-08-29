package ch06.book.Ex.Ex16;

public class PrinterEx {
	public static void main(String[] args) {
		Printer printer = new Printer();
		printer.println(10); //instance method
		printer.println(true);
		printer.println(5.7);
		printer.println("홍길동");
	}
}
