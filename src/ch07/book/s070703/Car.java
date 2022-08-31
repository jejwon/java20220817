package ch07.book.s070703;

import ch07.book.s070702.HankookTire;
import ch07.book.s070702.KumhoTire;
import ch07.book.s070702.Tire;

public class Car {
	//field
	
	Tire[] tires = { //p315 car 클래스의 필드를 배열로 줄임
		new Tire("앞왼쪽", 6),
		new Tire("앞오른쪽", 2),
		new Tire("뒤왼쪽", 3),
		new Tire("뒤오른쪽", 4)
	};
	
	//method
	int run() {
		System.out.println("자동차가 달립니다.");
		for(int i = 0; i < tires.length; i++) {
			if(tires[i].roll() == false) {
				stop();
				return (i + 1);
			}
		}
		return 0;
	}
	
	
	void stop() {
		System.out.println("자동차가 멈춥니다.");
	}
}
