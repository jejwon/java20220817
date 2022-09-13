package ch13.book.p658;

public class Box<T> { //결정되지않은 타입
	private T t;
	public T get() {
		return t;
	}
	
	public void set (T t) {
		this.t = t;
	}
}
