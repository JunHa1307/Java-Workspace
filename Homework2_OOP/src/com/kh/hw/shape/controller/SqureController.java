package com.kh.hw.shape.controller;

import com.kh.hw.shape.model.vo.Shape;

public class SqureController {
	
	private Shape s = new Shape();
	
	public double calPerimeter(double height, double width) {
		s.setHeight(height);
		s.setWidth(width);
		
		return height*2 + width * 2;
	}
	
	public double calArea(double height, double width) {
		s.setHeight(height);
		s.setWidth(width);
		
		return height * width;
	}
	
	public void paintColor(String color) {
		s.setColor(color);
	}
	
	public String print() {
		return "사각형 " + s.infomation();
	}
}
