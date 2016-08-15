package com.opus2.magnum.documents.destinationFolder;
import net.thucydides.core.annotations.Steps;
import static org.assertj.core.api.Assertions.*;

import org.jbehave.core.annotations.*;
public class CloseDestinationFolderDialogViaXButtonDocumentsPage{
	@Steps
	DestinationFolderSteps destFol;

	@Given("the X_Button is visible on the Destination_Folder_Dialog")
	public void givenTheX_ButtonIsVisibleOnTheDestination_Folder_Dialog(){
		assertThat(destFol.xButton().isDisplayed()).isTrue();
	}
	
	@When("the user clicks the X_Button on the Destination_Folder_Dialog")
	 public void whenTheUserclicksTheX_ButtonOnTheDestination_Folder_Dialog(){
		destFol.closeByXButton();
	}
	
	@Then("the Destination_Folder_Dialog must close via the X_Button")
	public void thenTheDestination_Folder_DialogMustCloseViaTheX_Button() {
		assertThat(destFol.notVisible().equals("none")).isTrue();
	}
}