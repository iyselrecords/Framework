package com.opus2.util.components.impl;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.pagefactory.ElementLocator;

import com.opus2.util.Util;
import com.opus2.util.components.Annotation;

public class AnnotationImpl extends ComponentImpl implements Annotation {

	public AnnotationImpl(WebDriver driver, ElementLocator locator, long implicitTimeoutInMilliseconds) {
		super(driver, locator, implicitTimeoutInMilliseconds);
	}

	@Override
	public void addTag(String tagName) {
		List <WebElement> tags = Util.getDriver().findElement(By.id("annotation-editor"))
			.findElements(By.className("toggletag"));
		for(WebElement tag : tags){
			if(tag.getText().equals(tagName)){
				tag.click();
				break;
			}
		}
	}

	@Override
	public WebElement note(String text) {
		WebElement element = null;
		List<WebElement> notes = Util.getDriver().findElements(By.className("notepara"));
		for(WebElement note :notes){
			if(note.getText().equals(text)){
				element = note;
				break;
			}
		}
		return element;
	}

}
