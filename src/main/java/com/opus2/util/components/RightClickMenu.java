package com.opus2.util.components;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.ImplementedBy;

import com.opus2.util.components.impl.RightClickMenuImpl;

@ImplementedBy(RightClickMenuImpl.class)
public interface RightClickMenu  extends Button {
	WebElement selectOption(String option);
	WebElement hasOption(String option);
	void mouseOverOption(WebElement hasOption);
	WebElement subMenuOption(String option);
	WebElement subMenu(String option);
	WebElement getFolder(String folder);
	void rightclickFolder(String folder);
}
