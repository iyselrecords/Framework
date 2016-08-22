package com.opus2.magnum.documents.documentPreview;
import net.thucydides.core.annotations.Steps;
import static org.assertj.core.api.Assertions.*;

import org.jbehave.core.annotations.*;

import com.opus2.pages.documents.documentpreview.DocumentPreview;
public class NavigatePageUpDocumentPreviewDocumentsPage{
	@Steps
	DocumentPreviewSteps page;
	
	@Given("the Page_Up_Arrow is visible on the Document_Preview")
	public void givenThePage_Up_ArrowIsVisibleOnTheDocument_Preview(){
		assertThat(page.pageUpArrow().isDisplayed()).isTrue();
	}
	
	@When("the user clicks the Page_Up_Arrow on the Document_Preview")
	public void whenTheUserClicksThePage_Up_ArrowOnTheDocument_Preview(){
		page.previewNext();
	}
	
	@Then("the Document_Preview must navigate up one page")
	public void thenTheDocument_PreviewMustNavigateUpOnePage(){
		assertThat(page.currentPage().equals(Integer.toString((DocumentPreview.Currentpage + 1)))).isTrue(); 
	}
}