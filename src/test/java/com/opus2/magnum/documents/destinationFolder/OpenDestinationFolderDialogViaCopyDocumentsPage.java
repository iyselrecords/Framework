package com.opus2.magnum.documents.destinationFolder;
import net.thucydides.core.annotations.Steps;
import static org.assertj.core.api.Assertions.*;

import org.jbehave.core.annotations.*;
public class OpenDestinationFolderDialogViaCopyDocumentsPage{
	@Steps
	DestinationFolderSteps destFol;

	@Given("the Copy_Option is visible in the Right_Click_Menu")
	public void givenTheCopy_OptionIsVisibleInTheRight_Click_Menu(){
		assertThat(destFol.option().isDisplayed()).isTrue();
	}
	
	@When("the user clicks the Copy_Option in the Right_Click_Menu")
	public void whenTheUserClicksTheCopy_OptionInTheRight_Click_Menu(){
		destFol.copyOption();
	}
	
	@Then("the Destination_Folder_Dialog must open via the Copy_Option")
	public void thenTheDestination_Folder_DialogMustOpenViaTheCopy_Option(){
		assertThat(destFol.dialog().isDisplayed()).isTrue();
	}
}