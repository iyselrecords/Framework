package com.opus2.magnum.documents.documentPreview;
import net.thucydides.core.annotations.Steps;
import static org.assertj.core.api.Assertions.*;

import org.jbehave.core.annotations.*;

import com.opus2.pages.documents.documentpreview.PageNumberSelection;
public class SelectPageViaPageNumberDropdownDocumentPreviewDocumentsPage{
	@Steps
	DocumentPreviewSteps preview;
	PageNumberSelection page;
	
	@Given("the Page_Number_Option is visible on the Page_Number_Dropdown_Menu")
    public void givenThePage_Number_OptionIsVisibleOnThePage_Number_Dropdown_Menu(){
		assertThat(page.dropdownOption().equals("block")).isTrue(); 
    }
	
	@When("the user clicks the Page_Number_Option on the Page_Number_Dropdown_Menu")
	public void whenTheUserClicksThePage_Number_OptionOnThePage_Number_Dropdown_Menu(){
		preview.selectPage(3);
		
	}
	
	@Then("the Document_Preview must navigate to the selected page")
	public void thenTheDocument_PreviewMustNavigateToTheSelectedPage(){
		assertThat(preview.selectedPage().equals("3")).isTrue();
	}
}