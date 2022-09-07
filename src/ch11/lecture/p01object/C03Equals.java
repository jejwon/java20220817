package ch11.lecture.p01object;

//extends Object 생략 가능
//내가 만든 클래스의 상위클래스: object의 모든 메소드 사용 가능
public class C03Equals extends Object {
	public static void main(String[] args) {
		Object b1 = new Book();
		Book b2 = new Book();
		
		
		System.out.println("Object equals()");
		System.out.println(b1.equals(b2));//false -> override된 후 true
		System.out.println(b2.equals(b1));//false
		
		
		
		Object b3 = new Book(333);
		Object b4 = new Book(333);
		Book b5 = new Book(555);
		
		System.out.println(System.identityHashCode(b3));
		System.out.println(System.identityHashCode(b4));
		System.out.println(System.identityHashCode(b5));
		
		
		System.out.println("Book equals()");
		System.out.println(b3.equals(b4)); //true
		System.out.println(b4.equals(b3)); //true
		System.out.println(b5.equals(b3)); //false
	}
}



class Book extends Object {
	private int code;
	
	Book(){}
	
	Book(int code) {
		this.code = code;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Book) {
			Book o = (Book) obj;
			
			if(obj != null) { //nullpointerexception
				return this.code == o.code;
			}
		}
		return false;
	}
		
		@Override
		public int hashCode() {
			return code * 31;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
