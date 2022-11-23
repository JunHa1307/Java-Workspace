package com.kh.practice.student.view;

import com.kh.practice.student.controller.StudentController;

public class StudentMenu {
	
	private StudentController ssm = new StudentController();
	
	public StudentMenu() {
		//Student[] sArr = ssm.printStudent; 로 해도됨
		System.out.println("==========학생 정보 출력==========");
		//for(Student std : sArr) {
		for(int i = 0; i < ssm.printStudent().length; i++) {
			System.out.println(ssm.printStudent()[i].inform());
		}	
		
		System.out.println();
		System.out.println("==========학생 성적 출력==========");
		
		System.out.printf("학생 성적 합계 : %d\n", (int)ssm.avgScore()[0]);
		System.out.printf("학생 점수 평균 : %.1f\n", ssm.avgScore()[1]);
		
		System.out.println();
		System.out.println("==========성적 결과 출력==========");
		//for(Student std : sArr) {
		for(int i = 0; i < ssm.printStudent().length; i++) {
			String str = "통과입니다.";
			if(ssm.printStudent()[i].getScore() < ssm.CUT_LINE) {
				str = "재시험 대상입니다.";
			}
			System.out.printf("%s 학생은 %s\n", ssm.printStudent()[i].getName() ,str);
		}
		
		
	}
}
