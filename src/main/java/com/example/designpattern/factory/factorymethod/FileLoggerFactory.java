package com.example.designpattern.factory.factorymethod;

public class FileLoggerFactory implements LoggerFactory {

	public Logger createLogger() {
		FileLogger logger = new FileLogger();
		// do other config
		return logger;
	}

}
