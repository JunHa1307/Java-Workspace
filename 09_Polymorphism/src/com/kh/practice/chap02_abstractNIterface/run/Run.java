package com.kh.practice.chap02_abstractNIterface.run;

import com.kh.practice.chap02_abstractNIterface.controller.PhoneController;

public class Run {

	public static void main(String[] args) {

		String[] phoneInfo = new PhoneController().method();

		for (String s : phoneInfo) {
			System.out.println(s);
			System.out.println();
		}
	}

}
