package com.javaex.ex02;

public class Shape {
	
	protected String linecolor;
	protected String fillcolor;
	
	public Shape() {
		System.out.println("생성자 Shape(0) 실행");
	}

	public Shape(String linecolor, String fillcolor) {
		this.linecolor = linecolor;
		this.fillcolor = fillcolor;
		System.out.println("생성자 Shape(1) 실행");
	}

	public String getLinecolor() {
		return linecolor;
	}

	public void setLinecolor(String linecolor) {
		this.linecolor = linecolor;
	}

	public String getFillcolor() {
		return fillcolor;
	}

	public void setFillcolor(String fillcolor) {
		this.fillcolor = fillcolor;
	}
	
	

}

