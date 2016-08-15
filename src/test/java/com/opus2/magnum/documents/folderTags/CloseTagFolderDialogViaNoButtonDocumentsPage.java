package com.opus2.magnum.documents.folderTags;
import net.thucydides.core.annotations.Steps;
import static org.assertj.core.api.Assertions.*;

import org.jbehave.core.annotations.*;
public class CloseTagFolderDialogViaNoButtonDocumentsPage{
	@Steps 
	TagFolderSteps tagFolder;
		
	@Given("the No_Button is visible on the Tag_Folder_Dialog")
	public void givenTheNo_ButtonIsVisibleOnTheTag_Folder_Dialog(){
		assertThat(tagFolder.noButton().isDisplayed()).isTrue();
	}
	@When("the user clicks the No_Button on the Tag_Folder_Dialog")
	public void whenTheUserClicksTheNo_ButtonOnTheTag_Folder_Dialog(){
		tagFolder.closeDialog();
	}
	@Then("the Tag_Folder_Dialog must close via the No_Button")
	public void thenTheTag_Folder_DialogMustCloseViaTheNo_Button() {
		assertThat(tagFolder.notVisible().equals("none")).isTrue();
	}
}