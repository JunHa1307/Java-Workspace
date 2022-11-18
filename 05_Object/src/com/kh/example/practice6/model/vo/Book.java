package com.kh.example.practice6.model.vo;

public class Book {
	// 필드부
	private String title;
	private String publisher;
	private String author;
	private int price;
	private double discountRate;

	// 선언부
	public Book() {
	}

	public Book(String title, String publisher, String author) {
		this.title = title;
		this.publisher = publisher;
		this.author = author;
	}

	public Book(String title, String publisher, String author, int price, double discountRate) {
		this(title, publisher, author);
		this.price = price;
		this.discountRate = discountRate;
	}

	// 메소드부
	public void inform() {
		System.out.println("제목 : " + title + ", 퍼블리셔 : " + publisher + ", 저자 : " 
	+ author + ", 가격 : " + price + ", 할인율 : " + discountRate);
	}
}
