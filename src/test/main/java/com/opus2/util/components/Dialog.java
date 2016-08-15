package com.opus2.util.components;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.ImplementedBy;

import com.opus2.util.components.impl.DialogImpl;

@ImplementedBy(DialogImpl.class)
public interface Dialog extends Component {
	WebElement hasDialog(String elementId);
	WebElement xButton(String elementId);
	void isNotVisible(String elementId);
}
