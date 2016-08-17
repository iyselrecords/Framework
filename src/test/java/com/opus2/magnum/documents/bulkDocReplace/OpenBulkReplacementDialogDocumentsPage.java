package com.opus2.magnum.documents.bulkDocReplace;
import net.thucydides.core.annotations.Steps;
import static org.assertj.core.api.Assertions.*;

import org.jbehave.core.annotations.*;
public class OpenBulkReplacementDialogDocumentsPage{
	@Steps
	BulkReplaceSteps bulkReplace;
	
	@Given("the Bulk_Doc_Replace_Option is visible in the Right_Click_Menu")	
	public void givenTheBulk_Doc_Replace_OptionIsVisibleInTheRight_Click_Menu(){
		assertThat(bulkReplace.option().isDisplayed()).isTrue();  
	}
	
	@When("the user clicks the Bulk_Doc_Replace_Option")	
	public void whenTheUserClicksTheBulk_Doc_Replace_Option(){
		bulkReplace.bulkReplaceOption();
	}
	
	@Then("the Bulk_Doc_Replace_Dialog must open")	
	public void thenTheBulk_Doc_Replace_DialogMustOpen(){
		assertThat(bulkReplace.dialog().equals("block")).isTrue();
	}
}