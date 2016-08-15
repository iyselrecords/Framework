package com.opus2.magnum.documents.rightClickMenu;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import com.opus2.util.Util;

import net.thucydides.core.annotations.Step;

public class RightClickMenuSteps {
	@Step
	public WebElement document() {
		Util.loadingIcon();
		return Util.getDriver().findElement(By.className("heading"));
	}
	
	@Step
	public WebElement rightClickMenu() {
	    Util.pause(1);
		return Util.getDriver().findElement(By.id("rightClickMenu"));
	}

	@Step
	public void rightClickDocument() {
		Actions action = new Actions(Util.getDriver());
		action.contextClick(getDocument()).sendKeys(Keys.ARROW_DOWN).perform();
	}

	private WebElement getDocument() {
		WebElement folWrap = Util.getDriver().findElement(By.id("docsdiv"))
			.findElements(By.className("foldercontents")).get(0);
		WebElement doc = folWrap.findElements(By.tagName("tr")).get(1)
			.findElements(By.className("doctitle")).get(0);
		return doc;
	}

	@Step
	public WebElement folder() {
		Util.loadingIcon();
		return Util.getDriver().findElement(By.className("heading"));
	}
	
	@Step
	public void rightClickFolder(){
		Actions action = new Actions(Util.getDriver());
		action.contextClick(getFolder()).sendKeys(Keys.ARROW_DOWN).perform();
	}
	
	private WebElement getFolder() {
		WebElement folder = Util.getDriver().findElement(By.id("docsdiv"))
			.findElements(By.className("docrow")).get(0);
		return folder;
	}
}
