package com.opus2.magnum.documents.pageNumberSelectionDocumentPreview;
import static org.assertj.core.api.Assertions.assertThat;
import net.thucydides.core.annotations.Steps;

import org.jbehave.core.annotations.*;
public class ClosePageNumberSelectionDropdownDocumentsPage{
	@Steps
	PageNumberSelectionSteps page;
	
	@Given("the Page_Number_Dropdown_Menu is open on the Document_Preview")
	public void givenThePage_Number_Dropdown_MenuIsOpenOnTheDocument_Preview(){
		assertThat(page.dropdownOption().equals("block")).isTrue();
	}
	
	@When("the user clicks the Page_Number_Dropdown_Arrow whilst the Page_Number_Dropdown_Menu is open")	
    public void theUserClicksThePage_Number_Dropdown_ArrowWhilstThePage_Number_Dropdown_MenuIsOpen(){
		page.closeDropdown();  	 
	}
	
	@Then("the Page_Number_Dropdown_Menu must close")
	public void thenThePage_Number_Dropdown_MenuMustClose(){
		page.dropdownMenu();   
	}
}