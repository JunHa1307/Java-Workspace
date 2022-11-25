package com.kh.chap01_poly.part02_electronic.controller;

import com.kh.chap01_poly.part02_electronic.model.vo.*;
// 다형성 적용 전 클래스
public class ElectronicController1 {
	
	// 용산 전자상가 새로 차린 가게
	private Desktop desk;
	private NoteBook note;
	private Tablet tab;
	
	//현재 용산 전자상가에 데스크탑을 납품하는 메서드
	public void insert(Desktop d) {
		//desk= new Desktop("삼성","데탑",900000,"Geforce1070");
		desk = d;
	}
	
	//노트북을 납품하는 메서드
	public void insert(NoteBook n) {
		note = n;
	}
	
	//태블릿을 납품하는 메서드
	public void insert(Tablet t) {
		tab = t;
	}
	
	public Desktop selectDesktop() {
		return desk;
	}
	
	public NoteBook selectNoteBook() {
		return note;
	}
	
	public Tablet selectTablet() {
		return tab;
	}
}
