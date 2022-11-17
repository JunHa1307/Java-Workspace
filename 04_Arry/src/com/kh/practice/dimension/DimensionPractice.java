package com.kh.practice.dimension;

import java.util.Scanner;

public class DimensionPractice {

	Scanner sc = new Scanner(System.in);

	public void practice1() {
		String[][] arr = new String[3][3];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.printf("(%d, %d)", i, j);
			}
			System.out.println();
		}
	}

	public void practice2() {
		int[][] arr = new int[4][4];
		int a = 1;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = a++;
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

	public void practice3() {
		int[][] arr = new int[4][4];
		int a = arr.length * arr[0].length;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = a--;
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public void practice4() {
		int[][] arr = new int[4][4]; 
		int sum1 = 0;//총 합
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				int a = (int) (Math.random() * 10 + 1);// 1부터 10까지 랜덤한 수

				if (j != arr[0].length - 1 && i != arr.length - 1) {//끝에 있지 않는 주소는 랜덤으로
					arr[i][j] = a;//랜덤 값 입력
					arr[i][arr[0].length - 1] += arr[i][j];//입력 된 값을 행 끝에 계속 더함
					arr[arr.length - 1][j] += arr[i][j];//열의 합을 구함
				} else if (j == arr[0].length - 1) {
					sum1 += arr[i][j];//총 합 구하기(가로의 합 *2)
				}
				arr[3][3] = (int) sum1;
				System.out.printf("%3d ", arr[i][j]);
			}
			System.out.println();
		}// 3 - 1 3 - 1로 반복문 돌려서 하는 방법이 잇음
		 // if 안쓰고 랜덤이 나오는대로 [3][j] [i][3] 에 값을 더하고 [3][3]에도 더한다음 *2
	}

	public void practice5() {

		System.out.print("행 크기");
		int a = sc.nextInt();
		System.out.print("열 크기");
		int b = sc.nextInt();

		if ((a < 0 && a > 10) || (b < 0 && b > 10)) {//잘못 입력시
			System.out.println("반드시 1 ~ 10 사이의 정수를 입력해야합니다.");
			practice5();
		}
		char[][] arr = new char[a][b];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = (char)(int) (Math.random() * 26 + 65);
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public void practice6() {

		String[][] strArr = new String[][] { { "이", "까", "왔", "앞", "힘" }, { "차", "지", "습", "으", "냅" },
				{ "원", "열", "니", "로", "시" }, { "배", "심", "다", "좀", "다" }, { "열", "히", "! ", "더", "!! " } };
				
		for (int i = 0; i < strArr[0].length; i++) {
			for (int j = 0; j < strArr.length; j++) {
				System.out.print(strArr[j][i] + " ");
			}
		}
	}

	public void practice7() {
		System.out.print("행의 크기 : ");
		int hang = sc.nextInt();
		char[][] arr = new char[hang][];
		int a = 97;//a 의 아스키코드

		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%d행의 열 크기 : ", i);
			arr[i] = new char[sc.nextInt()];//열 크기를 배열에 넣기
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (char) a;//a를 증가시키면서 배열에 넣기
				if(a == 'z') {
					a = 'a';
				}else {
					a++;
				}
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

	public void practice8() {
		String[] arr = { "강건강", "남나나", "도대담", "류라라", "문미미", "박보배",
				"송성실", "윤예의", "진재주", "차천축", "피풍표","홍하하" };
		String[][] arr2 = new String[3][2];
		String[][] arr3 = new String[3][2];

		int a = 0;
		System.out.println("====1분단====");
		for (int i = 0; i < arr2.length; i++) {	//2차원 배열 크기만큼 for문 돌려서
			for (int j = 0; j < arr2[0].length; j++) {
				arr2[i][j] = arr[a++];			//2차원 배열에 1차원 값 넣기
				System.out.print(arr2[i][j] + "  ");//출력
			}
			System.out.println();
		}

		System.out.println("====2분단====");//반복
		for (int i = 0; i < arr3.length; i++) {
			for (int j = 0; j < arr3[0].length; j++) {
				arr3[i][j] = arr[a++];
				System.out.print(arr3[i][j] + "  ");
			}
			System.out.println();
		}
	}

	public void practice9() {
		String[] arr = new String[] { "강건강", "남나나", "도대담", "류라라", "문미미", "박보배",
				"송성실", "윤예의", "진재주", "차천축", "피풍표","홍하하" };
		String[][] arr2 = new String[3][2];
		String[][] arr3 = new String[3][2];

		int a = 0;
		System.out.println("====1분단====");
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[0].length; j++) {
				arr2[i][j] = arr[a++];
				System.out.print(arr2[i][j] + "  ");
			}
			System.out.println();
		}

		System.out.println("====2분단====");
		for (int i = 0; i < arr3.length; i++) {
			for (int j = 0; j < arr3[0].length; j++) {
				arr3[i][j] = arr[a++];
				System.out.print(arr3[i][j] + "  ");
			}
			System.out.println();
		}
					///8번 ^^^^^^^^^^^^^^^^^
		
		System.out.println("검색할 학생 이름을 입력하세요 : ");
		String name = sc.nextLine();
		
		for (int i =0; i < arr2.length;i++) {
			for(int j = 0; j<arr2[0].length;j++) {
				if(name.equals(arr2[i][j])||(name.equals(arr3[i][j]))) {//문자열을 찾았다면 
					System.out.printf("%s학생은 %d분단",name,name.equals(arr2[i][j])?1:2);//1분단 2분단 구분
					if(i==0){ // 줄 구분 
						//char[] line  ={'첫','두','세'}; line[i] => 줄 구분 가능
						System.out.print(" 첫 번째 줄");	
					}else if(i==1) {
						System.out.print(" 두 번째 줄");	
					}else {
						System.out.print(" 세 번째 줄");	
					}
					if (j==1) {//위치 구분
						System.out.print(" 오른쪽에 있습니다.");
					}else {
						System.out.print(" 왼쪽에 있습니다.");
					}
						
				}
			}
		}
		
	}
}
