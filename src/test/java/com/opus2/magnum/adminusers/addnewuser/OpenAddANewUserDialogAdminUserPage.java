package com.opus2.magnum.adminusers.addnewuser;

import static org.assertj.core.api.Assertions.*;
import net.thucydides.core.annotations.Steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import com.opus2.core.Configuration;
import com.opus2.magnum.adminusers.AdminUserSteps;

public class OpenAddANewUserDialogAdminUserPage {
	@Steps
	AdminUserSteps user;
	
	@Given("that a user is present on the Admin_User page")
	public void givenThatAUserIsPresentOnTheAdmin_UserPage(){
		assertThat(user.currentUrl().equals(Configuration.adminUsersUrl)).isTrue();
	}
	
	@Given("Add_A_New_User button is visible")	
	public void givenAdd_A_New_UserButtonIsVisible(){
		assertThat(user.addNewUserButton().isDisplayed()).isTrue();
	}
	
	@When("the user clicks Add_A_New_User button")	
	public void whenTheUserClicksAdd_A_New_UserButton(){
		user.addNewUser();
	}
	
	@Then("Add_A_New_User dialog must be visible")	
	public void thenAdd_A_New_UserDialogMustBeVisible(){
		assertThat(user.dialog().equals("block")).isTrue();
	}
}
