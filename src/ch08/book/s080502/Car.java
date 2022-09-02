package ch08.book.s080502;

public class Car {
	Tire frontLeftTire = new HankookTire(); //인터페이스 타입 필드 선언과 초기 구현 객체 대입
	Tire frontRightTire = new HankookTire();
	Tire backLeftTire = new HankookTire();
	Tire backRightTire = new HankookTire();
	
	
	void run() { //인터페이스에서 설명된 roll()메소드 호출
		frontLeftTire.roll();
		frontRightTire.roll();
		backLeftTire.roll();
		backRightTire.roll();
	}
}
