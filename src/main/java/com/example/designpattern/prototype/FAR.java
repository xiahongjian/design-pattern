package com.example.designpattern.prototype;

public class FAR implements OfficialDocument {

	@Override
	public void display() {
		System.out.println("Feasibility Analysis Report");
	}

	@Override
	public OfficialDocument clone() {
		try {
			return (OfficialDocument)super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}

}
