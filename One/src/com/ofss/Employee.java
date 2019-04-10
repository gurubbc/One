package com.ofss;

public class Employee {
	String employeeName;
	Address add;
	public Employee(String employeeName, Address add) {
		super();
		this.employeeName = employeeName;
		this.add = add;
	}
	
	@Override
	public String toString() {
		String msg=this.employeeName+" "+add;
		return msg;
	}
}
