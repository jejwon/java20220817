package ch07.book.s070703;

import ch07.book.s070702.HankookTire;
import ch07.book.s070702.KumhoTire;
import ch07.book.s070702.Tire;

public class CarEx {
	public static void main(String[] args) {
		Car car = new Car();
		
		for(int i = 1; i <= 5; i++) {
			int problemLocation = car.run();
			if (problemLocation != 0) {
				System.out.println(car.tires[problemLocation-1].location + "HankookTire로 교체"); 
				car.tires[problemLocation - 1] = 
						new HankookTire(car.tires[problemLocation-1].location, 15); //자동형변환되는 코드
			}
			System.out.println("-------------------------");
		}
	}
}
