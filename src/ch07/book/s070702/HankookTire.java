package ch07.book.s070702;

public class HankookTire extends Tire{
	//field
	//constructor
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	//method
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) { //정상회전 (누적<최대)일 경우 실행
			System.out.println(location + "HankookTire 수명: " + (maxRotation-accumulatedRotation) + "회");
			return true;
		} else { //청크 (누적=최대)일 경우 실행
			System.out.println("*** " + location + "HankookTire 펑크 ***");
			return false;
		}
	}
}
