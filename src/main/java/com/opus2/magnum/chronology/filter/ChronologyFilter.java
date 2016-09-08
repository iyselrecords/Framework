package com.opus2.magnum.chronology.filter;

import java.util.List;
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
	public static final String DATE_OPTION_ON = "On";
	public static final String DATE_OPTION_AFTER = "After";
	public static final String DATE_OPTION_BEFORE = "Before";
	public static final String DATE_OPTION_RANGE = "Range";
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
		if(dropdownOption.equals(DATE_OPTION_RANGE)){
			fromDate();	toDate();
		}else{
			fromDate();
		}	
		closeFilter();
		DateOption = dropdownOption;
	}
	
	public void checkFilterIsOpen() {
		Util.pause(1);
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

	public String onDate() {
		getDate();	
		return FROM_DATE;
	}

	private void getDate() {
		Util.pause(1);
		List <WebElement> a = Util.getDriver().findElement(By.className("chronmain"))
			.findElements(By.className("factfirst"));
		for(WebElement c : a){
			//System.out.println(DateOption +": "+ c.getAttribute("class"));
			if(!c.getAttribute("class").equals("hidden")){
				System.out.println(DateOption +": "+ c.findElement(By.className("auc0")).findElements(By.tagName("span")).get(0).getText());
			}
		}
	}

	

	
	
	
	
}
