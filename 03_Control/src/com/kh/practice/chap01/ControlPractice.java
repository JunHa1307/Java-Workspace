package com.kh.practice.chap01;

import java.util.Scanner;

public class ControlPractice {
	public void practice1() {

		System.out.printf("1.입력\n2.수정\n3.조회\n4.삭제\n7.종료\n");

		Scanner sc = new Scanner(System.in);
		System.out.print("메뉴 번호를 입력하세요 : ");
		int num = sc.nextInt();
		String menu = "";

		if (num == 1) {
			menu = "입력";
		} else if (num == 2) {
			menu = "수정";
		} else if (num == 3) {
			menu = "조회";
		} else if (num == 4) {
			menu = "삭제";
		} else if (num == 7) {
			menu = "종료";
		}//switch문이 더 나음
		System.out.printf("%s 메뉴 입니다.\n", menu);
	}

	public void practice2() {

		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 한개 입력하세요 : ");
		int num = sc.nextInt();

		if (num > 0) {
			if ((num % 2) == 0) {
				System.out.println("짝수다.");
			} else
				System.out.println("홀수다.");
		} else
			System.out.println("양수만 입력해주세요.");

	}

	public void practice3() {

		Scanner sc = new Scanner(System.in);
		System.out.print("국어 점수 : ");
		int num1 = sc.nextInt();
		System.out.print("영어 점수 : ");
		int num2 = sc.nextInt();
		System.out.print("수학 점수 : ");
		int num3 = sc.nextInt();

		double avg = (num1 + num2 + num3) / 3;
		int sum = (num1 + num2 + num3);

		if ((num1 > 39 && num2 > 39 && num3 > 39) && avg > 59) {
			System.out.println("국어 점수 : " + num1);
			System.out.println("영어 점수 : " + num2);
			System.out.println("수학 점수 : " + num3);
			System.out.println("합계 : " + sum);
			System.out.println("평균 : " + avg);
			System.out.println("축하합니다, 합격입니다!");
		} else
			System.out.println("불합격입니다.");

	}

	public void practice4() {

		Scanner sc = new Scanner(System.in);

		System.out.print("1 ~ 12월 사이의 정수입력 : ");
		int month = sc.nextInt();

		String season = "";

		switch (month) {
		case 1:
		case 2:
		case 12:
			season = "겨울";
			break;
		case 3:
		case 4:
		case 5:
			season = "봄";
			break;
		case 6:
		case 7:
		case 8:
			season = "여름";
			break;
		case 9:
		case 10:
		case 11:
			season = "가을";
			break;
		default:
			System.out.printf("%d은 잘못 입력된 달입니다.\n", month);
			practice4();
			return;
		}
		System.out.printf("%d월은 %s입니다.\n", month, season);

	}

	public void practice5() {

		Scanner sc = new Scanner(System.in);

		System.out.print("아이디 : ");
		String idin = sc.nextLine();
		System.out.print("비밀번호 : ");
		String pwin = sc.nextLine();

		if (idin.equals("minmin")) {
			if (pwin.equals("Min1234")) {
				System.out.println("로그인 성공");
			} else
				System.out.println("비밀번호가 틀렸습니다.");
		} else
			System.out.println("아이디가 틀렸습니다.");

	}

	public void practice6() {

		Scanner sc = new Scanner(System.in);
		System.out.print("권한을 확인하고자 하는 회원 등급 : ");
		String input = sc.nextLine();

		String str = "";
		switch (input) {
		case "관리자":
			str += "회원관리, 게시글 관리, ";
		case "회원":
			str += "게시글 작성, 댓글 작성,";
		case "비회원":
			str += "게시글 조회";
			break;
		}
		System.out.println(str);
	}

	public void practice7() {

		Scanner sc = new Scanner(System.in);
		System.out.print("키(m)을 입력해주세요 : ");
		double mm = sc.nextDouble();
		System.out.print("몸무게(kg)을 입력해주세요 : ");
		double kg = sc.nextDouble();
		double bm = kg / (mm * mm);
		String re = "";

		if (18.5 > bm) {
			re = "저체중";
		} else if (23 > bm) {
			re = "정상체중";
		} else if (25 > bm) {
			re = "과체중";
		} else if (30 > bm) {
			re = "비만";
		} else
			re = "고도 비만";
		System.out.println("BMI지수 : " + bm);
		System.out.println(re);
	}

