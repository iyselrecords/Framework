package com.opus2.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.opus2.enums.ChronologyOption;
import com.opus2.enums.ChronologyType;
import com.opus2.util.Event;
import com.opus2.util.Util;

import net.thucydides.core.pages.PageObject;

public class Chronology extends PageObject {
	public WebDriver driver = getDriver();
	Util util;
	Event event;
	Dialog dialog;
	
	public void goTo() {
		getDriver().findElement(By.id("magnumChronology")).click();
	}

	public void newEntry() {
		util.clickAction("docscontrols_NewEntry");
	}

	public void selectLastEntry() {
		event.selectLastEntry();
	}

	
	public void selectTag() {
		util.clickAction("select_tags");			
	}
	
	public void saveChanges() {
		util.clickAction("button-div_SaveChanges");
	}

	public void select(ChronologyType type) {
		util.clickAction("preview-div","button",0);
		event.selectType(type);
	}
	public void select(ChronologyOption type) {
		util.clickAction("preview-div","button", 0);
		event.selectType(type);
	}
	public void customType() {
		util.clickAction("docscontrols_CustomTypes");	
	}
	
	
}
