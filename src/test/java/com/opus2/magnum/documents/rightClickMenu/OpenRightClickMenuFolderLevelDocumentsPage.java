package com.opus2.magnum.documents.rightClickMenu;
import net.thucydides.core.annotations.Steps;
import static org.assertj.core.api.Assertions.*;

import org.jbehave.core.annotations.*;
public class OpenRightClickMenuFolderLevelDocumentsPage{
	@Steps
	RightClickMenuSteps user;
	
	@Given("there is at least one Folder in the Document_Index")
	public void givenThereIsAtLeastOneFolderInTheDocument_Index(){
		assertThat(user.getFolder().isDisplayed()).isTrue();
	}
	
	@When("the user right clicks the Folder")
	public void whenTheUserRightClicksTheFolder(){
		user.rightclickFolder();
	}
	
	@Then("the Right_Click_Menu must open at folder level")
	public void thenTheRight_Click_MenuMustOpenAtFolderLevel(){
		assertThat(user.menu().equals("block")).isTrue();
	}
}