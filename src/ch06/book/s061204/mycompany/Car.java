package ch06.book.s061204.mycompany;

import ch06.book.s061204.hankook.*; //특정 패키지 안의 모든 클래스 import *
import ch06.book.s061204.kumho.*;
import ch06.book.s061204.hyundai.Engine;

public class Car {
	public static void main(String[] args) {
		//field
		Engine engine = new Engine();
		SnowTire tire1 = new SnowTire();
		BigWidthTire tire2 = new BigWidthTire();
		
		
		ch06.book.s061204.hankook.Tire tire3 = new ch06.book.s061204.hankook.Tire();
		ch06.book.s061204.kumho.Tire tire4 = new ch06.book.s061204.kumho.Tire();
	}
	
	
}
