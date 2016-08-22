package com.opus2.magnum.documents.documentPreview;

import org.openqa.selenium.WebElement;

import com.opus2.pages.documents.documentpreview.DocumentPreview;

import net.thucydides.core.annotations.Step;

public class DocumentPreviewSteps {
	DocumentPreview preview;
	
	@Step("document is visible")
	public WebElement getDocument() {
		return preview.getDocument();
	}
	
	@Step("preview document")
	public void preview() {
		preview.preview();
	}
	
	@Step("document preview is visible")
	public String docuementPreview(){
		return preview.docuementPreview();
	}
	
	@Step("select page to preview")
	public void selectPage(int i) {
		preview.selectPage(i);
	}
	
	@Step("selected page to preview")
	public String selectedPage() {
		return preview.selectedPage();
	}
	
	@Step("page up arrow is visible")
	public WebElement pageUpArrow(){
		return preview.pageUpArrow();
	}
	
	@Step("select page to preview")
	public void previewNext() {
		preview.previewNext();
	}
	
	@Step("selected page to preview")
	public String currentPage() {
		return preview.currentPage();
	}
	
	@Step("page up arrow is visible")
	public WebElement pageDownArrow(){
		return preview.pageDownArrow();
	}
	
	@Step("select page to preview")
	public void previewPrevious() {
		preview.previewPrevious();
	}
	
	@Step("native document is visible")
	public WebElement getNativeDocument() {
		return preview.getNativeDocument();
	}
	
	@Step("click to preview nativ document")
	public void nativeDocument() {
		preview.nativeDocument();
	}
	
	@Step("preview document in document viewer")
	public void documentPreview() {
		preview.documentPreview();
	}
	
	@Step("testing assertion with dummy data")
	public String assertDIP(){
		return "TDIP";
	}	
}
