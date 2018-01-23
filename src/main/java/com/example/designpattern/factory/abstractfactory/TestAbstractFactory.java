package com.example.designpattern.factory.abstractfactory;

import com.example.designpattern.ConfigUtil;

/**
 * 抽象工厂设计模式
 * 
 * 产品等级： 如电视机这一类型产品就是一个产品等级
 * 产品族： 同一品牌下的所有产品，如海尔品牌旗下的产品，海尔电视机、海尔空调、海尔电冰箱等
 * 
 * 此模式适用于包含多个产品等级，并且需要根据产品族进行分类使用，会增加产品族却不会增加产品等级
 * 
 * 对于修改产品族符合开闭原则，修改产品等级不符合开闭原则
 * 
 * @author hongjianxia
 *
 */
public class TestAbstractFactory {
	public static void main(String[] args) {
		SkinFactory skinFactory = (SkinFactory) ConfigUtil.getBean("/skin-factory");
		Button button = skinFactory.createButton();
		TextField textField = skinFactory.createTextField();
		ComboBox comboBox = skinFactory.createComboBox();
		
		button.display();
		textField.display();
		comboBox.display();
	}
}
