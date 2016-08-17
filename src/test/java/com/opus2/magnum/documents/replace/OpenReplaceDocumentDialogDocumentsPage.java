package com.opus2.magnum.documents.replace;
import net.thucydides.core.annotations.Steps;
import static org.assertj.core.api.Assertions.*;

import org.jbehave.core.annotations.*;

public class OpenReplaceDocumentDialogDocumentsPage{
	@Steps
	ReplaceSteps replace;
		
	@Given("the Replace_Option is visible in the Right_Click_Menu")
	public void givenTheReplace_OptionIsVisibleInTheRight_Click_Menu(){
		assertThat(replace.option().isDisplayed()).isTrue();
	}
	
	@When("the user clicks the Replace_Option")
	public void whenTheUserClicksTheReplace_Option(){
		replace.replaceOption();
	}
	
	@Then("the Replace_Document_Dialog must open")
	public void thenTheReplace_Document_DialogMustOpen(){
		assertThat(replace.dialog().equals("block")).isTrue();
	}
}