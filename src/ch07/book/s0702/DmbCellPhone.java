package ch07.book.s0702;

public class DmbCellPhone extends CellPhone {
	//field
	int channel;
	
	//constructor
	DmbCellPhone(String model, String color, int channel) {
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	
	//method
	void turnOnDmb() {
		System.out.println("channel " + channel + "start");
	}
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("channel " +channel + "change");
	}
	void turnOffDmb() {
		System.out.println("stop Dmb");
	}
}
