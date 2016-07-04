package com.opus2.util.components;

import java.util.ArrayList;

import org.openqa.selenium.WebElement;

public class Component {
	protected WebElement me;

	public Component(WebElement me){
		this.me = me;
	}
	public boolean hasClass(String cssClassName) {
		String cssClassValue = me.getAttribute("class").toLowerCase();
		String[] classes = cssClassValue.split(" ");
		ArrayList<String> cssClasses = new ArrayList<String>();
		for(String cssClass : classes){
			String trimmed = cssClass.trim();
			if(!trimmed.equals("")){
				cssClasses.add(trimmed.toLowerCase());
			}
		}
		return cssClasses.contains(cssClassName.toLowerCase());
	}
}
