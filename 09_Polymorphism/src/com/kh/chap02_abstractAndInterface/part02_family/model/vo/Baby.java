package com.kh.chap02_abstractAndInterface.part02_family.model.vo;

public class Baby extends Person implements Basic{
	
	public Baby() {}

	public Baby(String name, double weight, int health) {
		super(name, weight, health);
	}
	
	@Override
	public void eat() {
		//몸무게 3 증가 
		super.setWeight(super.getWeight() + 3);//수정할 몸무게 == 기존의 몸무게 + 3
		//건강도 1 증가
		super.setHealth(super.getHealth() + 1);//수정할 건강도 == 기존의 건강도 + 1
	}
	
	@Override
	public void sleep() {
		//건강도 3 증가
		super.setHealth(super.getHealth() + 3);
		
	}
	
}
