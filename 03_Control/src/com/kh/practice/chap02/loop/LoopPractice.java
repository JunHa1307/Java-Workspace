package com.kh.practice.chap02.loop;

import java.util.Scanner;

public class LoopPractice {
	public void practice1() {

		Scanner sc = new Scanner(System.in);
		System.out.print("1 이상의 숫자를 입력해주세요 : ");
		int num = sc.nextInt();

		if (0 < num) {
			for (int i = 1; i <= num; i++) {
				System.out.printf("%d ", i);
			}
		} else {
			System.out.println("1 이상의 숫자를 입력해주세요");
			practice1();
			return;
		}
		System.out.println();
	}
	public void practice2() {

		Scanner sc = new Scanner(System.in);
		System.out.print("1 이상의 숫자를 입력해주세요 : ");
		int num = sc.nextInt();

		if (0 < num) {
			for (int i = num; 0 < i; i--) {
				System.out.print(i + " ");
			}
		} else {
			System.out.println("1 이상의 숫자를 입력해주세요");
			practice2();
			return;
		}
		System.out.println();
	}

	public void practice3() {

		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 하나 입력하세요 : ");
		int num = sc.nextInt();
		int sum = 0;
		int i = 1;
		
		for (i = 1; i <= num; i++) {
			System.out.printf("%d", i);
			sum += i;
			if (i != num) {
				System.out.print(" + ");
			}
		}
		System.out.printf(" = %d\n", sum);
	}

	public void practice4() {

		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();

		if (0 < num1 && 0 < num2) {
			if (num1 < num2) {
				for (int i = num1; i <= num2; i++) {
					System.out.print(i + " ");
				}
			} else if (num1 > num2) {
				for (int i = num2; i <= num1; i++) {
					System.out.print(i + " ");
				}
			}
		} else {
			System.out.println("1 이상의 숫자를 입력해주세요");
			practice4();
			return;
		}
		System.out.println();
	}

	public void practice5() {

		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
		int num1 = sc.nextInt();

		if (num1 < 10) {
			for (int dan = num1; dan < 10; dan++) {
				System.out.printf("=====%d단======\n", dan);
				for (int i = 1; i < 10; i++) {
					System.out.printf("%d X %d = %d\n", dan, i, i * dan);
				}
			}
		} else {
			System.out.println("9 이하의 숫자만 입력해주세요");
			practice5();
			return;
		}
	}

	public void practice6() {

		Scanner sc = new Scanner(System.in);
		System.out.print("시작 숫자 : ");
		int num1 = sc.nextInt();
		System.out.print("공차 : ");
		int bubbletea = sc.nextInt();

		for (int i = 0; i < 10; i++) {
			System.out.print(num1 + " ");
			num1 += bubbletea;
		}
		System.out.println();
	}

