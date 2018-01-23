package com.example.designpattern.factory.factorymethod;

import com.example.designpattern.ConfigUtil;

/**
 * 工厂方法模式
 * 将创建具体产品类的配置分散到各个具体LoggerFactory
 * 
 * @author xiahongjian
 *
 */
public class TestLoggerFactory {
	public static void main(String[] args) {
		LoggerFactory factory = getLoggerFactory();
		Logger logger = factory.createLogger();
		logger.writeLog("hello");
	}
	
	public static LoggerFactory getLoggerFactory() {
		// 从配置文件中读取，决定返回哪个LoggerFactory的事例
		return (LoggerFactory) ConfigUtil.getBean("/logger-factory");
	}
}
