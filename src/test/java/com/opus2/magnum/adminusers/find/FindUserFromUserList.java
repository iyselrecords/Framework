package com.opus2.magnum.adminusers.find;
import static org.assertj.core.api.Assertions.*;
import net.thucydides.core.annotations.Steps;

import org.jbehave.core.annotations.*;
public class FindUserFromUserList{
	@Steps
	FindUserSteps user;
		
	@Given("the Find_Input box is visible")	
	public void givenTheFind_InputBoxIsVisible(){
		assertThat(user.findInput().isDisplayed()).isTrue();
	}
	
	@Given("User is listed in User_List")
	public void givenUserIsListedInUser_List(){
		assertThat(user.userEmail().isDisplayed()).isTrue();  
	}
	
	@When("the user enters User_Email")	
	public void whenTheUserEntersUser_Email(){
		user.findUser(); 
	}
	
	@Then("User_Email is visible")
	public void thenUser_EmailIsVisible(){
		assertThat(user.filteredUser().isDisplayed()).isTrue();
	}
}