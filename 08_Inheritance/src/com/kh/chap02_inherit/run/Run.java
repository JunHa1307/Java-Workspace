package com.kh.chap02_inherit.run;

import com.kh.chap02_inherit.model.vo.*;

public class Run {

	public static void main(String[] args) {
		
		Airplane a1 = new Airplane("콜럼비아호", 0.02, "여객기", 16, 5);
		Car c1 = new Car("테슬라", 12.5, "전기차", 4);
		Ship s1 = new Ship("낚시배", 3, "원양어선", 2);
		
		System.out.println(a1.information());
		System.out.println(c1.information());
		System.out.println(s1.information());
		
		a1.howToMove();
		c1.howToMove();
		s1.howToMove();
	}

}
