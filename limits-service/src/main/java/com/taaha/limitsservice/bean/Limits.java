package com.taaha.limitsservice.bean;

public class Limits {
	private int maximum;
	private int minimum;

	protected Limits() {

	}

	public Limits(int maximum, int minimum) {
		super();
		this.maximum = maximum;
		this.minimum = minimum;
	}

	public int getMaximum() {
		return maximum;
	}

	public int getMinimum() {
		return minimum;
	}

}
