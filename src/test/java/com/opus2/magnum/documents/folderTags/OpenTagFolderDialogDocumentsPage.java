package com.opus2.magnum.documents.folderTags;
import net.thucydides.core.annotations.Steps;
import static org.assertj.core.api.Assertions.*;

import org.jbehave.core.annotations.*;
public class OpenTagFolderDialogDocumentsPage{
	@Steps 
	TagFolderSteps tagFolder;
	
	@Given("the Tag_Folder_Option is visible in the Right_Click_Menu")	
	public void givenTheTag_Folder_OptionIsVisibleInTheRight_Click_Menu(){
		assertThat(tagFolder.option().isDisplayed()).isTrue();
	}
	
	@When("the user clicks the Tag_Folder_Option")	
	public void whenTheUserClicksTheTag_Folder_Option(){
		tagFolder.tagFolderOption();
	}
	
	@Then("the Tag_Folder_Dialog must open")	
	public void thenTheTag_Folder_DialogMustOpen(){
		assertThat(tagFolder.dialog().equals("block")).isTrue();
	}
}