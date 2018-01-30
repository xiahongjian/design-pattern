package com.example.designpattern.adapter;

/**
 * 双向适配器
 * 
 * @author xiahongjian
 * @time   2018:01:30 13:54:20
 */
public class BidirectionalAdapter implements Target, Adaptee {
	private Target target;
	private Adaptee adaptee;

	public BidirectionalAdapter(Target target) {
		this.target = target;
	}
	
	public BidirectionalAdapter(Adaptee adaptee) {
		this.adaptee = adaptee;
	}
	
	@Override
	public void specificRequest() {
		target.request();
	}

	@Override
	public void request() {
		adaptee.specificRequest();
	}

}
