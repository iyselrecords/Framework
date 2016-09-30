package com.opus2.magnum.chronology.filter;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebElement;

import com.opus2.magnum.chronology.customtypes.CustomTypes;
import com.opus2.util.Page;
import com.opus2.util.Util;
import com.opus2.util.components.Dialog;
import com.opus2.util.components.Dropdown;

public class ChronologyFilter extends Page {
	public static final String BUTTON = "docscontrols_Filter";
	public static final String DIALOG = "chron-filter";
	public static final String IWD_CHECKBOX = "chron-filter_chron-filter";
	public static final String FROM_DATE = "05/13/2016";
	public static final String TO_DATE = "06/13/2016";
	public static final String FROM_DATE_INPUT = "filter-from-date";
	public static final String TO_DATE_INPUT = "filter-to-date";
    private static final String RESET_BUTTON = "docscontrols_Reset";
    private static final String SELECT_TAG = "select_tags";
    private static final String APPLY_TAG = "category-filter_Apply";
    private static final String SELECT_TYPE = "chron-filter_chron-filter_Select";
    private static String CustomType = null;
	
	private Dropdown option;
	private Dialog dialog;
	
	
	public void openFilter() {
		withTimeoutOf(5, TimeUnit.SECONDS).waitForPresenceOf(By.id(BUTTON));
		this.getElement(BUTTON).click();
	}
	
	public void closeFilter() {
		openFilter();
	}
	
	public String openDialog() {
		Util.pause(1);
		return this.getElement(DIALOG).getCssValue("display");
	}
	
	public WebElement iwdCheckbox() {
		return this.getElement(IWD_CHECKBOX)
			.findElements(By.tagName("input")).get(0);
	}
	
	public void itemsWithoutDescription() {
		iwdCheckbox().click();
		Util.pause(1);
		closeFilter();
		Util.pause(1);
		reset();
	}

	private void reset() {
        this.getElement(RESET_BUTTON).click();
    }
	
    public void dateOption(String dropdownOption) {	
		if(dropdownOption.equals("Range")){
		    option.getOptions(1, dropdownOption);
			fromDate();	toDate();
			Util.pause(1);
		}else{
			fromDate();
			option.getOptions(1, dropdownOption);
		}
		closeFilter();
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

    public void tagOption(String tag) {
        this.getElement(SELECT_TAG).click();
        dialog.links("None");
        dialog.select(tag);
        Util.pause(0.5);
        this.getElement(APPLY_TAG).click();
        closeFilter();
        Util.pause(1);
    }

    public void docWithoutTags() {
        this.getElement(SELECT_TAG).click();
        dialog.links("None");
        Util.pause(0.5);
        withoutTag();
        this.getElement(APPLY_TAG).click();
        closeFilter();
        Util.pause(1);
    }

    private void withoutTag() {
        int s = Util.getDriver().findElements(By.className("treepanellabel")).size();
        Util.getDriver().findElements(By.className("treepanellabel")).get(s-1).click();
    }

    public void typeOption(String type) {
        if(type.equalsIgnoreCase("No Type")){
          type = "[no type]";
        }
        this.getElement(SELECT_TYPE).click();
        none();
        getType(type);
        closeFilter();
    }

    private void getType(String type) {
        List <WebElement> options = this.getElementByClass("listSelectorItems")
            .findElements(By.className("selectable"));
        for (WebElement option : options){
            if(option.findElement(By.className("listSelectorValue")).getText().equals(type)){
                option.findElements(By.tagName("input")).get(0).click();
                break;
            }
        }
    }

    private void none() {
        Util.pause(1.5);
        Util.getDriver().findElements(By.className("action")).get(1).click();
    }

    public void customTypeOption() {
        typeOption(CustomTypes.ADD_TYPE);
        Util.pause(3);
        reset();
    }
    
    public void multipleSelection(String status) {
        iwdCheckbox().click();
        Util.pause(1);
        statusOption(status);
    }
}
