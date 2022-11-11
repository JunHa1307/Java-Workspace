package com.kh.practice.func;

import java.util.Scanner;

public class OperatorPractice {
	public void practice1() {
		Scanner sc = new Scanner(System.in);

		System.out.print("인원 수 : ");
		int num1 = sc.nextInt();

		System.out.print("사탕 수 : ");
		int num2 = sc.nextInt();

		System.out.println("1인당 사탕 개수 : " + num2 / num1);
		System.out.println("남는 사탕 개수 : " + num2 % num1);
	}

	public void practice2() {

		Scanner sc = new Scanner(System.in);

		System.out.print("이름 : ");
		String str = sc.nextLine();

		System.out.print("학년(숫자만) : ");
		int num1 = sc.nextInt();

		System.out.print("반(숫자만) : ");
		int num2 = sc.nextInt();

		System.out.print("번호(숫자만) : ");
		int num3 = sc.nextInt();

		System.out.print("성별(M/F) : ");
		char ch = sc.next().charAt(0);

		char ch2 = ch == 'M' ? '남' : '여';

		System.out.print("성적(소수점 아래 둘째자리까지 : ");
		double dou = sc.nextDouble();

		System.out.printf("%d학년 %d반 %d번 %s %s학생의 성적은 %.2f이다.", num1, num2, num3, str, ch2, dou);
	}

	public void practice3() {

		Scanner sc = new Scanner(System.in);

		System.out.print("나이 : ");
		int age = sc.nextInt();

		String str = (age < 14) ? "어린이" : (age < 20) ? "청소년" : "성인";
		System.out.println(str);
	}

	public void practice4() {
		Scanner sc = new Scanner(System.in);

		System.out.print("국어 :");
		int kor = sc.nextInt();

		System.out.print("영어 :");
		int eng = sc.nextInt();

		System.out.print("수학 :");
		int math = sc.nextInt();

		double avg = (kor + eng + math) / 3.0;
		String ok = (kor >= 40) && (eng >= 40) && (math >= 40) && (avg == 60) ? "합격" : "불합격";

		System.out.printf("합계 : %d\n", (kor + eng + math));
		System.out.printf("평균 : %.1f\n", avg);
		System.out.println(ok);
	}

	public void practice5() {

		Scanner sc = new Scanner(System.in);

		System.out.print("주민번호를 입력하세요(-포함) : ");
		char hao = sc.nextLine().charAt(7);
		String sx = (hao == '1' || hao == '3') ? "남자" : "여자";
		System.out.println(sx);
	}

	public void practice6() {

		Scanner sc = new Scanner(System.in);

		System.out.print("정수1 : ");
		int num1 = sc.nextInt();

		System.out.print("정수2 : ");
		int num2 = sc.nextInt();

		System.out.print("입력 : ");
		int input = sc.nextInt();

		boolean result = (input < num1) || (num2 < input) ? true : false;
		System.out.print(result);
	}

	public void practice7() {

		Scanner sc = new Scanner(System.in);

		System.out.print("입력1 : ");
		int num1 = sc.nextInt();

		System.out.print("입력2 : ");
		int num2 = sc.nextInt();

		System.out.print("입력3 : ");
		int num3 = sc.nextInt();

		boolean result = (num1 == num2) && (num2 == num3) ? true : false;
		System.out.println(result);
	}
	
	
}
