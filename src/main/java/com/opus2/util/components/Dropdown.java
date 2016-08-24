package com.opus2.util.components;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.ImplementedBy;

import com.opus2.util.components.impl.DropdownImpl;

@ImplementedBy(DropdownImpl.class)
public interface Dropdown extends Component{
	String isVisible(String dropdown);
    WebElement selectOption(String dropdownOption);
    WebElement dropdownPanel(int index);
    WebElement getOption(int index, String dropdownOption);
}
