package ch10.book;

public class P428 {
	public static void main(String[] args) {
		Dog dog = new Dog();
		changeDog(dog);
		
		Cat cat = new Cat();
		changeDog(cat);
	}
	
	public static void changeDog(Animal animal) { 
		if(animal instanceof Dog) {
			Dog dog = (Dog)animal; //ClassCastException: 위에서 Cat 객체를 주어 Dog타입 변환 불가
			
		}
	}
}

class Animal{}
class Dog extends Animal{}
class Cat extends Animal{}