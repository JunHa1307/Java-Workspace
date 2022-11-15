package com.kh.practice.array;

import java.util.Scanner;

public class ArrayPractice {
	Scanner sc = new Scanner(System.in);

	public void practice1() {
		int[] arr = new int[10];

		for (int i = 0; i < 10; i++) {
			arr[i] = i + 1;
			System.out.print(arr[i] + " ");
		}

	}

	public void practice2() {
		int[] arr = new int[10];
		for (int i = 0; i < 10; i++) {
			arr[i] = 10 - i;
			System.out.print(arr[i] + " ");
		}
	}

	public void practice3() {
		System.out.print("양의 정수 : ");
		int input = sc.nextInt();
		int[] arr = new int[input];
		for (int i = 0; i < input; i++) {
			arr[i] = i+1;
			System.out.print(arr[i]+ " ");
		}
	}
	public void practice4() {
		String[] arr = {"사과", "귤", "포도", "복숭아", "참외"};
		
		System.out.print(arr[1]);
	}
	 public void practice5(){
		 System.out.print("문자열 : ");
		 String str = sc.nextLine();
		 
		 System.out.print("문자 : ");
		 char ch = sc.nextLine().charAt(0);
		 int a = 0;
		 char[] chArr = new char[str.length()];
		 
		 System.out.printf("%s에 %c가 존재하는 위치(인덱스) : ",str,ch);
		 
		 for(int i = 0; i < chArr.length; i++) {
			 chArr[i] = str.charAt(i);
			 if (ch == chArr[i]) {
				 System.out.print(i+" ");
				 a++;
			 }
		 }
		 System.out.printf("\n%c 개수 : %d\n",ch,a);
	 }
	 public void practice6(){
		 String[] str = {"월","화","수","목","금","토","일"};
		 System.out.print("0 ~ 6 사이 숫자 입력 : ");
		 int num = sc.nextInt();
		 
		 if(num > 0 && num < 7) {
			 System.out.println(str[num]+"요일");
		 }else {
			 System.out.println("잘못 입력하셨습니다.");
		 }
	 }
	 public void practice7(){
		 System.out.print("정수 : ");
		 int num = sc.nextInt();
		 int[] arr = new int[num];
		 int sum = 0;
		 for(int i = 0; i < num; i++) {
			 System.out.printf("배열 %d번째 인덱스에 넣을 값 : ", i);
			 arr[i] = sc.nextInt();
		 }
		 for(int i = 0;i < num; i++) {
			 System.out.print(arr[i] + " ");
			 sum += arr[i];
		 }
		 System.out.println("\n총합 : "+sum);
	 }
	 public void practice8(){
		 System.out.print("정수 : ");
		 int num = sc.nextInt();
		 int[] arr = new int[num];
		 int j = 0;
		 
		 if(num < 3 && num % 2 == 0) {
			 System.out.println("다시 입력하세요");
			 practice8();
		 }else {
			 for(int i = 0; i<num;i++) {
				 arr[i]=j;
				 if(i*2<num) {
					j++;
				 }else {
					 j--;
				 }
			 }
		 }
		 for(int i = 0; i < num;i++) {
			 if(i==num-1) {
				 System.out.print(arr[i]);
			 }
			 
		 }
	 }
}
