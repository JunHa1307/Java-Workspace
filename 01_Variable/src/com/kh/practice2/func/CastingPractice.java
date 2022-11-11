package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPractice {
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		double one = sc.nextDouble();
		
		System.out.print("영어 : ");
		double two = sc.nextDouble();
		
		System.out.print("수학 : ");
		double three = sc.nextDouble();
		
		System.out.printf("%d\n", (int)(one+two+three));
		System.out.printf("%d\n", (int)(one+two+three)/3);
	}
	
}
