package com.kh.chapter03_class.model.vo;

public class Member {
	private String memberId;
	private String memberPwd;
	private String memberName;
	private int age;
	private char gender;
	private String phone;
	private String email;
	
	//+ changeName(name:String):void
	public void changeName(String name) {
		this.memberName = name;
	}
	
	//+ printName():void
	public void printName() {
		System.out.println("이름은 : "+memberName);
	}
}
