package com.kh.practice.numRange.view;

import java.util.Scanner;

import com.kh.practice.numRange.controller.NumberController;
import com.kh.practice.numRange.exception.NumRangeException;

public class NumberMenu {
	private Scanner sc = new Scanner(System.in);
	private NumberController nc = new NumberController();
	
	public void menu() {
		while(true) {
			System.out.print("정수1 : ");
			int num1 = sc.nextInt();
			System.out.print("정수2 : ");
			int num2 = sc.nextInt();
			
			try {
			nc.checkDouble(num1, num2);
			System.out.println(num1 + "은(는) " + num2 + "의 배수인가 ? " + nc.checkDouble(num1, num2));
			
			System.out.println("\n또는\n");
			}catch(NumRangeException e) {
				e = new NumRangeException("1부터 100 사이의 값이 아닙니다.");
				e.printStackTrace();
				return;
			}
		}
	}
}
