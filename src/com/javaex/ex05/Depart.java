package com.javaex.ex05;

public class Depart extends Employee {

	 //코드작성
	private String depart;

	public Depart() {
	}

	public Depart(String setName, int setSalary, String depart) {
		super(setName, setSalary);
		this.depart = depart;
	}

	public String getDepart() {
		return depart;
	}

	public void setDepart(String depart) {
		this.depart = depart;
	}
	
	public void showInformation() {
		System.out.println("이름: "+getName()+" 연봉: "+getSalary()+" 부서: "+depart);
	}

}
