package ch11.book.p459;

public class Member {
	public String id;
	
	public Member(String id) {
		this.id = id;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) { //매개값이 Member타입인지 확인
			Member member = (Member) obj; //Member타입으로 강제타입변환
			if(id.equals(member.id)) { //id필드값이 동일한지 검사
				return true;			//동일하다면 true 리턴
			}
		}
		return false;
	}
}
