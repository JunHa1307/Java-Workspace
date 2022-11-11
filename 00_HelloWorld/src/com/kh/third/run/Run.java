package com.kh.third.run;

import com.kh.third.MethodTest;

public class Run {
	
	public static void main(String[]args) {
		
		//1. 사용하고자 하는 클래스 임포트
		MethodTest mt = new MethodTest();
		
		//2. 실행하고자 하는 일반 메소드 실행
		mt.printMethodA();
		
		System.out.println("메인 메소드 종료.");
		
	}

}
