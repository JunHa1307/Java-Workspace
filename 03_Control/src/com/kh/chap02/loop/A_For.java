package com.kh.chap02.loop;

import java.util.Scanner;

public class A_For {
	/*
	 * 반복문 프로그램 흐름을 제어하는 제어문중 하나 어떤 실행코드를 반복적으로 수행시켜줌
	 * 
	 * 크게 두 종류로 나뉨(FOR문, WHILE문(DO-WHILE) (3가지)
	 * 
	 * [표현법] for(초기식;조건식;증감식){//세미콜론을 통해서 구분, 무조건 있어야됨(세미콜론) 반복적으로 실행시키고자 하는 코드; }
	 * 
	 * - 초기식 : 반복문이 시작될 때 초기에 딱 한번만 실행되는 구문 (반복문에서 사용할 변수를 선언 및 초기화 할때 사용) ex)int i
	 * = 0; - 조건식 : 반복문이 수행될 조건을 작성하는 구문 조건식의 결과가 true면 반복문 실행 조건식의 결과가 false면 반복문
	 * 멈추고 빠져나옴. (보통 초기식에 제시된 변수를 가지고 조건식을 작성) - 증감식 : 반복문을 제어하는 변수값을 증감시키는 구문 (보통
	 * 초기식에 제시된 변수를 가지고 증감식을 작성) ex)i++, i+=1
	 * 
	 * for문을 만나는 순간 초기식 -> 조건식(조건검사)-> true일경우 실행할 코드 -> 증감식 -> 조건식(조건검사)-> true일경우
	 * 실행할 코드 -> 증감식 -> 조건식(조건검사)-> ... -> 조건식의 조건검사-> false 일 경우 실행할 코드 실행 안함. 매번
	 * 조건식의 조건검사 결과값을 가지고 조건이 true일 경우만 반복해서 실행한다.
	 * 
	 * 알아둘 것: for문안에 초기식, 조건식, 증감식 각각 생략이 가능하긴함. 단, 반드시;은 작성해줘야함
	 */
	public void method1() {

		for (int i = 0; i < 5; i++) {
			System.out.println("안녕하세요.");
		}
//		for (;i<5;i++) {
//		System.out.print("야호");
//	}
//		초기식 조건식, 증감식이 없더라도 문법적 오류는 아님. 다만 무한반복으로 실행된다.

		for (int i = 0; i < 5; i++) {
			System.out.print("야호");
		}
		for (int i = 0; i < 10; i += 2) {
			System.out.println("야호");
		}
	}

	public void method2() {
		for (int i = 1; i < 6; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		for (int i = 5; i > 0; i--) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	public void method3() {
		for (int i = 1; i <= 10; i += 2) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	public void method4() {
		for (int i = 0; i <= 9; i++) {
			System.out.print(i + 1 + " ");
		}
		System.out.println();
	}

	public void method5() {
		// 1부터10까지의 합계
		// 방법1 int sum = 1+2+3+4+5+6+7+8+9+10
		// 방법2 sum = 0 선언후 sum+=1; sum +=2;...
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println("1부터 10까지의 총 합계 : " + sum);
	}

	public void method6() {
		// 1에서부터 사용자가 입력한 숫자까지 모두 더해서 출력해보기
		Scanner sc = new Scanner(System.in);
		System.out.print("양수 입력 : ");
		int num = sc.nextInt();

		if (num > 0) {
			int sum = 0;
			for (int i = 1; i <= num; i++) {
				sum += i;
			}
			System.out.println("1부터 " + num + "까지의 총 합계 : " + sum);
		} else {
			System.out.println("잘못입력하셨습니다.");
		}
	}

	public void method7() {
		// 1부터 매번 달라지는 랜덤값 (1~10사이의 랜덤한 정수)까지의 총합계

		/*
		 * java.lang.Math 클래스에 이미 정의되어있는 random()메소드를 호출하여 매번 다른 랜덤값을 얻어올 수 있음
		 * 
		 * random() : 0.0 ~ 0.999999999...사이의 랜덤값 발생 0.0<=랜덤값 <1.0
		 * 
		 */
		// int random = Math.random();
		// 우선 10을 곱해보기
		// 1을 더하기
		// 연산이 가능
		// 소수점만 버려버리면 원하는 범위의 점수 랜덤값을 가져올 수가 있음

		/*
		 * [표현법] Math.random() * 출력을 하고자 하는 갯수 + 시작하고 싶은 수 시작수 ~ (시작수 + 출력하고자 하는 갯수)
		 */

		int random = (int) (Math.random() * 1000 + 1);
		System.out.println(random);

		int sum = 0;
		for (int i = 1; i <= random; i++) {
			sum += i;

		}

		System.out.printf("1부터 %d까지의 합은 %d입니다.", random, sum);
	}

	public void method8() {
		// 반복문 + String
		String str = "Hello";

		/*
		 * h => str.charAt(0); e => str.charAt(1); l => str.charAt(2); l =>
		 * str.charAt(3); o => str.charAt(4);
		 * 
		 * 규칙을 찾기, 우선 반복적으로 str.charAt 호출함 인덱스에 해당하는 숫자만 0에서 1씩 4까지 증가함
		 */
		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
		}

	}

	public void method9() {
		/*
		 * 사용자에게 문자열을 입력받아서 각 인덱스별로 문자를 하나 뽑아서 출력 apple 길이 : 5 01234 kiwi 길이 : 4 0123
		 * 
		 * 각 문자의 마지막인덱스는 문자열의 길이 -1 추출하고자 하는 인덱스의 값의 범위는 0~ 문자열의 길이 -1까지 매번 1씩 증가
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력 : ");
		String str = sc.nextLine();

		// 문자열의 길이를 알려주는 메소드
		System.out.println("문자열의 길이 : " + str.length());

		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
		}
	}

	public void method10() {
		// 구구단 출력하기(2단)
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.printf("%d X %d = %d\n", i, j, (i * j));
			}
		}

	}

	public void method12() {
		// 사용자가 입력한 단 출력

		// 단수가 2단 9단까지의 범위가 아니라면
		// 잘못입력했습니다.(2~9사이의 정수 입력)

		// 제대로 입력했다면 해당 단수를 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("단 입력 :");
		int dan = sc.nextInt();

		if ((2 <= dan) && (dan < 10)) {
			for (int i = 1; i < 10; i++) {
				System.out.printf("%d X %d = %d\n", dan, i, (i * dan));
			}
		} else {
			System.out.println("잘못 입력했습니다.(2~9사이의 정수 입력)");
		}
	}

	public void method13() {
		// 1~5까지 연이어 출력
		// 1 2 3 4 5가 출력되도록 반복문 사용
		for (int i = 0; i < 3; i++) {
			for (int j = 1; j <= 5; j++) {// i j k <- 3중첩까진 안가니까 k는 잘 안쓸듯
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	public void method14() {
		// ****
		// ****
		// ****
		// ****
		// 중첩반복문으로 출력해보기
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void method15() {
		// 1***
		// *2**
		// **3*
		// ***4
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (i == j) {
					System.out.print(i+1);
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
	
	public void method16() {
		//구구단 2단 부터 9단까지 모두 출력하는 중첩 반복문 
		
		int dan = 2;
		
//		System.out.printf("--- %d단 ---\n", dan);
//		
//			for (int i = 1; i < 10; i++) {
//				System.out.printf("%d X %d = %d\n", dan, i, dan * i);
//			}
			for(;dan<10;dan++) {
				for (int i = 1; i < 10; i++) {
					System.out.printf("%d X %d = %d\n", dan, i, dan * i);
				}
				System.out.println();
			}

	}
}