package com.kh.chapter01_abstraction.model.vo;

public class Student {
	/*
	 * 클래스의 구조
	 * 
	 * public class 클래스명 {
	 * 		// 필드부
	 * 
	 * 		// 생성자부
	 * 
	 * 		// 메서드부
	 * }
	 * 
	 */
	
	//[필드부]
	// 접근제한자 자료명 필드명;
	
	/*
	 * 접근제한자 : 이 필드에 접근할 수 있는 범위를 제한 할 수 있음.
	 * 			(public +> protected #> default ~> private-)
	 * 			클래스 영역 안에서 필드를 선언할 때 반드시 접근제한자를 써 줘야함
	 */
	
	public String name; // name == 필드명
	public int age;
	public double height;
	
}
