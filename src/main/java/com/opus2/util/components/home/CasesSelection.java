package com.opus2.util.components.home;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.opus2.util.components.Search;

import net.serenitybdd.core.pages.PageObject;

public class CasesSelection extends PageObject {
	private static final String SEARCH_COMPONENT_ID = "wsfindcontainer";
	private static final String WORKSPACE_ELEMENTS_CLASS = "wsline";
	private Search searchComponent;
	@FindBy(id="workspaceslist")
	private WebElement list;
	WebDriver driver;
	public CasesSelection(WebDriver driver){
		super(driver);
		this.driver = driver;
		searchComponent = new Search(driver.findElement(By.id(SEARCH_COMPONENT_ID)));
	}
	public List<WebElement> findCase(String text){
		searchComponent.find(text);
		return getVisibleWorkspaces();
	}
	public List<WebElement>  getVisibleWorkspaces(){
		return driver.findElements(By.className(WORKSPACE_ELEMENTS_CLASS));
	}
}
