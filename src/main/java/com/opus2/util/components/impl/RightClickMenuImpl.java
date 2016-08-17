package com.opus2.util.components.impl;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.pagefactory.ElementLocator;

import com.opus2.util.Util;
import com.opus2.util.components.RightClickMenu;

public class RightClickMenuImpl extends ComponentImpl implements RightClickMenu {
	
	public RightClickMenuImpl(WebDriver driver, ElementLocator locator,long implicitTimeoutInMilliseconds) {
		super(driver, locator, implicitTimeoutInMilliseconds);
	}

	@Override
	public WebElement selectOption(String optionName) {
		WebElement elem = null;
		WebElement menu = Util.getDriver().findElement(By.id("rightClickMenu"));
		List <WebElement> options = menu.findElements(By.tagName("span"));
		for(WebElement option : options){
			if(option.getText().equals(optionName)){
				elem = option;
				break;
			}
		}
		return elem;
	}

	@Override
	public WebElement hasOption(String option) {
		return selectOption(option);
	}

	@Override
	public WebElement hasButton(String elementId) {
	 	return Util.getDriver().findElement(By.id(elementId));
	}

	@Override
	public void mouseOverOption(WebElement hasOption) {
		Actions action = new Actions(Util.getDriver());
		action.moveToElement(hasOption).build().perform();
	}
	
	@Override
	public WebElement subMenuOption(String optionName) {
		WebElement elem = null;
		WebElement menu = Util.getDriver().findElement(By.id("submenu"));
		List <WebElement> options = menu.findElements(By.tagName("span"));
		for(WebElement option : options){
			if(option.getText().equals(optionName)){
				elem = option;
				break;
			}
		}
		return elem;
	}
	
	@Override
	public WebElement subMenu(String option) {
		return subMenuOption(option);
	}

	@Override
	public WebElement withButton(String header, String buttonName) {
		WebElement element = null;
		List<WebElement> dialogs = Util.getDriver().findElements(By.className("dialog"));
		for(WebElement dialog : dialogs){
			if(dialog.findElement(By.tagName("h2")).getText().equals(header.toUpperCase())){
				List<WebElement> buttons = dialog.findElements(By.tagName("button"));
				for(WebElement button : buttons){
					if(button.getText().equals(buttonName)){
						element = button;
						break;
					}
				}
				break;
			}
		}	
		return element;
	}
	
	@Override
	public WebElement getDocument(String docTitle) {
		WebElement document = null;
		List <WebElement> documents = Util.getDriver().findElement(By.id("docsdiv"))
			.findElements(By.className("doctitle"));
		for(WebElement element : documents){
			if(element.getText().equals(docTitle)){
				document = element;
				break;
			}
		}
		return document;
	}

	@Override
	public void rightclickDocument(String document) {
		Actions action = new Actions(Util.getDriver());
		action.contextClick(getDocument(document)).sendKeys(Keys.ARROW_DOWN).perform();
	}

	@Override
	public WebElement getFolder(String docLink) {
		WebElement folder = null;	
		List <WebElement> docrows = Util.getDriver().findElement(By.id("docsdiv"))
			.findElements(By.className("docrow"));
		for(WebElement row : docrows){
			List <WebElement> doclinks = row.findElements(By.className("doclink"));
			for(WebElement link : doclinks){
				if(link.getText().equals(docLink)){
					folder = link;
					break;
				}
			}
			break;
		}
		return folder;
	}

	@Override
	public void rightclickFolder(String folder) {
		Actions action = new Actions(Util.getDriver());
		action.contextClick(getFolder(folder)).sendKeys(Keys.ARROW_DOWN).perform();
	}
}
