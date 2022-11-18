package com.kh.example.practice3.model.vo;

public class Circle {
	//필드부
	private static final double PI = 3.14;
	private int radius;
	
	{//초기화블럭
		radius = 5;
	}
	
	//생성부
	public Circle() {
		getAreaOfCircle();
		getSizeOfCirle();
	}
	
	//메서드부
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public int getRadius() {
		return radius;
	}
	public double getPI() {
		return PI;
	}
	
	public void incrementRadius() {
		radius ++;
		getAreaOfCircle();
		getSizeOfCirle();
	}
	
	public void getAreaOfCircle(){
		System.out.println(radius * PI * 2);
	}
	
	public void getSizeOfCirle() {
		System.out.println(PI * (radius * radius));
	}
}
