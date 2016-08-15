package com.opus2.magnum.documents.destinationFolder;
import net.thucydides.core.annotations.Steps;
import static org.assertj.core.api.Assertions.*;

import org.jbehave.core.annotations.*;
public class CloseDestinationFolderDialogViaCancelButtonDocumentsPage{
	@Steps
	DestinationFolderSteps destFol;

	@Given("the Cancel_Button is visible on the Destination_Folder_Dialog")
	public void givenTheCancel_ButtonIsVisibleOnTheDestination_Folder_Dialog(){
		assertThat(destFol.cancelButton().isDisplayed()).isTrue();
	}
	
	@When("the user clicks the Cancel_Button on the Destination_Folder_Dialog")	
	public void whenTheUserClicksTheCancel_ButtonOnTheDestination_Folder_Dialog(){
		destFol.closeDialog();
	}
	
	@Then("the Destination_Folder_Dialog must close via the Cancel_Button")
	public void thenTheDestination_Folder_DialogMustCloseViaTheCancel_Button(){
		assertThat(destFol.notVisible().equals("none")).isTrue();
	}
}