package com.kh.example.practice4.model.vo;

public class Student {
	//필드부 
	private int grade;
	private int classroom;
	private String name;
	private double height;
	private char gender;
	{//초기화
		grade = 1;
		classroom = 3;
		name = "류준하";
		height = 178.5;
		gender = '남';
	}
	//선언부
	public Student() {}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getClassroom() {
		return classroom;
	}
	public void setClassroom(int classroom) {
		this.classroom = classroom;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public void infomation() {
		System.out.println(grade + "학년 " + classroom + "반 " + name + "학생은 "+ height + "cm "+ gender + "학생 입니다.");
	}
	
}
