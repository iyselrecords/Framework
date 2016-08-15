package com.opus2.magnum.documents.rightClickMenu;
import net.thucydides.core.annotations.Steps;
import static org.assertj.core.api.Assertions.*;

import org.jbehave.core.annotations.*;
public class OpenRightClickMenuFolderLevelDocumentsPage{
	@Steps
	RightClickMenuSteps rckm;
	
	@Given("there is at least one Folder in the Document_Index")
	public void givenThereIsAtLeastOneFolderInTheDocument_Index(){
		assertThat(rckm.folder().isDisplayed()).isTrue();
	}
	
	@When("the user right clicks the Folder")
	public void whenTheUserRightClicksTheFolder(){
		rckm.rightClickFolder();
	}
	
	@Then("the Right_Click_Menu must open at folder level")
	public void thenTheRight_Click_MenuMustOpenAtFolderLevel(){
		assertThat(rckm.rightClickMenu().isDisplayed()).isTrue();
	}
}