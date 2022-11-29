package com.kh.practice.token.controller;

import java.util.StringTokenizer;

public class TokenController {

	public TokenController() {
		super();
	}

	public String afterToken(String str) {
		StringTokenizer st = new StringTokenizer(str," ");
		while(st.hasMoreTokens()) {
			str.concat(st.nextToken());
		}
		return str;
	}
	
	public String firstCap(String input) {
		input.toUpperCase().charAt(0);
		return input;
	}
	
	public void findChar(String input, char one) {
		int count = 0;
		for(char arr : input.toCharArray()) {
			if(arr == one) {
			count++;	
			}
		}
		System.out.printf("%c 문자가 들어간 개수 : %d\n", one, count);
	}
}
