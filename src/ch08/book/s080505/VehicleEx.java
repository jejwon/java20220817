package ch08.book.s080505;

public class VehicleEx {
	public static void main(String[] args) {
		Vehicle vehicle = new Bus();
		
		vehicle.run();
		//vehicle.checkFare(); xx Vehicle interface에 checkFare()가 없음
		
		Bus bus = (Bus)vehicle; //강제 타입 변환
		
		bus.run();
		bus.checkFare();//Bus클래스에는 checkFare()가 있음
	}
}
