package ch08.book.Ex.Ex3;

public class SoundableEx{
	private static void printSound(Soundable soundable) {
		System.out.println(soundable.sound());
		
	}
	
	
	
	public static void main(String[] args) {
		printSound(new Cat());
		printSound(new Dog());
	}
	
class Cat implements Soundable{

	@Override
	public String sound() {
		return "야옹";
	}
}

class Dog implements Soundable{

	@Override
	public String sound() {
		return "멍멍";
	}
}

}
