package com.kh.chap01_math.run;


// import java.lang;
// 생략 가능, 보이진 않지만 항상 자동으로 java.lang패키지가 import되어있음.
public class MathRun {

	public static void main(String[] args) {
		
		// Math 클래스(수학과 관련된 기능을 제공하고 있음)
		
		// PI => Math클래스 내에 상수필드로 정의되어 있음
		System.out.println("PI값 : " + Math.PI);
		
		// 메소드명(매개변수) : 반환형
		// 올림 => Math.ceil(double); : 반환값 double
		double num1 = 4.349;
		System.out.println("올림 : " + Math.ceil(num1));
		
		// 반올림 => Math.round(double) : 반환값이 long형
		System.out.println("반올림 : " + Math.round(num1));
		
		// 버림 => Math.floor(double) : 반환값이 double형
		System.out.println("버림 : " + Math.floor(num1));
		
		// 가장 가까운 정수값을 알아낸 후 실수형 반환 : rint
		System.out.println("가장 가까운 정수값 : " + Math.rint(num1));
		
		// 절대값 => math.abs(int/double/long/float) : 반환값이 매개변수 자료형 그대로
		int num2 = -10;
		System.out.println("절대값 : " + Math.abs(num2));
		
		// 최소값 => Math.min(int,int) : 반환값 int
		System.out.println("최소값 : " + Math.min(1235, 5));
		
		// 최대값 => Math.max(int,int) : 반환값 int
		System.out.println("최대값 : "+ Math.max(1, 159));
		
		// 제곱근(루트) => Math.sqrt(double) : 반환값 double
		System.out.println("4의 제곱근 : " + Math.sqrt(4));
		
		// 제곱 => Math.pow(double,double) : 반환값 double
		System.out.println("2의 10제곱 : " + Math.pow(2,10));
		
		/*
		 * java.lang.Math 클래스의 특징
		 * - 모든 필드 => 상수 필드
		 * - 모든 메소드 => 스태틱 메소드
		 * 
		 * 모든게 다 static이기 때문에 Math.필드 or Math.메서드명으로 다 접근가능(객체 생성할 필요가 없음)
		 * Math클래스의 생성자가 private이다. (객체생성불가)
		 * 
		 * 
		 */
	}

}
