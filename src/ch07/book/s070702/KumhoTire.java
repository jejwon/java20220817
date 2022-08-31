package ch07.book.s070702;

public class KumhoTire extends Tire{
	//field
		//constructor
		public KumhoTire(String location, int maxRotation) {
			super(location, maxRotation);
		}
		
		//method
		@Override
		public boolean roll() {
			++accumulatedRotation;
			if(accumulatedRotation < maxRotation) { //정상회전 (누적<최대)일 경우 실행
				System.out.println(location + "KumhoTire 수명: " + (maxRotation-accumulatedRotation) + "회");
				return true;
			} else { //청크 (누적=최대)일 경우 실행
				System.out.println("*** " + location + "KumhoTire 펑크 ***");
				return false;
			}
		}
}
