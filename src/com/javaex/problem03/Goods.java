package com.javaex.problem03;

public class Goods {

    private String name;
    private int price;
    private int count;
	
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
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
    
	public void gInfo() {
		System.out.println(getName() + "(가격 :" + getPrice() + "원)이" + getCount() + "개 입고 되었습니다.");
	}
    
    
}