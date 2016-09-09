package com.opus2.magnum.chronology.filter;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.opus2.util.Page;
import com.opus2.util.Util;
import com.opus2.util.components.Dropdown;

public class ChronologyFilter extends Page {
	public static final String BUTTON = "docscontrols_Filter";
	public static final String DIALOG = "chron-filter";
	public static final String IWD_CHECKBOX = "chron-filter_chron-filter";
	public static final String FROM_DATE = "05/13/2016";
	public static final String TO_DATE = "06/13/2016";
	public static final String FROM_DATE_INPUT = "filter-from-date";
	public static final String TO_DATE_INPUT = "filter-to-date";
	
	private static String DateOption;
	
	private Dropdown option;
	
	public void openFilter() {
		withTimeoutOf(5, TimeUnit.SECONDS).waitForPresenceOf(By.id(BUTTON));
		this.getElement(BUTTON).click();
	}
	
	public void closeFilter() {
		openFilter();
	}
	
	public String openDialog() {
		Util.pause(2);
		return this.getElement(DIALOG).getCssValue("display");
	}
	
	public WebElement iwdCheckbox() {
		return this.getElement(IWD_CHECKBOX)
			.findElements(By.tagName("input")).get(0);
	}
	
	public void itemsWithoutDescription() {
		iwdCheckbox().click();
	}

	public void dateOption(String dropdownOption) {
		checkFilterIsOpen();	
		option.getOptions(1, dropdownOption);
		if(dropdownOption.equals("Range")){
			fromDate();	toDate();
		}else{
			fromDate();
		}
		closeFilter();
		DateOption = dropdownOption;
	}
	
	public void checkFilterIsOpen() {
		Util.pause(0.5);
		if(this.getElement(DIALOG).getCssValue("display").equals("block")){
			return;
		}else{
			openFilter();
		}
	}

	public void fromDate() {
		WebElement a = this.getElement(FROM_DATE_INPUT);
		Util.pause(1);
		if(a.getAttribute("value").isEmpty()){
			this.getElement(FROM_DATE_INPUT).clear();
			this.getElement(FROM_DATE_INPUT).sendKeys(FROM_DATE);
		}else if(!a.getAttribute("value").isEmpty()){
			return;
		}
	}
	
	public void toDate() {
		this.getElement(TO_DATE_INPUT).clear();
		this.getElement(TO_DATE_INPUT).sendKeys(TO_DATE);
	}

	public void statusOption(String dropdownOption) {
		option.getOptions(2, dropdownOption);
	}
}
