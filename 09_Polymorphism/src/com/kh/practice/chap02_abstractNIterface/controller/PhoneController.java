package com.kh.practice.chap02_abstractNIterface.controller;

import com.kh.practice.chap02_abstractNIterface.model.vo.*;

public class PhoneController {

	private String[] result = new String[2];

	public String[] method() {

		Phone[] arr = new Phone[2];
		arr[0] = new GalaxyNote9();
		arr[1] = new V40();

		for (Phone p : arr) {
			if (p instanceof GalaxyNote9) {
				result[0] = ((GalaxyNote9) p).printInformation();
			} else {
				result[1] = ((V40) p).printInformation();
			}
		}
		return result;
	}
}
