package com.java8.map;

public class SBTest {
	private StringBuffer name;
	private StringBuffer address;

	public SBTest(StringBuffer name, StringBuffer address) {
		super();
		this.name = name;
		this.address = address;
	}

	public StringBuffer getName() {
		return name;
	}

	public void setName(StringBuffer name) {
		this.name = name;
	}

	public StringBuffer getAddress() {
		return address;
	}

	public void setAddress(StringBuffer address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "SBTest [name=" + name + ", address=" + address + "]";
	}
}
