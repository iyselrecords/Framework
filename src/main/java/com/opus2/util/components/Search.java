package com.opus2.util.components;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

public class Search extends Component {
	@FindBys({@FindBy(className="searchComponentInput"), @FindBy(tagName = "input")})
	WebElement input;
	@FindBys({@FindBy(className="searchComponent"), @FindBy(tagName = "button")})
	WebElement searchBtn;
	public Search(WebElement me){
		super(me);
	}

	public void find(String text) {
		input.sendKeys(text);
		searchBtn.click();
	}
	public void resetSearchString(){
		input.clear();
		searchBtn.click();
	}
}
