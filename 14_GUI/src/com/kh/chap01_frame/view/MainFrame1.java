package com.kh.chap01_frame.view;

import javax.swing.JFrame;

public class MainFrame1 {
	/*
	 * 자바에서 프레임 생성하는 방법1
	 * JFrame 객체를 직접 생성한 후 그 생성된 객체를 하나의 프레임으로 두는 방법
	 * 생성된 객체를 통해서 프레임의 크기 및 위치 등 변경
	 * 
	 */
	public void showFrame() {
//		JFrame mainFrame = new JFrame();// 객체 생성
//		mainFrame.setTitle("mainFrame");// 생성된 프레임 제목 설정
		JFrame mainFrame = new JFrame("mainFrame1");
		
		// 프레임이 뜨는 위치 설정(x,y)
		mainFrame.setLocation(300, 200);
		
		// 프레임 크기 (가로,세로)
		mainFrame.setSize(800,500);
		
		// 프레임 보이게하기
		mainFrame.setVisible(true);
		// 닫기 버튼 눌렀을때 프로세스가 완전히 종료되게 하는 메소드
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}
