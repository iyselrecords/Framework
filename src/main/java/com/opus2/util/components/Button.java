package com.opus2.util.components;

import org.openqa.selenium.WebElement;

import com.opus2.util.components.impl.ButtonImpl;

import net.serenitybdd.core.annotations.ImplementedBy;

@ImplementedBy(ButtonImpl.class)
public interface Button extends Component {
	void click();
	WebElement hasButton(String button);
	WebElement withButton(String button, String buttonName);
}	
