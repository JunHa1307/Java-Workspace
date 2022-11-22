package com.kh.hw.shape.view;

import java.util.Scanner;

import com.kh.hw.shape.controller.*;

public class ShapeMenu {
	
	private Scanner sc = new Scanner(System.in);
	
	private SqureController scr = new SqureController();
	
	private TriangleController tc = new TriangleController();
	
	
	public void inputMenu() {
		System.out.println("===== 도형 프로그램 =====");
		System.out.println("3. 삼각형");
		System.out.println("4. 사각형");
		System.out.println("9. 프로그램 종료");
		System.out.print("메뉴 번호 : ");
		int menuNum = sc.nextInt();
		switch(menuNum) {
			case 3 :{
				triangleMenu();
				return;
			}case 4 :{
				squreMenu();
				return;
			}case 9 :{
				return;
			}
		}
		if(menuNum != 3 || menuNum != 4 || menuNum != 9) {
			System.out.println("잘못된 번호입니다. 다시 입력하세요.");
			inputMenu();
		}
	}
	
	public void triangleMenu() {
		System.out.println("===== 삼각형 =====");
		System.out.println("1. 삼각형 면적");
		System.out.println("2. 삼각형 색칠");
		System.out.println("3. 삼각형 정보");
		System.out.println("9. 메인으로");
		System.out.print("메뉴 번호 : ");
		int menuNum = sc.nextInt();
		if(menuNum == 1 || menuNum == 2 || menuNum == 3 || menuNum == 9) {
			inputSize(3,menuNum);
		}else {	
			System.out.println("잘못된 번호입니다. 다시 입력하세요.");
			triangleMenu();
		}
		triangleMenu();
	}
	
	public void squreMenu() {
		System.out.println("===== 사각형 =====");
		System.out.println("1. 사각형 둘레");
		System.out.println("2. 사각형 면적");
		System.out.println("3. 사각형 색칠");
		System.out.println("4. 사각형 정보");
		System.out.println("9. 메인으로");
		System.out.print("메뉴 번호 : ");
		int menuNum = sc.nextInt();
		if(menuNum == 1 || menuNum == 2 || menuNum == 3 || menuNum == 4 || menuNum == 9) {
			inputSize(4,menuNum);
		}else {
			System.out.println("잘못된 번호입니다. 다시 입력하세요.");
			squreMenu();
		}
		squreMenu();
	}
	
	public void inputSize(int type, int menuNum) {
		if(type == 3) {
			switch(menuNum) {
				 case 1 :{
					System.out.print("높이 : ");
					double height = sc.nextDouble();
					System.out.print("너비 : ");
					double width = sc.nextDouble();
					System.out.println(tc.calArea(height,width));
					break;
				}case 2 :{
					sc.nextLine();
					System.out.print("색깔을 입력하세요 : ");
					String color = sc.nextLine();
					tc.paintColor(color);
					break;
				}case 3 :{
					printInformation(3);
					break;
				}case 9 :{
					System.out.println("메인으로 돌아갑니다.");
					inputMenu();
				}
			}
		}else {
			switch(menuNum) {
				 case 1 :{
					System.out.print("높이 : ");
					double height = sc.nextDouble();
					System.out.print("너비 : ");
					double width = sc.nextDouble();
					System.out.println(scr.calPerimeter(height, width));
					break;
				}case 2 :{
					System.out.print("높이 : ");
					double height = sc.nextDouble();
					System.out.print("너비 : ");
					double width = sc.nextDouble();
					System.out.println(scr.calArea(height, width));
					break;
				}case 3 :{
					sc.nextLine();
					System.out.print("색깔을 입력하세요 : ");
					String color = sc.nextLine();
					scr.paintColor(color);
					break;
				}case 4 :{
					printInformation(4);
					break;
				}case 9 :{
					System.out.println("메인으로 돌아갑니다.");
					inputMenu();
				}
			}
		}
	}
	
	public void printInformation(int type) {
		if(type == 3) {
			System.out.println(tc.print());
		}else if (type == 4) {
			System.out.println(scr.print());
		}
	}
}
