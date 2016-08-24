package com.opus2.magnum.adminusers.find;
import net.thucydides.core.annotations.Steps;
import static org.assertj.core.api.Assertions.*;

import org.jbehave.core.annotations.*;
public class SelectAllUserAdminUserPage{
	@Steps
	FindUserSteps user;
	
	@Given("All_User checkbox is visible")	
	public void givenAll_UserCheckboxIsVisible(){
		assertThat(user.allCheckbox().isDisplayed()).isTrue();
	}
	
	@When("the user clicks All_User checkbox button")	
	public void whenTheUserClicksAll_UserCheckboxButton(){
		user.selectAll();
	}
	
	@Then("all users should be selected")	
	public void thenAllUsersShouldBeSelected(){
		assertThat(user.checkedAll().isSelected()).isTrue();
	}
}