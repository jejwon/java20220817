package ch11.lecture.p04regex;

public class C01Regex {
	public static void main(String[] args) {
		//regular expression(regex)
		//정규 표현식, 정규식 표현
		//문자열의 패턴을 표현하는 코드(String)
		
		String str1 = "a";
		
		//하나의 문자
		String pattern1 = "a";
		
		System.out.println(str1.matches(pattern1));
		
		String s2 = "b";
		String p2 = "b";
		
		System.out.println(s2.matches(p2));
		
		String s3 = "bb";
		String p3 = "b";
		System.out.println(s3.matches(p3)); //false
		
		String s4 = "bbb";
		String p4 = "b+"; // + : 한 개 이상
		System.out.println(s4.matches(p4));//true
		System.out.println(s3.matches(p4));//true
		System.out.println(s2.matches(p4));//true
		
		System.out.println("".matches(p4));//false, 0개는 x
		
		
		String p5 = "b*"; // * : 0개 이상
		System.out.println("bbb".matches(p5));//true
		System.out.println("bb".matches(p5));//true
		System.out.println("b".matches(p5));//true
		System.out.println("".matches(p5));//true
		
		String p6 = "dog";
		System.out.println("dog".matches(p6));
		
		String p7 = "do + g"; //do가 포함되고 g로 끝남
		System.out.println("dog".matches(p7)); //true
		System.out.println("dooooooog".matches(p7)); //true
		
		
		String p8 = "[abcd]"; //[] : 안에 나열된 문자 중 하나
		System.out.println("a".matches(p8));
		System.out.println("b".matches(p8));
		System.out.println("c".matches(p8));
		System.out.println("e".matches(p8));
		System.out.println("A".matches(p8)); //false, 대소문자 구별
		
		String p9 = "[a-c]";
		System.out.println("a".matches(p9));
		System.out.println("b".matches(p9));
		System.out.println("d".matches(p9));
		System.out.println("A".matches(p9));
		
		String p10 = "[a-cA-C]";//[abcABC]
		System.out.println("a".matches(p10));
		System.out.println("A".matches(p10));
		System.out.println("d".matches(p10));
		System.out.println("abc".matches(p10));//false, 제시된 문자열 중 하나만
		
		System.out.println("abc".matches("[a-c]"));//true
		
		String p11 = "[^abcdefg]"; //[^] : 제외하고 
		System.out.println("a".matches(p11));//false
		System.out.println("h".matches(p11));
		System.out.println("0".matches(p11));
		
		String p12 = "[^a-z]";
		System.out.println("a".matches(p12));
		System.out.println("A".matches(p12));
		System.out.println("9".matches(p12));
		
		String p13 = "d[^o]+g";
		System.out.println("dog".matches(p13)); //false
		System.out.println("dag".matches(p13)); //true
		System.out.println("dabdsfjkhg".matches(p13)); //true
		
		
		//수량
		// + : 1개 이상
		// * : 0개 이상
		// ? : 0개 또는 1개
		// {n} : n개 
		//{n,}: n개 이상
		//{n, m}: n개 이상 m개 이하
		
		String p14 = "do + g";
		System.out.println("dog".matches(p14));
		System.out.println("dooooog".matches(p14));
		
		String p15 = "do*g";
		System.out.println("dog".matches(p15));
		System.out.println("dooooog".matches(p15));
		System.out.println("dg".matches(p15));
		
		String p16 = "do?g";
		System.out.println("dog".matches(p16)); //true
		System.out.println("dooooog".matches(p16)); //false
		System.out.println("dg".matches(p16));//true
		
		String p17 = "do{2}g";
		System.out.println("doog".matches(p17)); //true
		System.out.println("dooooog".matches(p17)); //false
		System.out.println("dog".matches(p17)); //false
		
		String p18 = "do{2,}g";
		System.out.println("doog".matches(p18)); //true
		System.out.println("dooooog".matches(p18)); //true
		System.out.println("dog".matches(p18)); //false
		
		String p19 = "do{2,5}";
		System.out.println("doog".matches(p19));
		System.out.println("dooooooooog".matches(p19));
		System.out.println("dooog".matches(p19));
		
		//기호
		// .  : 모든 글자 한개
		// \d : [0-9](digit)
		// \w : [a-zA-Z0-9_](word character)
		// \s : 공백(스페이스, 엔터, 탭)
		// ^ : 한 줄의 시작
		// $ : 한 줄의 끝
		
		String p20 = ".";
		System.out.println("a".matches(p20));
		System.out.println(" ".matches(p20));
		System.out.println("0".matches(p20));
		System.out.println("".matches(p20)); //false
		System.out.println("aa".matches(p20));//false
		System.out.println("aa".matches(".{2}"));
		
		String p21 = "\\d"; //java에서 \는 \\로 작성(string일 때)
		System.out.println("0".matches(p21));
		System.out.println("5".matches(p21));
		System.out.println("a".matches(p21)); //false
		System.out.println("".matches(p21)); //false
		System.out.println("99".matches(p21));//false
		
		String p22 = "\\d{8}";
		System.out.println("19880101".matches(p21));
		
		String p23 = "\\d{4}-?\\d{2}-?\\d{2}";
		System.out.println("1955-01-01".matches(p23));
		System.out.println("1988-0129".matches(p23));
		
		// () : 그룹
		// | : or 또는 
		String p24 = "(dog|cat)";
		System.out.println("dog".matches(p24));
		System.out.println("cat".matches(p24));
		
		String p25 = "\\d{4}|\\d{2}-?\\d{2}-?\\d{2}";
		System.out.println("17480101".matches(p25));
		System.out.println("955323".matches(p25));
		
		String p26 = "(dog)+";
		System.out.println("dog".matches(p26));
		System.out.println("dogdog".matches(p26));
		System.out.println("dg".matches(p26));
		
		
		// \. : . (dot)
		String p27 = "\\.";
		System.out.println("a".matches(p27));//false
		System.out.println(".".matches(p27));//true
		
		String p28 = "www\\.[a-z]+\\/com";
		System.out.println("www.naver.com".matches(p28));
		System.out.println("www.navercom".matches(p28));
				
		
	}
}
