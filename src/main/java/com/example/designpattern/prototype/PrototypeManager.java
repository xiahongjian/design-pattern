package com.example.designpattern.prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * 原型管理器
 * 
 * 保存了一些列类的原型，当需要某个类的实例时，就使用对应类的原型对象进行克隆并返回
 * 
 * @author xiahongjian
 * @time   2018:01:26 10:40:54
 */
public class PrototypeManager {
	private Map<String, OfficialDocument> holder = new HashMap<>(2);
	private static final PrototypeManager INSTANCE = new PrototypeManager();
	private PrototypeManager() {
		holder.put("far", new FAR());
		holder.put("srs", new SRS());
	}
	
	public void addOfficialDocument(String key, OfficialDocument doc) {
		holder.put(key, doc);
	}
	
	public OfficialDocument getOfficialDocument(String key) {
		OfficialDocument doc = holder.get(key);
		return doc == null ? null : doc.clone();
	}
	
	public static PrototypeManager getPrototypeManager() {
		return INSTANCE;
	}
}
