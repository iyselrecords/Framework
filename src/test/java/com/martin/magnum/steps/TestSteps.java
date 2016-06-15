package com.martin.magnum.steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;






import com.martin.pages.Login;

import net.serenitybdd.jbehave.SerenityStories;

public class TestSteps extends SerenityStories {
	Login loginpage;
	
	@When("user enter '<username>' and '<password>'")
	public void whenUserEnterusernameAndpassword(@Named("username") String user, @Named("password") String pass){
		loginpage.loginAs(user);
		loginpage.withPassword(pass);
	}
	@Given("the user is on login page")
	public void givenTheUserIsOnLoginPage(){
		loginpage.initialize();
	}
	@When("login")
	public void whenLogin(){
		System.out.println("login'");
	}
	@Then("user is logged in")
	public void thenUserIsLoggedIn(){
		System.out.println("user is logged in'");
	}
}
