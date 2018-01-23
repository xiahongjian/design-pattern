package com.example.designpattern;

import org.dom4j.Document;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;

public class ConfigUtil {
	
	public static Object getBean(String xpath) {
		SAXReader reader = new SAXReader();
		try {
			Document doc = reader.read(Thread.currentThread().getContextClassLoader().getResourceAsStream("config.xml"));
			Node node = doc.selectSingleNode(xpath);
			String className = node.getText();
			return Class.forName(className).newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
}
