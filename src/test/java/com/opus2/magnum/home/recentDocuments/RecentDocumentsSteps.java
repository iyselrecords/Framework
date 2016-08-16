package com.opus2.magnum.home.recentDocuments;

import org.openqa.selenium.WebElement;

import com.opus2.pages.home.recentdocuments.RecentDocuments;
import net.thucydides.core.annotations.Step;

public class RecentDocumentsSteps {	
	RecentDocuments renDocs;
	
	@Step()
	public WebElement recDocSection() {
		return renDocs.recDocSection();
	}
	
	@Step
	public WebElement docHasLoaded() {
		return renDocs.docHasLoaded();
	}
	
	@Step
	public WebElement targetDocument(){
		return renDocs.targetDocument();
	}
	
	@Step
	public WebElement targetTranscript() {
		return renDocs.targetTranscript();
	}
	
	@Step("click to preview document")
	public void previewDocument() {
		renDocs.previewDocument();
	}
	
	@Step()
	public WebElement previewDialog() {
		return renDocs.previewDialog();
	}
	
	@Step()
	public String previewDialogTitle() {
		return renDocs.previewDialogTitle();
	}	
}

