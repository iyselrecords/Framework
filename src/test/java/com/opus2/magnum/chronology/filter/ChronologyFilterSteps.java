package com.opus2.magnum.chronology.filter;

import org.openqa.selenium.WebElement;

import net.thucydides.core.annotations.Step;

public class ChronologyFilterSteps {
	ChronologyFilter filter;
	
	public String assertDIP(){
		return "TDIP";
	}
	
	@Step()
	public void openFilter() {
		filter.openFilter();
	}

	@Step()
	public WebElement iwdCheckbox() {
		return filter.iwdCheckbox();
	}
	
	@Step()
	public void itemsWithoutDescription() {
		filter.itemsWithoutDescription();
	}
	
	@Step()
	public void dateOption(String option) {
		filter.dateOption(option);
	}
	
	@Step()
	public String openDialog() {
		return filter.openDialog();
	}
	
	@Step()
	public void checkFilterIsOpen() {
		filter.checkFilterIsOpen();
	}
	
	@Step()
	public void statusOption(String option) {
		filter.statusOption(option);
	}

	@Step()
    public void tagOption(String tag) {
        filter.tagOption(tag);
    }
	
	@Step()
    public void docWithoutTags() {
       filter.docWithoutTags();
    }
	
	@Step()
    public void typeOption(String type) {
	    filter.typeOption(type);
    }

	@Step()
    public void customTypeOption() {
        filter.customTypeOption();
    }
	
	@Step()
	public void multipleSelection(String status) {
        filter.multipleSelection(status);
    }
}
