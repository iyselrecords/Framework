package com.opus2.magnum.adminusers.addnewuser;
import net.thucydides.core.annotations.Steps;
import static org.assertj.core.api.Assertions.*;

import org.jbehave.core.annotations.*;

import com.opus2.magnum.adminusers.AdminUserSteps;
public class CloseAddANewUserDialogViaXButtonAdminUserPage{
	@Steps
	AdminUserSteps user;
	
	@Given("the X_Button is visible on the Add_A_New_User_Dialog")	
	public void givenTheX_ButtonIsVisibleOnTheAdd_A_New_User_Dialog(){
		assertThat(user.xButton().isDisplayed()).isTrue();
	}
	
	@When("the user clicks the X_Button on the Add_A_New_User_Dialog")	
	public void whenTheUserClicksTheX_ButtonOnTheAdd_A_New_User_Dialog(){
		user.closeByXButton();
	}
	
	@Then("the Add_A_New_User_Dialog must close via the X_Button")	
	public void thenTheAdd_A_New_User_DialogMustCloseViaTheX_Button(){
		assertThat(user.notVisible().equals("none")).isTrue();
	}
}