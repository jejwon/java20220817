package ch13.book.p669;

public class StorageImpl<T> implements Storage<T> {
	
	private T[] array;
	
	public StorageImpl(int capacity) {
		this.array = (T[])(new Object[capacity]); 
	} // 타입 파라미터로 배열 생성-> new T[n] xxx => (T[])(new Object[n])으로 생성 가능
	
	@Override
	public void add(T item, int index) {
		array[index] = item;
		
	}

	@Override
	public T get(int index) {
		return array[index];
	}
}
