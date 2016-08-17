package com.opus2.magnum.home.newWorkspaceDialog;
import net.thucydides.core.annotations.Steps;

import org.jbehave.core.annotations.*;
import static org.assertj.core.api.Assertions.*;

import com.opus2.enums.Role;
public class OpenStartANewWorkSpaceDialogHomePage{
	@Steps	 
	NewWorkspaceSteps nwks;
	
	@Given("the user has Admin_Capabilities")
	public void givenTheUserHasAdmin_Capabilities(){
		assertThat(nwks.userRole().equals(Role.SUPERADMIN)).isTrue();
	}
	
	@Given("the New_Workspace_Button is visible on the Home_Page")
	public void givenTheNew_Workspace_ButtonIsVisibleOnTheHomePage(){
		assertThat(nwks.newWorkspaceButton().isDisplayed()).isTrue();  
	}
	
	@When("the user clicks the New_Workspace_Button")
	public void whenTheUserClicksTheNew_Workspace_Button(){
		nwks.newWorkspaceBtn();
	}
	
	@Then("the Start_A_New_Workspace_Dialog must open")
	public void thenTheStart_A_New_Workspace_DialogMustOpen(){
		assertThat(nwks.dialog().equals("block")).isTrue();
	}
}