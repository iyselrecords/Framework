package com.opus2.magnum.home.managenewuserandworkspace;
import static org.assertj.core.api.Assertions.assertThat;
import net.thucydides.core.annotations.Steps;

import org.jbehave.core.annotations.*;

import com.opus2.core.Configuration;
public class NavigateToManageNewUserAndWorkspaceHomePage{
	@Steps
	AdminUserSteps user;
	
	@Given("that a user is present on the home page")
	public void givenThatTheUserIsPresentOnTheHomePage(){
		assertThat(user.currentUrl().equals(Configuration.homeUrl)).isTrue();
	}
	
	@Given("System_Admin button is visible")
	public void givenSystemAdminButtonIsVisible(){
		assertThat(user.systemAdminButton().isDisplayed()).isTrue();
	}
	
	@When("the user clicks System_Admin button")
	public void whenTheUserClicksSystem_AdminButton(){
		user.goToAdminUser();	
	}
	
	@Then("the user must be navigated to Admin_User page on a new tab")
	public void thenTheUserMustBeNavigatedToManageUsersAndWorkspacesPageOnANewTab(){
		assertThat(user.currentUrl().equals(Configuration.adminUsersUrl)).isTrue();
	}
}