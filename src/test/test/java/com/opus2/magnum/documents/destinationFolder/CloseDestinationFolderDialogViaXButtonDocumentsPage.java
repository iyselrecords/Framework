package com.opus2.magnum.documents.destinationFolder;
import net.thucydides.core.annotations.Steps;
import static org.assertj.core.api.Assertions.*;

import org.jbehave.core.annotations.*;
public class CloseDestinationFolderDialogViaXButtonDocumentsPage{
	@Steps
	DestinationFolderSteps action;

	@Given("the X_Button is visible on the Destination_Folder_Dialog")
	public void givenTheX_ButtonIsVisibleOnTheDestination_Folder_Dialog(){
		 assertThat(action.assertDIP().equals("TDIP")).isTrue();
	}
	
	@When("the user clicks the X_Button on the Destination_Folder_Dialog")
	 public void whenTheUserclicksTheX_ButtonOnTheDestination_Folder_Dialog() {
	      assertThat(action.assertDIP().equals("TDIP")).isTrue();
	}
	
	@Then("the Destination_Folder_Dialog must close via the X_Button")
	public void thenTheDestination_Folder_DialogMustCloseViaTheX_Button() {
	      assertThat(action.assertDIP().equals("TDIP")).isTrue();
	}
}