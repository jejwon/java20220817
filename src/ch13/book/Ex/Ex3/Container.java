package ch13.book.Ex.Ex3;

public class Container <K, V>{
	private K key;
	private V value;
	
	public void set (K t, V u) {
		key = t;
		value = u;
	}
	public K getKey() {
		return key;
	}
	public V getValue() {
		return value;
	}
}
