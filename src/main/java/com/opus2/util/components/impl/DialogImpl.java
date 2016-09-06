package com.opus2.util.components.impl;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.pagefactory.ElementLocator;

import com.opus2.util.Util;
import com.opus2.util.components.Dialog;

public class DialogImpl extends ComponentImpl implements Dialog {
	private static final String FIND_INPUT = "searchInputArea";
	private static final String FIND_MATCH = "findmatch";
	
	
	public DialogImpl(WebDriver driver, ElementLocator locator,long implicitTimeoutInMilliseconds) {
		super(driver, locator, implicitTimeoutInMilliseconds);
	}

	@Override
	public String hasDialog(String elementId) {
		return Util.getDriver().findElement(By.id(elementId))
				.getCssValue("display");
	}

	@Override
	public WebElement xButton(String elementId) {
		return Util.getDriver().findElement(By.id(elementId))
		.findElements(By.tagName("button")).get(0);
	}

	@Override
	public String notVisible(String elementId) {
		return Util.getDriver().findElement(By.id(elementId))
			.getCssValue("display");
	}

	@Override
	public WebElement folder(String folder) {
		return Util.getDriver().findElements(By.className(folder)).get(0);
	}

	@Override
	public WebElement dialog(String dialogHeader){
		WebElement element = null;
		List<WebElement> dialogs = Util.getDriver().findElements(By.className("dialog"));
		for(WebElement dialog :dialogs){
			List<WebElement> h2s = dialog.findElements(By.tagName("h2"));
			for(WebElement h2 : h2s){
				if(h2.getText().equals(dialogHeader.toUpperCase())){
					element = dialog;
					break;
				}
				else if(h2.getAttribute("innerHTML").equals(dialogHeader)){
					element = dialog;
					break;
				}
			}
		}
		return element;
	}

	@Override
	public WebElement hasInput(String dialog) {
		return Util.getDriver().findElement(By.id(dialog))
			.findElements(By.tagName("input")).get(0);
	}
	
	@Override
	public WebElement hasTextArea(String dialog) {
		return Util.getDriver().findElement(By.id(dialog))
			.findElements(By.tagName("textarea")).get(0);
	}
	
	@Override
	public String getTitle(String dialogId) {
		return Util.getDriver().findElement(By.id(dialogId))
			.findElements(By.tagName("h2")).get(0).getText();
	}

	@Override
	public WebElement button(String name) {
		WebElement element = null;
		List<WebElement> dialogs = Util.getDriver().findElements(By.className("dialog"));
		for(WebElement dialog :dialogs){
			List<WebElement> buttons = dialog.findElements(By.tagName("button"));
			for(WebElement button : buttons){
				if(button.getText().equals(name)){
					element = button;
					break;
				}
			}
		}
		return element;
	}

	@Override
	public WebElement buttonByTitle(String title) {
		WebElement element = null;
		List<WebElement> dialogs = Util.getDriver().findElements(By.className("dialog"));
		for(WebElement dialog :dialogs){
			List<WebElement> buttons = dialog.findElements(By.tagName("button"));
			for(WebElement button : buttons){
				if(button.getAttribute("title").equals(title)){
					element = button;
					break;
				}
			}
		}
		return element;
	}

	@Override
	public void find(String link) {
		WebElement d = Util.getDriver().findElements(By.className(FIND_INPUT)).get(0);
		d.findElements(By.tagName("input")).get(0).sendKeys(link);
		d.findElements(By.tagName("button")).get(3).click();
		Util.pause(1);
		findmatch();
		Util.pause(0.5);
	}

	private void findmatch() {
		Util.getDriver().findElements(By.className(FIND_MATCH))
			.get(0).click();
	}

	@Override
	public void links(String link) {
		Util.getDriver().findElement(By.linkText(link)).click();
		Util.pause(1);
	}
	
	@Override
	public void find2(String dialog, String link) {
		WebElement d = dialog(dialog).findElements(By.className(FIND_INPUT)).get(0);
		d.findElements(By.tagName("input")).get(0).sendKeys(link);
		Util.pause(0.5);
		findmatch(dialog);
	}

	private void findmatch(String dialog) {
		dialog(dialog).findElements(By.className(FIND_MATCH))
			.get(0).click();
	}

	@Override
	public void input(String dialog, String input) {
		WebElement d = dialog(dialog);
		int s = d.findElements(By.tagName("input")).size();
		if(s == 1){
			d = d.findElements(By.tagName("input")).get(0);
			Util.pause(1);
			d.clear();
			d.sendKeys(input);
		}else if(s > 1){
			d = d.findElements(By.tagName("input")).get(1);
			Util.pause(1);
			d.clear();
			d.sendKeys(input);
		}
		Util.pause(0.5);
	}

	@Override
	public void select(String name) {
		List <WebElement> lists = Util.getDriver().findElements(By.className("itemText"));
		for(WebElement list : lists){
			if(list.getText().equals(name)){
				list.click();
				break;
			}
		}
		Util.pause(0.5);
	}
	
	@Override
	public void selectDocument(String document) {
		Util.pause(3);
		Util.getDriver().findElements(By.className("searchInputArea")).get(1)
			.findElements(By.tagName("input")).get(0).sendKeys(document);
		Util.pause(2);
		
		List <WebElement> rows = Util.getDriver().findElements(By.className("docstree")).get(0)
			.findElements(By.tagName("tr"));
		for(WebElement row : rows){
			List <WebElement> lists = row.findElements(By.className("doctitle"));
			for(WebElement list : lists){
				if(list.getText().equals(document)){
					row.click();	
					Util.pause(0.5);	
					return;
				}
			}
		}
	}
}
