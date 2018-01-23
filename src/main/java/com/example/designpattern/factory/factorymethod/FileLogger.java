package com.example.designpattern.factory.factorymethod;

public class FileLogger implements Logger {

	public void writeLog(String log) {
		System.out.println("Write to file");
	}

}
