package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice2 {
	
	public void Practice2() {
	
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 정수 : ");
		int first = sc.nextInt();
		System.out.print("두 번째 정수 : ");
		int second = sc.nextInt();
		
		int one = first + second;
		int two = first - second;
		int three = first * second;
		int four = first / second;
		
		System.out.println("더하기 결과 : "+ one);
		System.out.println("빼기 결과 : "+ two);
		System.out.println("곱하기 결과 : "+ three);
		System.out.println("나누기 결과 : "+ four);
	}

}
