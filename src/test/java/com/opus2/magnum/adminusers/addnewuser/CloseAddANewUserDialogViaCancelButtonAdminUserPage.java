package com.opus2.magnum.adminusers.addnewuser;
import net.thucydides.core.annotations.Steps;
import static org.assertj.core.api.Assertions.*;

import org.jbehave.core.annotations.*;

import com.opus2.magnum.adminusers.AdminUserSteps;
public class CloseAddANewUserDialogViaCancelButtonAdminUserPage{
	@Steps
	AdminUserSteps user;
	
	@Given("the Cancel_Button is visible on the Add_A_New_User_Dialog")
	public void givenTheCancel_ButtonIsVisibleOnTheAdd_A_New_User_Dialog(){
		assertThat(user.cancelButton().isDisplayed()).isTrue();  
	}
	
	@When("the user clicks the Cancel_Button on the Add_A_New_User_Dialog")	
	public void whenTheUserClicksTheCancel_ButtonOnTheAdd_A_New_User_Dialog(){
		user.closeDialog();
	}
	
	@Then("the Add_A_New_User_Dialog must close via the Cancel_Button")	
	public void thenTheAdd_A_New_User_DialogMustCloseViaTheCancel_Button(){
		assertThat(user.notVisible().equals("none")).isTrue();
	}
}