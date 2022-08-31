package ch07.book.s070702;

public class Tire {
	//field
	public int maxRotation; //최대 회전수(타이어 수명)
	public int accumulatedRotation; //누적 회전수
	public String location; //타이어의 위치
	
	//constuctor
	public Tire(String location, int maxRotation) {
		this.location = location; //초기화
		this.maxRotation = maxRotation; //초기화
	}
	
	
	//method
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) { //정상회전 (누적<최대)일 경우 실행
			System.out.println(location + "Tire 수명: " + (maxRotation-accumulatedRotation) + "회");
			return true;
		} else { //청크 (누적=최대)일 경우 실행
			System.out.println("*** " + location + "Tire 펑크 ***");
			return false;
		}
	}
}
