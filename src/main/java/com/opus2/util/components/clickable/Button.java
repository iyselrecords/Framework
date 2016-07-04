package com.opus2.util.components.clickable;

import org.openqa.selenium.WebElement;

public class Button extends Clickable {

	private static final String ACTIVE_CLASS = "active";

	public Button(WebElement me) {
		super(me);
	}

	@Override
	public Boolean isPressed() {
	 return hasClass(ACTIVE_CLASS);
	}


}
