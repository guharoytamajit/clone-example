package com.shallow;

public class Address {
	int number;
	String street;
	String pin;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	public Address(int number, String street, String pin) {
		super();
		this.number = number;
		this.street = street;
		this.pin = pin;
	}

}
