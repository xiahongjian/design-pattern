package com.example.designpattern.adapter;

/**
 * 适配器模式
 * 
 * 对象适配器:
 * 实现适配接口，通过调用适配者对象的方法来实现
 * 
 * 类适配器：
 * 实现适配接口并继承适配类
 * 
 * @author xiahongjian
 * @time   2018:01:30 13:44:01
 */
public class Adaptor implements Target {

	private ConcreteAdaptee adaptee;
	
	public Adaptor(ConcreteAdaptee adaptee) {
		this.adaptee = adaptee;
	}
	
	@Override
	public void request() {
		adaptee.specificRequest();
	}

}
