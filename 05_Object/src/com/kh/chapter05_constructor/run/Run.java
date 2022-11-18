package com.kh.chapter05_constructor.run;

import com.kh.chapter05_constructor.model.vo.*;

public class Run {

	public static void main(String[] args) {
		User user1 = new User();
		user1.setUserId("user01");
		user1.setUserPwd("1234");
		user1.setUserName("rudals");
		System.out.println(user1.infomation());
		
		
		User user2 = new User("user01", "pass01", "김철수");
		
		System.out.println(user2.infomation());
		
	}

}
