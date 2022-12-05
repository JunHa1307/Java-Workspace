package com.kh.practice.score.view;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import com.kh.practice.score.controller.ScoreController;

public class ScoreMenu {

	private Scanner sc = new Scanner(System.in);
	private ScoreController scr = new ScoreController();

	public void mainMenu() {
		while (true) {
			System.out.println("1. 성적 저장");// saveScore
			System.out.println("2. 성적 출력");// readScore
			System.out.println("9. 끝내기");// return
			System.out.print("메뉴 번호 : ");
			int num = Integer.parseInt(sc.nextLine());
			switch (num) {
			case 1:
				saveScore();
				break;
			case 2:
				readScore();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("잘못입력하셨습니다. 다시 입력해주세요");
				continue;
			}
		}
	}

	public void saveScore() {
		int num = 1;// 학생 숫자를 나타낼 변수
		while (true) {
			System.out.printf("%d번째 학생 정보 기록\n", num);
			System.out.print("이름 : ");
			String name = sc.nextLine();
			System.out.print("국어 점수 : ");
			int kor = Integer.parseInt(sc.nextLine());
			System.out.print("영어 점수 : ");
			int eng = Integer.parseInt(sc.nextLine());
			System.out.print("수학 점수 : ");
			int math = Integer.parseInt(sc.nextLine());

			scr.saveScore(name, kor, eng, math, kor + eng + math, ((kor + eng + math) / 3));// 학생 정보 등록
			num++;

			System.out.print("그만입력하시려면 N 또는 n 입력, 계속하시려면 아무 키나 입력하세요 : ");
			char ch = sc.nextLine().charAt(0);
			if (ch == 'N' || ch == 'n') {
				return;
			} else {
				continue;
			}
		}
	}

	public void readScore() {
		int count = 0;// 몇 명의 학생인지 학생 수
		int sumAll = 0;// 전체 합계
		double avgAll = 0.0;// 전체 평균
		System.out.println(" 이름" + "\t" + "국어" + "\t" + "영어" + "\t" + "수학" + "\t" + "총점" + "\t" + "평균");

		try (DataInputStream dis = scr.readScore()) {// return을 DataInputStream에 대입
			String value = null;
			while(true) {
				value = dis.readUTF();
				System.out.println(value);
				count++;
				sumAll += Integer.parseInt(value.split("\t")[4]);
			}

		} catch (EOFException e) {
			avgAll = ((double) sumAll / (count * 3));
			System.out.println("읽은 횟수" + "\t" + "전체 합계" + "\t" + "전체 평균");
			System.out.println(count + "\t" + sumAll + "\t" + avgAll);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
	}
}
