package com.opus2.util.components.impl;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.pagefactory.ElementLocator;

import com.opus2.util.Util;
import com.opus2.util.components.Dropdown;

public class DropdownImpl extends ComponentImpl implements Dropdown {
	private static final String VIEW_MENU = "view-menu";
	
	public DropdownImpl(WebDriver driver, ElementLocator locator, long implicitTimeoutInMilliseconds) {
		super(driver, locator, implicitTimeoutInMilliseconds);
	}

	@Override
	public String isVisible(String dropdown) {
		Util.pause(2);
		return Util.getDriver().findElements(By.className(dropdown)).get(0)
			.getCssValue("display");
	}

	@Override
	public WebElement selectOption(String dropdownOption) {
		WebElement element = null;
		List<WebElement> options = Util.getDriver().findElement(By.id(VIEW_MENU))
			.findElements(By.tagName("span"));
		for(WebElement option : options){		
			if(option.getText().equals(dropdownOption)){
				element = option;
			}
		}
		return element;
	}

	@Override
	public WebElement dropdownPanel(int index) {
		return Util.getDriver().findElements(By.className("menu")).get(index);
	}

	@Override
	public WebElement getOption(int index, String dropdownOption) {
		WebElement element = null;
		List<WebElement> options = dropdownPanel(index)
			.findElements(By.tagName("span"));
		for(WebElement option : options){		
			if(option.getText().equals(dropdownOption)){
				element = option;
			}
		}
		return element;
	}
	
	@Override
	public void getOption(String dropdownOption) {
		Util.getDriver().findElements(By.className("normalIcon"))
			.get(0).click();
		
		List<WebElement> options = Util.getDriver().findElement(By.id(VIEW_MENU))
			.findElements(By.tagName("span"));
		for(WebElement option : options){		
			if(option.getText().equals(dropdownOption)){
				option.click();
				break;
			}
		}
		Util.pause(1);
	}
	
	@Override
	public void getOptions(int index, String dropdownOption) {
		Util.getDriver().findElements(By.className("normalIcon"))
			.get(index).click();
		
		List<WebElement> options = dropdownPanel(index)
			.findElements(By.tagName("span"));
		for(WebElement option : options){		
			if(option.getText().equals(dropdownOption)){
				option.click();
				break;
			}
		}
		Util.pause(1);
	}

    @Override
    public WebElement isOpen() {
        return Util.getDriver().findElements(By.className("menu")).get(0);
    }
    
    @Override
    public void myOption(int index, String dropdownOption) {
        WebElement topLevel = Util.getDriver().findElements(By.className("sideComponent")).get(index);     
        topLevel.findElement(By.className("normalIcon")).click();
        Util.pause(1);
        
        List<WebElement> options = topLevel.findElements(By.tagName("span"));
        for(WebElement option : options){       
            if(option.getText().equals(dropdownOption)){
                option.click();
                break;
            }
        }
        Util.pause(1);
    }
}
