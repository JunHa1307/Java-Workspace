package com.kh.example.practice6.run;

import com.kh.example.practice6.model.vo.Book;

public class Run {

	public static void main(String[] args) {
		
		Book bk = new Book();
		bk.inform();
		Book reader = new Book("전독시","네이버","싱숑");
		reader.inform();
		Book coding = new Book("유지보수하기 어렵게 코딩하는법","한빛미디어","로에디 그린",19000,100);
		coding.inform();
	}

}
