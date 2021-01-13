package com.java8.flatmap;

public class Home {
	private int homeNumber;
	private String homeName;

	public Home(int homeNumber, String homeName) {
		super();
		this.homeNumber = homeNumber;
		this.homeName = homeName;
	}

	public int getHomeNumber() {
		return homeNumber;
	}

	public void setHomeNumber(int homeNumber) {
		this.homeNumber = homeNumber;
	}

	public String getHomeName() {
		return homeName;
	}

	public void setHomeName(String homeName) {
		this.homeName = homeName;
	}

	@Override
	public String toString() {
		return "Home [homeNumber=" + homeNumber + ", homeName=" + homeName + "]";
	}

}
