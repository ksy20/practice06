package com.javaex.ex02;

public class Triangle extends Shape{
	
	private int width;
	private int height;
	
	public Triangle() {
		System.out.println("생성자 Triangle(0) 실행");
	}

	public Triangle(int width, int height) {
		this.width = width;
		this.height = height;
		System.out.println("생성자 Triangle(2) 실행");
	}
	
	public Triangle(String linecolor,String fillcolor, int width, int height) {
		super(linecolor, fillcolor);
		this.width = width;
		this.height = height;
		System.out.println("생성자 Triangle(4) 실행");
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	
	
	
}


