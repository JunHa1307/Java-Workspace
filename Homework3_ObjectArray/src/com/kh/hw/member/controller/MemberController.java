package com.kh.hw.member.controller;

import com.kh.hw.member.model.vo.Member;

public class MemberController {
	
	public static final int SIZE = 10;
	private Member[] m = new Member[SIZE];
	
	public int existMemberNum() {
		int count = 0;
		for(int i = 0; i <m.length;i++) {
			if(m[i] != null) {
				if(m[i].getId() != null) {	
					count++;
				}
			}
		}
		return count;
	}
	
	public boolean checkId(String input) {
		boolean judge = true;
		if(existMemberNum() > 0 ) {
			judge = false;
		}
		for(int i = 0; i < m.length; i++) {
				if (m[i] == null){
					judge = false;
				}else if(m[i].getId().equals(input)) {
					judge = true;
				}else {
					judge = false;
				}
		}
		return judge;
	}
	int i = 0;
	public void insertMember(String id, String name, String password, String email, char gender, int age) {
		m[i] = new Member(id,name,password,email,gender,age);
		i++;
	}
	
	public String searchId(String id) {
		String result = "결과가 없습니다.";
		for(int i = 0; i < m.length; i++) {
			if(m[i] != null) {
				if(m[i].getId().equals(id)){
					result =  m[i].inform();
				}
			}	
		}
		return result;
	}
	
	public Member[] searchName(String name) {
		int index = 0;
		Member[] arr = new Member[SIZE]; 
		for(Member man : m) {
			if(man != null) {
				if(man.getName().equals(name)){
					arr[index] = m[index];
				}
			}	index ++;
		}
		return arr;
	}
	
	public Member[] searchEmail(String email) {
		int index = 0;
		Member[] arr = new Member[SIZE]; 
		for(Member man : m) {
			if(man != null) {
				if(man.getEmail().equals(email)){
					arr[index] = m[index];
				}
			}	index ++;
		}
		return arr;
	}
	
	public boolean updatePassword(String id, String password) {
		int index = 0;
		for(Member man : m) {
			if(man != null) {
				if(man.getId().equals(id)){
					m[index].setPassword(password);
					return true;
				}
			}index ++;
		}
		return false;
	}
	
	public boolean updateName(String id, String name) {
		int index = 0;
		for(Member man : m) {
			if(man != null) {
				if(man.getId().equals(id)){
					m[index].setName(name);
					return true;
				}
			}index ++;
		}
		return false;
	}
	
	public boolean updateEmail(String id, String email) {
		int index = 0;
		for(Member man : m) {
			if(man != null) {
				if(man.getId().equals(id)){
					m[index].setEmail(email);
					return true;
				}
			}index ++;
		}
		return false;
	}
	
	public boolean delete(String id) {
		for(int i =0; i <SIZE;i++) {
			if(m[i] != null) {
				if(m[i].getId().equals(id)){
					m[i] = null;
					return true;
				}
			}
		}
		return false;
	}
	
	public void delete() {
		m = new Member[SIZE];
		System.out.println("성공적으로 삭제하였습니다.");
	}
	
	public Member[] printAll() {
		return m;
	}
}
