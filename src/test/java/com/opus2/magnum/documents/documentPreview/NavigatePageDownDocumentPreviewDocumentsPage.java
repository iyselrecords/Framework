package com.opus2.magnum.documents.documentPreview;
import net.thucydides.core.annotations.Steps;
import static org.assertj.core.api.Assertions.*;

import org.jbehave.core.annotations.*;

import com.opus2.pages.documents.documentpreview.DocumentPreview;
public class NavigatePageDownDocumentPreviewDocumentsPage{
	@Steps
	DocumentPreviewSteps page;

	@Given("the Page_Down_Arrow is visible on the Document_Preview")
	public void givenThePage_Down_ArrowIsVisibleOnTheDocument_Preview(){
		assertThat(page.pageDownArrow().isDisplayed()).isTrue();
	}
	
	@When("the user clicks the Page_Down_Arrow on the Document_Preview")
    public void whenTheUserClicksThePage_Down_ArrowOnTheDocument_Preview(){
		page.previewPrevious();
    }
	
	@Then("the Document_Preview must navigate down one page")
	public void thenTheDocument_PreviewMustNavigateDownOnePage(){
		assertThat(page.currentPage().equals(Integer.toString((DocumentPreview.Currentpage - 1)))).isTrue(); 
	}
}