	public void practice8() {
		Scanner sc = new Scanner(System.in);
		System.out.print("피연산자1 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("피연산자2 입력 : ");
		int num2 = sc.nextInt();
		System.out.print("연산자를 입력(+,-,*,/,%) : ");
		char pp = sc.next().charAt(0);
		double result = 0.0;

		if (num1 > 0 && num2 > 0) {
			switch (pp) {
			case '+':
				result = num1 + num2;
				break;
			case '-':
				result = num1 - num2;
				break;
			case '*':
				result = num1 * num2;
				break;
			case '/':
				result = (double) num1 / (double) num2;
				System.out.printf("%d %c %d = %.6f\n", num1, pp, num2, result);
				return;
			case '%':
				result = num1 % num2;
				break;
			default:
				System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
				return;
			}
		} else {
			System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
			return;
		}
		System.out.printf("%d %c %d = %d\n", num1, pp, num2, (int)result);
	}

	public void practice9() {
		Scanner sc = new Scanner(System.in);
		System.out.print("중간고사 점수 : ");
		double num1 = sc.nextDouble();
		num1 *= 0.2;

		System.out.print("기말고사 점수 : ");
		double num2 = sc.nextDouble();
		num2 *= 0.3;

		System.out.print("과제 점수 : ");
		double num3 = sc.nextDouble();
		num3 *= 0.3;
		System.out.print("출석 횟수 : ");
		double num4 = sc.nextDouble();
		num4 = num4 * 5 * 0.2;
		double sum = num1 + num2 + num3 + num4;
		System.out.println("=============결과==============");
		if (100 - (num4 * 5) >= 30) {
			System.out.printf("[출석 횟수 부족](%.0f/20)\n", num4);
		} else {
			System.out.println("중간고사 점수(20) : " + num1);
			System.out.println("기말고사 점수(30) : " + num2);
			System.out.println("과제 점수(30) : " + num3);
			System.out.println("출석 횟수(20) : " + (int) num4);
			System.out.println("총점 : " + sum);
			if (sum > 70) {
				System.out.println("Pass");
			} else {
				System.out.println("Fail");
			}
		}
	}

	public void practice10() {

		Scanner sc = new Scanner(System.in);

		System.out.printf(
				"실행할 기능을 선택하세요.\n1.메뉴 출력\n2. 짝수/홀수\n3.합격/불합격 \n4. 계절 \n5. 로그인 \n6. 권한 확인\n7. BMI\n8. 계산기\n9. P/F\n선택 : ");
		int num = sc.nextInt();
		switch (num) {
		case 1:
			practice1();
			break;
		case 2:
			practice2();
			break;
		case 3:
			practice3();
			break;
		case 4:
			practice4();
			break;
		case 5:
			practice5();
			break;
		case 6:
			practice6();
			break;
		case 7:
			practice7();
			break;
		case 8:
			practice8();
			break;
		case 9:
			practice9();
			break;
		default:
			System.out.println("잘못 입력하셨습니다.");
			practice10();
			return;
		}
	}

	public void practice11() {

		Scanner sc = new Scanner(System.in);
		System.out.print("비밀번호 입력(1000~9999) : ");
		int pw = sc.nextInt();
		String pws = pw + "";

		if (999 < pw && pw < 9999) {
			char pw0 = pws.charAt(0);// int first = pwd % 10; (일의 자리수 구하기) int형이니까 소수점으로 안가고 나머지 없어지기 때문에
			char pw1 = pws.charAt(1);// int second= (pwd/10) % 10; (십의 자리수 구하기)
			char pw2 = pws.charAt(2);// int third = (pwd /100) % 10;(백의자리수 구하기)
			char pw3 = pws.charAt(3);// int forth = (pwd / 1000) %10;(천의 자리수 구하기)
			
			if ((pw0 == pw1) || (pw1 == pw2) || (pw2 == pw3) || (pw0 == pw2) || (pw1 == pw3) || (pw0 == pw3)) {
				System.out.println("중복 값 있음");
			} else
				System.out.println("성공");
		} else
			System.out.println("자릿수 안맞음");

	}
}
