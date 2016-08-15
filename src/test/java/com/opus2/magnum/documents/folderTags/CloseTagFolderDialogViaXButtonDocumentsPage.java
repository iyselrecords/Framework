package com.opus2.magnum.documents.folderTags;
import net.thucydides.core.annotations.Steps;
import static org.assertj.core.api.Assertions.*;

import org.jbehave.core.annotations.*;
public class CloseTagFolderDialogViaXButtonDocumentsPage{
	@Steps 
	TagFolderSteps tagFolder;
		
	@Given("the X_Button is visible on the Tag_Folder_Dialog")
	public void givenTheX_ButtonIsVisibleOnTheTag_Folder_Dialog(){
		assertThat(tagFolder.xButton().isDisplayed()).isTrue();
	}
	@When("the user clicks the X_Button on the Tag_Folder_Dialog")
	public void whenTheUserclicksTheX_ButtonOnTheTag_Folder_Dialog() {
		tagFolder.closeByXButton();
	 }
	@Then("the Tag_Folder_Dialog must close via the X_Button")
	public void thenTheTag_Folder_DialogMustCloseViaTheX_Button(){
		assertThat(tagFolder.notVisible().equals("none")).isTrue();
	}
}