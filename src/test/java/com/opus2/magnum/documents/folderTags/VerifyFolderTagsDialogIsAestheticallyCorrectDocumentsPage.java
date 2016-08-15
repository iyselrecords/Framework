package com.opus2.magnum.documents.folderTags;
import net.thucydides.core.annotations.Steps;
import static org.assertj.core.api.Assertions.*;

import org.jbehave.core.annotations.*;
public class VerifyFolderTagsDialogIsAestheticallyCorrectDocumentsPage{
	@Steps 
	TagFolderSteps tagFolder;
	
	@Given("the Tag_Folder_Dialog is open on the Documents_Page")
	public void givenTheTag_Folder_DialogIsOpenOnTheDocuments_Page(){
		assertThat(tagFolder.assertDIP().equals("TDIP")).isTrue();
	}
	
	@When("the user is viewing the Tag_Folder_Dialog")
    public void whenTheUserIsViewingTheTag_Folder_Dialog(){
		assertThat(tagFolder.assertDIP().equals("TDIP")).isTrue();
    }
	
	@Then("the Tag_Folder_Dialog must be Aesthetically consistent with other dialogs across the platform")
	public void thenTheTag_Folder_DialogMustBeAestheticallyConsistentWithOtherDialogsAcrossThePlatform(){
		assertThat(tagFolder.assertDIP().equals("TDIP")).isTrue();
	}
	
	@Then("each of the Buttons, Fields, Icons and Element_Names must be correct on the Tag_Folder_Dialog")
	public void thenEachOfTheButtonsFieldsIconsAndElementNamesMustBeCorrectOnTheTag_Folder_Dialog(){
		assertThat(tagFolder.assertDIP().equals("TDIP")).isTrue();
	}
}