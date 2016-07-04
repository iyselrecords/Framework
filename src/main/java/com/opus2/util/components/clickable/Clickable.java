package com.opus2.util.components.clickable;

import org.openqa.selenium.WebElement;

import com.opus2.util.components.Component;

public abstract class Clickable extends Component {
	public Clickable(WebElement me) {
		super(me);
	}
	public void click() {
		me.click();
	}
	public abstract Boolean isPressed();
	public Boolean isEnabled(){
		return me.isEnabled();
	}
}
