package com.example.designpattern.factory.abstractfactory;

public class SpringTextField implements TextField {

	@Override
	public void display() {
		System.out.println("Spring text field");
	}

}
