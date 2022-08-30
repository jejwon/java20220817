package ch07.book.s0702;

public class DmbCellPhoneEx {
	public static void main(String[] args) {
		//DmbCellPhone 객체 생성
		DmbCellPhone dmbCellPhone = new DmbCellPhone("javaphone", "black", 10);
		
		//CellPhone으로부터 상속받은 필드
		System.out.println("model: " + dmbCellPhone.model);
		System.out.println("color: " +dmbCellPhone.color);
		
		//DmbCellPhone의 필드
		System.out.println("channel: " + dmbCellPhone.channel);
		
		//CellPhone으로부터 상속받은 메소드 호출
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("hello?");
		dmbCellPhone.receiveVoice("hello. this is hong");
		dmbCellPhone.sendVoice("nice to meet you");
		dmbCellPhone.hangUp();
		
		//DmbCellPhone의 메소드 호출
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.turnOffDmb();
	}
}
