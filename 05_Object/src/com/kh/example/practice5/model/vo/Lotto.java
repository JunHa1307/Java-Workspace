package com.kh.example.practice5.model.vo;

public class Lotto {
	//필드부
	private int[] lotto;

	{//초기화 블록
		lotto = new int[6];
		
		lotto[0] = (int) (Math.random() * 45 + 1);
		
		for (int i = 0; i < lotto.length; i++) {//생성
			for (int j = i + 1; j < lotto.length; j++) {
				while (true) {// 랜덤값 대입
					lotto[j] = (int) (Math.random() * 45 + 1);
					if (lotto[i] != lotto[j]) {//검사 후 나가기
						break;
					}
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
