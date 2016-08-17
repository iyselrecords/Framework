package com.opus2.magnum.documents.rename;
import net.thucydides.core.annotations.Steps;
import static org.assertj.core.api.Assertions.*;

import org.jbehave.core.annotations.*;
public class OpenNewNameDialogDocumentsPage{
	@Steps
	RenameSteps rename;
	
	@Given("the Rename_Option is visible in the Right_Click_Menu")	
	public void givenTheRename_OptionIsVisibleInTheRight_Click_Menu(){
		assertThat(rename.option().isDisplayed()).isTrue();
	}
	
	@When("the user clicks the Rename_Option")	
	public void whenTheUserClicksTheRename_Option(){
		rename.renameOption();
	}
	
	@Then("the New_Name_Dialog must open")	
	public void thenTheNew_Name_DialogMustOpen(){
		assertThat(rename.dialog().equals("block")).isTrue(); 
	}
}