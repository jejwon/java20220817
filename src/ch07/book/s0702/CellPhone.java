package ch07.book.s0702;

public class CellPhone {
	//field
	String model;
	String color;
	
	//constructor
	
	//method
	void powerOn() {System.out.println("power on");}
	void powerOff() {System.out.println("power off");}
	void bell() {System.out.println("ring");}
	void sendVoice(String message) {System.out.println("giver: " + message);}
	void receiveVoice(String message) {System.out.println("receiver: " + message);}
	void hangUp() {System.out.println("hang up");}
}
