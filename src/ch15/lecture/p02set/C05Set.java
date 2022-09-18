package ch15.lecture.p02set;

import java.util.*;

public class C05Set {
	public static void main(String[] args) {
		Set<Coffee> set = new HashSet<>();
		set.add(new Coffee("아메리카노"));
		set.add(new Coffee("라테"));
		set.add(new Coffee("카푸치노"));
		set.add(new Coffee("라테"));
		
		System.out.println(set.size());
		System.out.println(set);
	}
}

class Coffee {
	private String name;

	public Coffee(String name) {
		super();
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override //equals메소드 재정의 전-> hashCode재정의
	public boolean equals(Object obj) { //중복저장방지
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Coffee other = (Coffee) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
	
}




