package com.opus2.magnum.adminusers.addnewuser;
import static org.assertj.core.api.Assertions.assertThat;
import net.thucydides.core.annotations.Steps;

import org.jbehave.core.annotations.*;

import com.opos2.pages.adminusers.AdminUser;
import com.opus2.magnum.adminusers.AdminUserSteps;
public class InvitesNewUserAdminUserPage{
	@Steps
	AdminUserSteps user;
	
	@Given("the Add_A_New_User dialog is open")
	public void givenTheAdd_A_New_UserDialogIsOpen(){
		assertThat(user.dialog().equals("block")).isTrue();
	}
	
	@Given("the Email_Text_Box is visible")
	public void givenTheEmail_Text_BoxIsVisible(){
		assertThat(user.emailTextBox().isDisplayed()).isTrue();
	}
	
	@When("the user input Email_Address")	
	public void whenTheUserInputEmail_Address(){
		user.inputEmail();
	}
	
	@When("clicks the Invite_Button")
	public void whenClicksTheInvite_Button(){
		 user.invite();
	}
	
	@Then("new User_Email_Address will be visible on list")	
	public void thenNewUser_Email_AddressWillBeVisibleOnList(){		 
		assertThat(user.userEmail().isDisplayed()).isTrue();
		assertThat(user.userEmail().getText().equals(AdminUser.EMAIL_ADDRESS)).isTrue();
	}
}