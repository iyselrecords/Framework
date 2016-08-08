package com.opus2.magnum.navigate;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.opus2.util.Util;

import net.thucydides.core.annotations.Step;

public class RecentDocumentsSteps {
	@Step
	public String assertDIP() {
		String test = "TestDesignInProgress";
		return test;
	}
	
	@Step
	public WebElement recentDocumentHeader() {
		return Util.header("recent-docs-container");
	}
	
	@Step
	public WebElement loadedDocuments() {
		WebElement recentDocs = Util.getDriver().findElement(By.id("recentDocs"))
			.findElements(By.className("docitem")).get(0);	
		return recentDocs;
	}
	
	@Step
	public WebElement documentIsVisible() {
		return getFile("RecentTestDoc");
	}
	
	@Step
	public WebElement documentIsVisible(String doc) {
		return getFile("RecentTestDoc");
	}
	@Step
	public WebElement transcriptIsVisible () {
		return getFile("TestTranscript");
	}
	
	@Step
	public WebElement getFile(String docName) {
		WebElement file = null;	
		List <WebElement> lists = Util.getDriver().findElement(By.id("recentDocs"))
			.findElements(By.tagName("span"));
		for(WebElement list : lists){
			if(list.getText().equals(docName)){
				file = list;
			}
		}
		return file;
	}

	public void clickDocument(String document) {
		getFile(document).click();
	}

	public WebElement previewDialog() {
		Util.pause(2);
		return Util.header("doc-preview");
	}
	
	public WebElement previewDialogVisible() {
		return Util.getDriver().findElement(By.id("doc-preview"));
	}
}

