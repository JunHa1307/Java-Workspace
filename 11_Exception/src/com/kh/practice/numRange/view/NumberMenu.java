package com.kh.practice.numRange.view;

import com.kh.practice.numRange.controller.NumberController;
import com.kh.practice.numRange.exception.NumRangeException;

public class NumberMenu {
	
	public void menu() {
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		while(true) {
			System.out.print("정수1 : ");
			int num1 = sc.nextInt();
			System.out.print("정수2 : ");
			int num2 = sc.nextInt();
			
			try {
			new NumberController().checkDouble(num1, num2);
			System.out.println(num1 + "은(는) " + num2 + "의 배수인가 ? " + new NumberController().checkDouble(num1, num2));
			
			System.out.println("\n또는\n");
			}catch(NumRangeException e) {
				e = new NumRangeException("1부터 100 사이의 값이 아닙니다.");
				e.printStackTrace();
				return;
			}
		}
	}
}
