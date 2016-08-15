package com.opus2.magnum.documents.destinationFolder;
import net.thucydides.core.annotations.Steps;
import static org.assertj.core.api.Assertions.*;

import org.jbehave.core.annotations.*;
public class CloseDestinationFolderDialogViaCancelButtonDocumentsPage{
	@Steps
	DestinationFolderSteps action;

	@Given("the Cancel_Button is visible on the Destination_Folder_Dialog")
	public void givenTheCancel_ButtonIsVisibleOnTheDestination_Folder_Dialog(){
		 assertThat(action.assertDIP().equals("TDIP")).isTrue();
	}
	
	@When("the user clicks the Cancel_Button on the Destination_Folder_Dialog")	
	public void whenTheUserClicksTheCancel_ButtonOnTheDestination_Folder_Dialog(){
		  assertThat(action.assertDIP().equals("TDIP")).isTrue();
	}
	
	@Then("the Destination_Folder_Dialog must close via the Cancel_Button")
	public void thenTheDestination_Folder_DialogMustCloseViaTheCancel_Button(){
		 assertThat(action.assertDIP().equals("TDIP")).isTrue();
	}
}