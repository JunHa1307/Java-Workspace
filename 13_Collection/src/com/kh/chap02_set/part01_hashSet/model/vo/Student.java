package com.kh.chap02_set.part01_hashSet.model.vo;

public class Student {
	private String name;
	private int age;
	private int score;
	
	public Student() {}

	public Student(String name, int age, int score) {
		this.name = name;
		this.age = age;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", score=" + score + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		// Student 객체.equals(비교할 Student){
		// 		this			other
		
		// this => 현재 객체
		Student other = (Student)obj;
		if(this.age == other.age && this.score == other.score && this.name.equals(other.name)) {
			
			return true;
		}else {
			
		return false;
		}
		
	}

	// hashcode 메소드 재정의 : 필드값을 가지고 해시코드를 만들어서 반환하도록 재정의
	@Override
	public int hashCode() {
		String hash = name + age + score;
		return hash.hashCode();
	}
	
	
	
	
	
}
