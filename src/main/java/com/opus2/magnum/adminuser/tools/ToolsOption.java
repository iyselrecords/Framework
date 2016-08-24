package com.opus2.magnum.adminuser.tools;

import org.openqa.selenium.WebElement;

import com.opus2.util.Page;
import com.opus2.util.components.Dropdown;

public class ToolsOption extends Page {
	
	private static final String TOOLS_BUTTON = "maindiv_Tools";
	private Dropdown option;
	
	public WebElement toolsDropdownButton() {
		return this.getElement(TOOLS_BUTTON);
	}

	public void openDropdown() {
		toolsDropdownButton().click();
	}

	public String toolsDropdown() {
		return option.dropdownPanel(0).getCssValue("display");
	}

}
