package com.example.designpattern.factory.abstractfactory;

public interface SkinFactory {
	Button createButton();
	
	TextField createTextField();
	
	ComboBox createComboBox();
}
