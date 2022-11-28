package com.kh.chap02_abstractAndInterface.part02_family.run;

import com.kh.chap02_abstractAndInterface.part02_family.model.vo.*;

public class Run {

	public static void main(String[] args) {
		// 인터페이스 적용 전
//		Person p1 = new Mother("ㅇㅇㅇ",74,60,"출산");
//		Person p2 = new Baby("ddd",3.5,60);
//		
//		System.out.println(p1);
//		System.out.println(p2);
//		
//		p1.eat();// 엄마 : 몸무게 + 10, 건강도 - 10 ->  84, 50
//		p2.eat();// 아가 : 몸무게 + 3 , 건강도 +  1 -> 6.5, 61
//		
//		p1.sleep();//엄마 : 건강도 + 10 -> 84,60
//		p2.sleep();//아가 : 건강도 + 3 -> 6.5 64
//		
//		
//		System.out.println("===== 다음날 =====");
//		System.out.println(p1);
//		System.out.println(p2);
//		
		
		//인터페이스 적용 후
		Basic b1 = /*(Basic)*/new Mother("ㅇㅇㅇ",74,60,"출산");
		Basic b2 = new Baby("ddd",3.5,60);
		
		System.out.println(b1);
		System.out.println(b2);
		
		b1.eat();// 엄마 : 몸무게 + 10, 건강도 - 10 ->  84, 50
		b2.eat();// 아가 : 몸무게 + 3 , 건강도 +  1 -> 6.5, 61
		
		b1.sleep();//엄마 : 건강도 + 10 -> 84,60
		b2.sleep();//아가 : 건강도 + 3 -> 6.5 64
		
		System.out.println("===== 다음날 =====");
		System.out.println(b1);
		System.out.println(b2);
		
		/*
		 * 클래스에서 클래스를 상속받을 때 : extends 클래스 (단일상속만 가능) : 화살표 실선
		 * 클래스에서 인터페이스를 구현할 때 : implements 인터페이스, 인터페이스(다중구현) : 화살표 점선
		 * 인터페이스에서 인터페이스 상속 : extends 인터페이스, 인터페이스(다중상속가능) : 화살표 실선
		 * 
		 * 
		 * 			|추상클래스 					| 인터페이스
		 * ==================================================
		 * 상속개수 	| 단일상속						| 다중상속
		 * ==================================================
		 * 키워드  	| extends					| implements
		 * ==================================================
		 * 추상메소드	| 추상메소드 0개 이상				| 모든메소드가 추상메소드
		 * ==================================================
		 * 표현볍  	| 명시적 abstract 기술해야함		| 묵시적으로 abstract기술(생략가능)
		 * ==================================================
		 * 일반메소드 여부| O 						| X
		 * ==================================================
		 * 필드		| 일반필드 가질 수 있음			| 상수필드만 가질 수 있음(묵시적 public static final)
		 * 
		 * 배운순서
		 * extends 일반클래스 -> extends 추상클래스 --> implements 인터페이스
		 * --------------------------------------------------->
		 * 				뒤로 갈 수록 강제성이 짙어짐.
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
	}

}
