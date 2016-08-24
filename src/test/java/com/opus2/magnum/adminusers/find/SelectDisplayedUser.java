package com.opus2.magnum.adminusers.find;
import static org.assertj.core.api.Assertions.assertThat;
import net.thucydides.core.annotations.Steps;

import org.jbehave.core.annotations.*;
public class SelectDisplayedUser{
	@Steps
	FindUserSteps user;
	
	@Given("Filtered_User is visible")
	public void givenFiltered_UserIsVisible(){
		assertThat(user.filteredUser().isDisplayed()).isTrue();
	}
	
	@When("the user clicks displayed checkbox button")
	public void whenTheUserClicksTheCheckboxButton(){
		user.selectUser();
	}
	
	@Then("User is selected")
	public void thenUserIsSelected(){
		assertThat(user.userChecked().isSelected()).isTrue();
	}
}