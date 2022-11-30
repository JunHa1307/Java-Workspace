package com.kh.practice.numRange.controller;

import com.kh.practice.numRange.exception.NumRangeException;

public class NumberController {
	
	public NumberController() {
		
	}
	
	public boolean checkDouble(int num1, int num2) throws NumRangeException {
		try {
			if(num1 % num2 == 0) {
				return true;
			}
		}catch(ArithmeticException e) {
			throw new NumRangeException();
		}
		return false;
	}
}
