package com.example.designpattern.factory.simplefactory;

/**
 * 简单工厂模式
 * @author sin_hongjianxia
 *
 */
public class Factory {
	public static Chart getChart(String type) {
		if ("line".equalsIgnoreCase(type))
			return new LineChart();
		if ("bar".equalsIgnoreCase(type))
			return new BarChart();
		throw new IllegalArgumentException("No such type of chart.");
	}
}
