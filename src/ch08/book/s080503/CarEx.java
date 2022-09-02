package ch08.book.s080503;

import ch08.book.s080502.Tire;
import ch08.book.s080502.HankookTire;
import ch08.book.s080502.KumhoTire;


public class CarEx {
	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.run();
		
		myCar.tires[0] = new KumhoTire();
		myCar.tires[1] = new KumhoTire();
		
		myCar.run();
	}
}
