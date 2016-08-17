package com.opus2.magnum.documents.insert;
import net.thucydides.core.annotations.Steps;
import static org.assertj.core.api.Assertions.*;

import org.jbehave.core.annotations.*;
public class OpenInsertDialogDocumentsPage{
	@Steps
	InsertDocumentSteps insert; 
	
	@Given("the Insert_Option is visible in the Right_Click_Menu")
	public void givenTheInsert_OptionIsVisibleInTheRight_Click_Menu(){
		assertThat(insert.option().isDisplayed()).isTrue();
	}
	
	@When("the user clicks the Insert_Option")
	public void whenTheUserClicksTheInsert_Option(){
		insert.insertDocumentOption();
	}
	
	@Then("the Insert_Document_Dialog must open")
	public void thenTheInsert_Document_DialogMustOpen(){
		assertThat(insert.dialog().equals("block")).isTrue();
	}
}