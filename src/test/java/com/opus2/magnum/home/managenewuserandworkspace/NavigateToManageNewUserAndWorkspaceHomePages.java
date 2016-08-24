package com.opus2.magnum.home.managenewuserandworkspace;
import static org.assertj.core.api.Assertions.assertThat;
import net.thucydides.core.annotations.Steps;

import org.jbehave.core.annotations.*;

import com.opus2.util.AssertDummy;
public class NavigateToManageNewUserAndWorkspaceHomePages{
	@Steps
	AssertDummy action;
	
	@Given("the Cancel_Button is visible on the Start_A_New_Workspace_Dialog")
	public void givenTheCancel_ButtonIsVisibleOnTheStart_A_New_Workspace_Dialog(){
		assertThat(action.assertDIP().equals("TDIP")).isTrue();
	}

	@When("the user clicks the Cancel_Button on the Start_A_New_Workspace_Dialog")
	public void whenTheUserClicksTheCancel_ButtonOnTheStart_A_New_Workspace_Dialog(){
		assertThat(action.assertDIP().equals("TDIP")).isTrue();
	}
	
	@Then("the Start_A_New_Workspace_Dialog must close via the Cancel_Button")
	public void thenTheStart_A_New_Workspace_DialogMustCloseViaTheCancel_Button(){
		assertThat(action.assertDIP().equals("TDIP")).isTrue();
	}
}