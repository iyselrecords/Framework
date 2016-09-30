package com.opus2.magnum.chronology.customtypes;

import org.openqa.selenium.WebElement;

import net.thucydides.core.annotations.Step;

public class CustomTypesSteps {
	CustomTypes type;

	@Step("dummy data")
	public String assertDIP(){
		return "TDIP";
	}

	public String dialog() {
		return type.dialog();
	}
	
	@Step()
	public void newCustomType(){
		type.newCustomType();
	}
	
	@Step()
	public void save(){
		type.save();
	}

	@Step("select custom type")
	public void selectCustomType(String customType) {
		type.selectCustomType(customType);
	}
	
	@Step()
	public void rename() {
		type.rename();
	}
	
	@Step()
	public void update() {
		type.update();
	}
	
	@Step("search term")
	public void search() {
		type.search();
	}
	
	@Step("add custom type")
	public void addCustomType() {
		type.addCustomType();
	}
	
	@Step()
    public String getCustomType() {
      return type.getCustomType();
    }
	
	@Step()
	public WebElement isDeleted() {
       return type.isDeleted();
    }
	
	@Step()
    public void newCustomType(String customType){
        type.newCustomType(customType);
    }

	@Step()
    public String getCustomType(String addType) {
	    return type.getCustomType(addType);
    }
}
