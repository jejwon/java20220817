package ch15.book.Ex.Ex9;

import java.util.*;

public class MapEx {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);
		
		String name = null; // 최고 점수를 받은 아이디 저장
		int maxScore = 0; //최고 점수 저장
		int totalScore = 0; //점수 합계 저장
		
		//keySet 이용
		Set<String> keys = map.keySet();
			for(String key : keys) {
					Integer val = map.get(key);
				
					totalScore += val;
					
					if(val > maxScore) {
						maxScore = val;
						name = key;
					}
				}
		
		
		 System.out.println("평균 점수: " + totalScore/ (double)map.size());
		 System.out.println("최고 점수: " + maxScore);
		 System.out.println("최고 점수를 받은 아이디: " + totalScore);
	}
}
