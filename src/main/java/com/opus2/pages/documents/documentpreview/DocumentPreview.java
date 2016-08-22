package com.opus2.pages.documents.documentpreview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.opus2.util.Page;
import com.opus2.util.Util;

public class DocumentPreview extends Page {
	private static final String DOCUMENT_TITLE = "Day 2";
	private static final String DOUCMENT_PREVIEW = "previewImage";
	private static final String MENU_OPTION = "autocompletes";
	private static final String PAGE_SELECTOR = "page-selector";
	private static final String NEXT_BUTTON = "next-btn-div";
	private static final String PREVOIUS_BUTTON= "preview-prev-btn";
	private static final String NATIVE_DOCUMENT = "Regression Pack";
	private static final String PREVIEW_NOTES = "previewNotes";
	
	public static int Currentpage;

	
	public WebElement getDocument() {
		return this.getDocument(DOCUMENT_TITLE);
	}

	public void preview() {
		getDocument().click();
	    this.waitForPageToLoad();
	}
	
	public String docuementPreview(){
		Util.pause(2);
		return this.getElementByClass(DOUCMENT_PREVIEW).getCssValue("display");
	}

	public void selectPage(int i) {
		WebElement topLevel = this.getElementByClass(MENU_OPTION)
			.findElements(By.tagName("div")).get(0);
		topLevel.findElements(By.tagName("div")).get(i-(1)).click();
	    this.waitForPageToLoad();
	}
	
	public String selectedPage() {
		Util.pause(1);
		return this.getElementByClass(PAGE_SELECTOR).findElements(By.tagName("input"))
			.get(0).getAttribute("value");
	}

	public WebElement pageUpArrow() {
		return this.getElementByClass(NEXT_BUTTON);
	}
	
	public void previewNext() {
		Currentpage = Integer.parseInt(selectedPage());
		pageUpArrow().click();
	}
	
	public String currentPage() {
		return selectedPage();
	}
	
	public WebElement pageDownArrow() {
		return this.getElement(PREVOIUS_BUTTON);
	}
	
	public void previewPrevious() {
		Currentpage = Integer.parseInt(selectedPage());
		pageDownArrow().click();
	}
	
	public WebElement getNativeDocument() {
		return this.getDocument(NATIVE_DOCUMENT);
	}
	
	public void nativeDocument() {
		getNativeDocument().click();;
	}

	public void documentPreview() {
		this.getElementByClass(PREVIEW_NOTES).click();
		switchToCurrentWindow();
	}

	private void switchToCurrentWindow() {
		for(String currentHandle : getDriver().getWindowHandles()){
			getDriver().switchTo().window(currentHandle);
		}
	}
}
