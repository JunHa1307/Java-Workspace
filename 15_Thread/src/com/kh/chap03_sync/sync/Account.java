package com.kh.chap03_sync.sync;

// 한 개의 계좌
// 두 개의 ATM

public class Account {

	private int balance = 1200;
	
	public int getBalance() {
		return balance;
	}
	
	// 출금 메서드
	public void withdraw(int money) {
		synchronized(this) {
			String thName = Thread.currentThread().getName();
			System.out.println("현재 잔액은 ? "+ balance);
			if(money <= balance) {// 1200에서 100원만 출금하려고 할 때
				balance -= money;
				System.out.printf("[%s] %d원만 출금 >>> 잔액 : %d원 남았습니다.\n",thName,money,balance);
			}else {
				System.out.printf("[%s] %d 출금시도 >>> 잔액이 부족합니다. \n ", thName, money);
			}
		}
	}
}
