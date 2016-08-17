package com.opus2.magnum.documents.rightClickMenu;
import net.thucydides.core.annotations.Steps;
import static org.assertj.core.api.Assertions.*;

import org.jbehave.core.annotations.*;
public class OpenRightClickMenuDocumentLevelDocumentsPage{
	@Steps
	RightClickMenuSteps user;
	
	@Given("there is at least one Document in the Document_Index")
	public void givenThereIsAtLeastOneDocumentInTheDocument_Index(){
		assertThat(user.getDocument().isDisplayed()).isTrue();
	}
	
	@When("the user right clicks the Document")
	public void whenTheUserRightClicksTheDocument(){
		user.rightclickDocument();
	}
	
	@Then("the Right_Click_Menu must open at document level")
	public void thenTheRight_Click_MenuMustOpenAtDocumentLevel(){
		assertThat(user.menu().equals("block")).isTrue();
	}
}