package com.kh.operator;

public class D_LogicalNegation {
	
	//논리 부정 연산자
	/*
	 * '!'(단항 연산자) not
	 * 
	 * 논리값 (true/false)
	 * 
	 * 논리값을 반대로 바꿔주는 연산자
	 */
	public void method() {
		
		System.out.println("true의 부정 : "+ !true);
		System.out.println("false의 부정 : "+ !false);
		
		boolean b = true;
		boolean b2 = !b;
		
		System.out.println("b : "+ b);
		System.out.println("b2 : "+ b2);
		
		//계산식에 논리 부정연산자 사용하기
		
		boolean b3 = !(5>3);
		System.out.println("b3 : "+ b3);
		
	}
	
	
	
}
