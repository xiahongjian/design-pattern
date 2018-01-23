package com.example.designpattern.singleton;

/**
 * Initialization on Demand Holder(IoDH)实现单例
 * 
 * 利用Java虚拟机类加载器的机制实现单例
 * 
 * @author xiahongjian
 * @time   2018:01:23 15:27:21
 */
public class Singleton {
	
	// 私有构造方法
	private Singleton() {}
	
	// 创建私有内部类，并且有一个Singleton事例的静态字段
	private static class Holder {
		private static final Singleton INSTANCE = new Singleton();
	}
	
	public static Singleton getInstance() {
		return Holder.INSTANCE;
	}
}
