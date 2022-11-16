package com.kh.practice.array;

import java.util.Scanner;

public class ArrayPractice {
	Scanner sc = new Scanner(System.in);

	public void practice1() {
		int[] arr = new int[10];// 배열 생성

		for (int i = 0; i < 10; i++) {
			arr[i] = i + 1;// 배열에 1부터 넣기
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public void practice2() {
		int[] arr = new int[10];
		for (int i = 0; i < 10; i++) {
			arr[i] = 10 - i;// 배열에 10부터 빼가면서 넣기
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public void practice3() {
		System.out.print("양의 정수 : ");
		int input = sc.nextInt();
		int[] arr = new int[input];// 배열 크기 할당
		for (int i = 0; i < input; i++) {
			arr[i] = i + 1;// 1부터 받은 값까지 배열에 넣기
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public void practice4() {
		String[] arr = { "사과", "귤", "포도", "복숭아", "참외" };

		System.out.println(arr[1]);
	}

	public void practice5() {
		System.out.print("문자열 : ");
		String str = sc.nextLine();

		System.out.print("문자 : ");
		char ch = sc.nextLine().charAt(0);
		int a = 0;
		char[] chArr = new char[str.length()];
		// String index = "";
		System.out.printf("%s에 %c가 존재하는 위치(인덱스) : ", str, ch);

		for (int i = 0; i < chArr.length; i++) {// 문자 한글자씩 넣기
			chArr[i] = str.charAt(i);
			if (ch == chArr[i]) {// 찾으면 위치 출력
				System.out.print(i + " ");
				a++;// 찾은 개수 더하기
				// index += i + " " 로 위치를 넣는것도 있음
			}
		}
		System.out.printf("\n%c 개수 : %d\n", ch, a);
	}

	public void practice6() {
		String[] str = { "월", "화", "수", "목", "금", "토", "일" };
		System.out.print("0 ~ 6 사이 숫자 입력 : ");
		int num = sc.nextInt();

		if (num > 0 && num < 7) {// 요일검사
			System.out.println(str[num] + "요일");
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
	}

	public void practice7() {
		System.out.print("정수 : ");
		int num = sc.nextInt();
		int[] arr = new int[num];
		int sum = 0;
		for (int i = 0; i < num; i++) {// 값 넣기
			System.out.printf("배열 %d번째 인덱스에 넣을 값 : ", i);
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < num; i++) {// 값 출력과 합계 연산
			System.out.print(arr[i] + " ");
			sum += arr[i];
		}
		System.out.println("\n총합 : " + sum);
	}

	public void practice8() {
		System.out.print("정수 : ");
		int num = sc.nextInt();
		int[] arr = new int[num];
		int j = 1;

		if (num < 3 || num % 2 == 0) {// 잘못 입력시
			System.out.println("다시 입력하세요");
			practice8();
		} else {
			for (int i = 0; i < num; i++) {// 배열에 값 넣기
				arr[i] = j;
				if (i * 2 < num - 1) {// 배열 중간까지
					j++;
				} else {// 배열 나머지
					j--;
				}
			}

			for (int i = 0; i < num; i++) {// 출력
				if (i == num - 1) {// 출력 마지막
					System.out.print(arr[i]);
				} else {
					System.out.print(arr[i] + ", ");
				}

			}
		}
	}

	public void practice9() {

		String[] arr = { "뿌링클", "양념", "후라이드", "갈비천왕", "맵다닭" };
		System.out.print("치킨 이름을 입력하세요 : ");
		String str = sc.nextLine();

		for (int i = 0; i < 5; i++) {// 치킨 검사
			if (str.equals(arr[i])) {// 치킨 있다면
				System.out.printf("%s치킨 배달가능", str);
				return;// 있다면 밑의 수식은 발동하지 않음
			}
		}
		System.out.printf("%s치킨은 없는 메뉴입니다.", str);// 없다면 출력
	}
}
