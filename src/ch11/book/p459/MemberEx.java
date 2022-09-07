package ch11.book.p459;

public class MemberEx {
	public static void main(String[] args) {
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");
		
		if(obj1.equals(obj2)) { //매개값: Member, 필드값 동일 ->true
			System.out.println("obj1과 obj2는 동일합니다.");
		} else {
			System.out.println("obj1과 obj2는 동일하지 않습니다.");
		}
		
		if(obj1.equals(obj3)) { //매개값: Member, 필드값 다름 -> false
			System.out.println("obj1과 obj3은 동일합니다.");
		} else {
			System.out.println("obj1과 obj3은 동일하지 않습니다.");
		}
	}
}
