package com.example.designpattern.prototype;

public class SRS implements OfficialDocument {

	@Override
	public OfficialDocument clone() {
		try {
			return (OfficialDocument) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void display() {
		System.out.println("Software Requirements Specification");
	}

}
