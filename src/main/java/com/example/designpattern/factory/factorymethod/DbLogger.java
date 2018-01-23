package com.example.designpattern.factory.factorymethod;

public class DbLogger implements Logger {

	public void writeLog(String log) {
		System.out.println("Write to db");
	}

}
