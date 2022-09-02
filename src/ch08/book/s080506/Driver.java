package ch08.book.s080506;

import ch08.book.s080505.Bus;
import ch08.book.s080505.Vehicle;

public class Driver {
	public void drive(Vehicle vehicle) { //bus,taxi객체
		if(vehicle instanceof Bus) { //vehicle 매개 변수가 참조하는 객체가 Bus인지 조사
			Bus bus = (Bus)vehicle; //bus객체일 경우 안전하게 강제 타입 변환
			bus.checkFare(); //bus 타입으로 강제 타입 변환하는 이유
		}
		vehicle.run();
	}
}
