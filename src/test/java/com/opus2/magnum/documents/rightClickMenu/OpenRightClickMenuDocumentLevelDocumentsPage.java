package com.opus2.magnum.documents.rightClickMenu;
import net.thucydides.core.annotations.Steps;
import static org.assertj.core.api.Assertions.*;

import org.jbehave.core.annotations.*;
public class OpenRightClickMenuDocumentLevelDocumentsPage{
	@Steps
	RightClickMenuSteps rckm;
	
	@Given("there is at least one Document in the Document_Index")
	public void givenThereIsAtLeastOneDocumentInTheDocument_Index(){
		assertThat(rckm.document().isDisplayed()).isTrue();
	}
	
	@When("the user right clicks the Document")
	public void whenTheUserRightClicksTheDocument(){
		rckm.rightClickDocument();
	}
	
	@Then("the Right_Click_Menu must open at document level")
	public void thenTheRight_Click_MenuMustOpenAtDocumentLevel(){
		assertThat(rckm.rightClickMenu().isDisplayed()).isTrue();
	}
}