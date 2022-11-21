package com.kh.example.practice5.model.vo;

public class Lotto {
	//필드부
	private int[] lotto;

	{//초기화 블록
		lotto = new int[6];
		
		
		for (int i = 0; i < lotto.length; i++) {//생성
			int random = (int) (Math.random() * 45 + 1);
			lotto[i] = random;
			for (int j = 0; j < i; j++) {
				if(lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}
	}
	
	//선언부
	public Lotto() {}
	
	//메소드부
	public void setLotto(int[] lotto) {
		this.lotto = lotto;
	}

	public int[] getLotto() {
		return lotto;
	}

	public void infomation() {
		for (int i = 0; i < lotto.length; i++) {//배열 차례대로 출력
			System.out.print(lotto[i] + " ");
		}
	}
}
