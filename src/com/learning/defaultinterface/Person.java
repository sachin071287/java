package com.learning.defaultinterface;

public class Person {

	private int i;

	public Person(int i) {
		this.i = i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public int getI() {
		return i;
	}

	@Override
	public boolean equals(Object obj) {
		return true;
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

}
