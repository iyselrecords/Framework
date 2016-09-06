package com.opus2.util.components.impl;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.pagefactory.ElementLocator;

import com.opus2.enums.Tool;
import com.opus2.util.Util;
import com.opus2.util.components.Tools;

public class ToolsImpl extends ComponentImpl implements Tools{
	private static final String CHRONOLOGY_PAGE = "docscontrols_Tools";
	private static final String NOTES_PAGE = "notecontrols_Tools";
	private static final String SEARCH_PAGE = "maintoolbar_Tools";
	
	public ToolsImpl(WebDriver driver, ElementLocator locator,long implicitTimeoutInMilliseconds) {
		super(driver, locator, implicitTimeoutInMilliseconds);
	}


	@Override
	public void getOption(Tool page, String option) {
		switch(page){
		case CHRONOLOGY:
			option(CHRONOLOGY_PAGE, "chron-tools_chron-tools", option);
			break;
		case NOTES:
			option(NOTES_PAGE, "notes-tools_notes-tools", option);
			break;
		case SEARCH:
			option(SEARCH_PAGE, "tools-popup", option);
			break;
		}
	}
	
	private void option(String buttonId, String topLevelId, String dropdownOption) {
		Util.getDriver().findElements(By.id(buttonId))
			.get(0).click();
		
		List<WebElement> options = Util.getDriver().findElement(By.id(topLevelId))
				.findElements(By.tagName("button"));
			for(WebElement button : options){		
				if(button.getText().equals(dropdownOption)){
					button.click();
					break;
				}
			}
			Util.pause(1);
	}

}
