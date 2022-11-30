package com.kh.practice.token.controller;

import java.util.StringTokenizer;

public class TokenController {

	public TokenController() {
		super();
	}

	public String afterToken(String str) {
		StringTokenizer st = new StringTokenizer(str," ");
		StringBuilder str1 = new StringBuilder();
		while(st.hasMoreTokens()) {
			str1.append(st.nextToken());
		}
		return str1.toString();
	}
	
	public String firstCap(String input) {
		char[] arr = input.toCharArray();
		arr[0] = input.toUpperCase().charAt(0);
		return String.valueOf(arr);
	}
	
	public int findChar(String input, char one) {
		int count = 0;
		for(char arr : input.toCharArray()) {
			if(arr == one) {
			count++;	
			}
		}
		return count;
	}
}
