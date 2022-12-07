package com.kh.chap03_sync.sync;

//음식점
//상품이 준비되면, 생산자(Producer)가 상품을 소비 가능
public class Buffer {
	private int data;

	private boolean empty = true;// 플래그변수(객체의 상태를 저장하고 흐름을 제어하기 위한 변수)
	/*
	 * Synchronized : 격리공간으로 지정
	 * - 동기화 메소드, 동기화 블럭에 사용되는 키워드
	 * - 동기화 메소드는 메소드 선언에 synchronized키워드를 붙이고 인스턴스, 정적 메소드 어디든 사용가능
	 * - 동기화 메소드는 스레드가 메소드를 실행하면 메소드 전체에 즉시 락을 걸고 메소드가 종료되면 락이 풀린다.
	 * - 메소드 전체가 아니라 일부 내용만 락을 걸고 싶다면 동기화 블럭을 만들면 된다. (synchronized(공유객체){})
	 * 
	 */
	public synchronized void getData() {

		while (empty) {
			try {
				// 스레드를 일시정지상태로 만든다
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}

		this.empty = true;
		System.out.println("소비자가 " + this.data + "번 상품을 소비하였습니다.");
		// notify() : wait()에 의해 정지된 스레드 중 한개를 실행 대기 상태로 만드는 것
		notify();
	}

	public synchronized void setData(int data) {

		while (!empty) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		this.data = data;
		this.empty = false;
		System.out.println("생산자가 " + this.data + "번 상품을 생산하였습니다.");
		notify();
	}
}
