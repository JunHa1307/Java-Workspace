package com.kh.example.practice5.model.vo;

public class Lotto {
	
	private int[] lotto;
	
	
	{
		lotto = new int[6];
		for(int i = 0; i< 6; i++) {
			lotto[i] = (int)(Math.random()*44+1);
			if(lotto[i] == lotto[i-1]) {
				while(true) {
					lotto[i]=(int)(Math.random()*44+1);
					if(lotto[i] != lotto[i-1]) {
						break;
					}
				}
			}
		}
	}
	
	
	
}
