package com.ofss;

public class Address {
	int flatNo;
	String streetName,city;
	public Address(int flatNo, String streetName, String city) {
		super();
		this.flatNo = flatNo;
		this.streetName = streetName;
		this.city = city;
	}
	
	@Override
	public String toString() {
		String msg=this.flatNo+" "+this.streetName+" "+this.city;
		return msg;
	}

}
