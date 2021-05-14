package com.cos.domain;


//모델링하세요 테이블이랑 동일한 클래스를 만들면됨
//빈생성자, 풀생성자, Getter, Setter

//모델링 
//VO, Value Object
public class Product {
	private int id;
	private String name;
	private int price;
	
	public Product() {}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Product(int id, String name, int price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	
}