	public void practice8() {

		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num1 = sc.nextInt();

		for (int i = 1; i <= num1; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void practice9() {

		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num1 = sc.nextInt();

		for (int i = 1; i <= num1; i++) {
			for (int j = 0; j <= num1 - i; j++) {
				System.out.print("*");

			}
			System.out.println();
		}
	}

	public void practice10() {

		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num1 = sc.nextInt();

		for (int i = 1; i <= num1; i++) {
			for (int j = 1; j <= num1 - i; j++) {
				System.out.print(" ");
			}
			for (int k = num1 - i; k < num1; k++) {
				System.out.print("*");
			}

			System.out.println();
		}
	}

	public void practice11() {

		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num1 = sc.nextInt();

		for (int i = 1; i <= num1; i++) {
			for (int j = num1 - i; j < num1 - 1; j++) {
				System.out.print(" ");
			}
			for (int k = i; k <= num1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void practice12() {

		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num1 = sc.nextInt();
		int num2 = 0;
		for (int i = 0; i < num1; i++) {
			for (int k = 0; k < num1 - i; k++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= num2; j++) {
				System.out.print("*");
			}
			num2 += 2;
			System.out.println();
		}
	}

	public void practice13() {

		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
		int num1 = sc.nextInt();
		String str = "";

		if (num1 > 1) {
			if (((num1) % 2) == 0 && num1 != 2) {
				System.out.println("소수가 아닙니다.");
				return;
			} else if (((num1) % 2) != 0) {
				for (int i = 3; i < 7; i += 2) {
					if ((num1 % i) == 1) {
						str = "소수 입니다.";
						break;
					} else if (num1 == i) {
						str = "소수입니다.";
					} else {
						str = "소수가 아닙니다.";
					}
				}
			} else {
				str = "소수입니다.";
			}
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
		System.out.println(str);
	}

	public void practice13_2() {

		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
		int num1 = sc.nextInt();
		boolean isPrime = true;

		if (num1 > 1) {
			for (int i = 2; i <= num1; i++) {
				isPrime = true;
				for (int j = 2; j <= i / 2; j++) {
					if (i % j == 0) {
						isPrime = false;
						break;
					}
				}
			}
			if (isPrime == true) {
				System.out.println("소수입니다.");
			} else {
				System.out.println("소수가 아닙니다.");
			}
		} else {
			System.out.println("잘못 입력하셨습니다");
		}
	}

	public void practice14() {

		Scanner sc = new Scanner(System.in);
		System.out.print("자연수 하나를 입력하세요 : ");
		int num1 = sc.nextInt();
		int result = 0;

		if (num1 > 1) {
			for (int i = 2; i <= num1; i++) {
				boolean isPrime = true;
				for (int j = 2; j <= i / 2; j++) {
					if (i % j == 0) {
						isPrime = false;
						break;
					}
				}
				if (isPrime) {
					System.out.print(i + " ");
					result++;
				}
			}
			System.out.printf("\n2부터 %d까지의 소수의 개수는 %d개 입니다.\n", num1, result);
		} else {
			System.out.println("잘못 입력하셨습니다");
		}

	}

	public void practice15() {

		Scanner sc = new Scanner(System.in);
		System.out.print("자연수 하나를 입력하세요 : ");
		int num1 = sc.nextInt();
		int count = 0;

		for (int i = 2; i <= num1; i++) {
			for (int j = 2; j < num1; j++) {
				if (i % 2 == 0 || i % 3 == 0) {
					System.out.print(i + " ");
					break;
				}
			}
			if (i % 2 == 0 && i % 3 == 0) {
				count++;
			}
		}
		System.out.println("\ncount : " + count);
	}

	public void practice16() {

		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num1 = sc.nextInt();

		for (int i = 1; i <= (num1 * 2 - 1); i++) {
			int j = 1;
			if (i > num1) {
				j += i - num1;
			} else if (i < num1) {
				j += num1 - i;
			}
			for (; j <= num1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void practice17() {

		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num1 = sc.nextInt();

		for (int i = 1; i <= num1; i++) {
			for (int j = 1; j <= num1; j++) {
				if (j != 1 && j != num1) {
					if (i != num1 && i > 1) {
						System.out.print(" ");
					} else {
						System.out.print("*");
					}
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

	public void practice18() {

		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num1 = sc.nextInt();

		for (int i = 1; i <= (num1 * 2 - 1); i++) {
			int j = 1;
			int k = 0;
			if (i > num1) {
				j += (i - (num1 - (num1 - 3))) * 2 - ((num1 - 3) * 2);
				k -= i - num1;
				k += num1;
			} else if (i < num1) {
				j -= (i - (num1 - (num1 - 3))) * 2 - ((num1 - 3) * 2);
				k += i;
			}
			for (; j <= (num1 * 2 - 1); j++) {
				for (; k < num1; k++) {
					if (i == num1) {
						break;
					}
					System.out.print(" ");
				}
				System.out.print("*");
			}
			System.out.println();
		}

	}

	public void practice19() {

		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num1 = sc.nextInt();

		for (int i = 1; i <= (num1 * 2 - 1); i++) {
			int j = 1;
			int k = 0;
			int l = 0;

			if (i > num1) {
				j += (i - (num1 - (num1 - 3))) * 2 - ((num1 - 3) * 2);
				k -= i - (num1 * 2);
			} else if (i < num1) {
				j -= (i - (num1 - (num1 - 3))) * 2 - ((num1 - 3) * 2);
				k += i;
			}
			l += j;
			for (; j <= (num1 * 2 - 1); j++) {
				for (; k < num1; k++) {
					if (i == num1) {
						break;
					}
					System.out.print(" ");
				}
				if (l == j) {
					System.out.print("*");
				} else if (j != num1 * 2 - 1) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}
