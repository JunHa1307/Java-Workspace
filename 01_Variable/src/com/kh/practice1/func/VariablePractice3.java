package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice3 {

	public void Practice3() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("가로 : ");
		float garo = sc.nextFloat();
		System.out.print("세로 : ");
		float sero = sc.nextFloat();
		
		System.out.println("면적 : "+ (garo * sero));
		System.out.println("둘레 : "+ ((garo +sero)*2));
	}
	
}
