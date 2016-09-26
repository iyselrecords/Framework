package com.opus2.util.components.impl;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.pagefactory.ElementLocator;

import com.opus2.util.Util;
import com.opus2.util.components.Annotation;

public class AnnotationImpl extends ComponentImpl implements Annotation {

	private WebElement element = null;

    public AnnotationImpl(WebDriver driver, ElementLocator locator, long implicitTimeoutInMilliseconds) {
		super(driver, locator, implicitTimeoutInMilliseconds);
	}
	
	@Override
    public WebElement button(String title) {
  	    List<WebElement> buttons = Util.getDriver().findElement(By.id("annotation-editor"))
  	        .findElements(By.tagName("button"));
        for(WebElement button :buttons){
            if(button.getAttribute("title").equals(title)){
                element = button;
                break;
            }
        }
        return element;
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
		List<WebElement> notes = Util.getDriver().findElements(By.className("notepara"));
		for(WebElement note :notes){
			if(note.getText().equals(text)){
				element = note;
				break;
			}
		}
		return element;
	}

    @Override
    public void highlightText(int page, int line) {
        Actions action = new Actions(Util.getDriver());
        action.moveToElement(lineText(page, line), 5, 9).clickAndHold()
            .moveByOffset(15, 0).release().build().perform();
        Util.pause(1);
    }
  
    @Override
    public void addNote(String note) {
        WebElement input = Util.getDriver().findElement(By.id("annotation-editor"))
            .findElements(By.tagName("textarea")).get(1);
        input.sendKeys(note);
    }
    
    @Override
    public WebElement lineText(int page, int line) {
        String p = Integer.toString(page-1);
        String l = Integer.toString(line-1);
        String pl = p.concat("_".concat(l));
        WebElement text = Util.getDriver().findElement(By.id("line_".concat(pl)))
            .findElements(By.className("trlinetext")).get(0);
        return text;
    }
}
