package com.opus2.magnum.adminworkspaces.tools;
import static org.assertj.core.api.Assertions.assertThat;
import net.thucydides.core.annotations.Steps;

import org.jbehave.core.annotations.*;

import com.opus2.core.Configuration;
import com.opus2.enums.Role;
public class AdminDeletesWorkspaceAdminWorkspacePage{
	@Steps
	AdminWorkspaceToolsSteps user;
	
	@Given("Delete Dialog is open")	
	public void givenDeleteDialogIsOpen(){
		assertThat(user.dialog().equals("block")).isTrue();
	}
	
	@Given("Password_Input box is visible")
	public void givenPassword_InputBoxIsVisible(){
		assertThat(user.input().isDisplayed()).isTrue(); 
	}
	
	@Given("user has Admin_Capabilities")
	public void givenUserHasAdmin_Capabilities(){
		 assertThat(Configuration.getSelectedUser().getRole().equals(Role.SUPERADMIN)).isTrue();
	}

	@When("user inputs password")	
	public void whenUserInputsPassword(){
		user.inputPassword();
	}

	@When("clicks Delete_Button")	
	public void whenClicksDelete_Button(){
		 user.deleteWorkspace();
	}
	
	@Then("Selected_Workspace is deleted from Workspaces_List")
	public void thenSelected_WorkspaceIsDeletedFromWorkspaces_List(){
		assertThat(user.assertDIP().equals("TDIP")).isTrue();
	}
	
}