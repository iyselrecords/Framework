package com.opus2.util.components;

import net.serenitybdd.core.annotations.ImplementedBy;

import org.openqa.selenium.WebElement;

import com.opus2.util.components.impl.DocumentViewControlImpl;

@ImplementedBy(DocumentViewControlImpl.class)
public interface DocumentViewControl extends Component {
	WebElement button(String string);

}
