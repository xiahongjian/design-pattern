package com.example.designpattern.prototype;

public interface OfficialDocument extends Cloneable {
	OfficialDocument clone();
	void display();
}
