package com.example.designpattern.adapter;

public class ConcreteAdaptee implements Adaptee {
	@Override
	public void specificRequest() {
		System.out.println("Specific request");
	}
}
