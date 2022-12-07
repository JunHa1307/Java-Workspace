package com.kh.practice.map.controller;

import java.util.HashMap;

import com.kh.practice.map.model.vo.Member;

public class MemberController {

	private HashMap map = new HashMap();
	
	public boolean joinMembership(String id, Member m) {
		return true;
	}
	
	public String login(String id, String password) {
		return "";
	}
	
	public boolean changePassword(String id, String oldPw, String newPw) {
		return true;
	}
	
	public void changName(String id, String newName) {
		
	}
	
	public TreeMap snaeName(String name) {
		return;
	}
}
