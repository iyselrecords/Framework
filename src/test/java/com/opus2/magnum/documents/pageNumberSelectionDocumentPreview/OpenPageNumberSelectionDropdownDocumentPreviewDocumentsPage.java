package com.opus2.magnum.documents.pageNumberSelectionDocumentPreview;
import static org.assertj.core.api.Assertions.assertThat;
import net.thucydides.core.annotations.Steps;

import org.jbehave.core.annotations.*;
public class OpenPageNumberSelectionDropdownDocumentPreviewDocumentsPage{
	@Steps
	PageNumberSelectionSteps page;	
	
	@Given("the Page_Number_Dropdown_Arrow is visible on the Document_Preview")
	public void givenThePage_Number_Dropdown_ArrowIsVisibleOnTheDocument_Preview(){
		assertThat(page.arrowButton().isDisplayed()).isTrue(); 	
	}
	
	@When("the user clicks the Page_Number_Dropdown_Arrow whilst the Page_Number_Dropdown_Menu is closed")
	public void whenTheUserClicksThePage_Number_Dropdown_ArrowWhilstThePage_Number_Dropdown_MenuIsClosed(){
		page.openDropdown();
	}
	
	@Then("the Page_Number_Dropdown_Menu must open")
	public void thenThePage_Number_Dropdown_MenuMustOpen(){
		assertThat(page.dropdownOption().equals("block")).isTrue();  
	}
}