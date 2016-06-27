package com.opus2.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.opus2.enums.ChronologyType;
import com.opus2.util.Event;
import com.opus2.util.Util;

import net.thucydides.core.pages.PageObject;

public class Chronology extends PageObject {
	public WebDriver driver = getDriver();
	Util util;
	Event event;
	Dialog dialog;
	UserAction action;
	
	public void goTo() {
		getDriver().findElement(By.id("magnumChronology")).click();
	}

	public void newEntry() {
		action.clickAction("docscontrols_NewEntry");
	}

	public void selectLastEntry() {
		event.selectLastEntry();
	}

	
	public void selectTag() {
		action.clickAction("select_tags");			
	}
	
	public void saveChanges() {
		action.clickAction("button-div_SaveChanges");
	}

	public void select(ChronologyType type) {
		action.clickAction("preview-div","button",0);
		event.selectType(type);
	}

	public void customType() {
		action.clickAction("docscontrols_CustomTypes");	
	}

	public void filter() {
		action.clickAction("docscontrols_Filter");
	}
	
	public void reset() {
		action.clickAction("docscontrols_Reset");
        util.pause(1);
	}
	
	
}
