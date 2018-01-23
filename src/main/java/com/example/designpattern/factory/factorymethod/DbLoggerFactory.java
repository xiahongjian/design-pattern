package com.example.designpattern.factory.factorymethod;

public class DbLoggerFactory implements LoggerFactory {

	public Logger createLogger() {
		DbLogger logger = new DbLogger();
		// do other config
		return logger;
	}

}
