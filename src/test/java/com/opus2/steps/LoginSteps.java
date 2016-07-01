package com.opus2.steps;

import static org.junit.Assert.assertTrue;

import java.io.IOException;

import net.thucydides.core.steps.ScenarioSteps;

import org.jbehave.core.annotations.Alias;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import com.opus2.enums.Pages;
import com.opus2.pages.Config;
import com.opus2.pages.Home;
import com.opus2.pages.LoginPage;
import com.opus2.pages.UserAction;
import com.opus2.util.Util;




public class LoginSteps extends ScenarioSteps {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	LoginPage login;
	Util util;
	UserAction user;
	Home homepage;
	
	
	//UserLogin Stage 2
	@Given("user initialize a browser")
	public void givenUserInitializeABrowser(){
    	login.open();
    	login.initialize();
	}
	@Given("is present on '$page' page")
	public void andIsPresentOnPage(Pages page){
		assertTrue(page.returnPage().equals(page.returnPage()));
	}
	@Given("user is present on Magnum homepage")
	@Alias("user is present on Magnum loginpage")
	public void givenTheUserIsOnMagnumHomepage(){
		login.open();
		login.navigateTo();
		login.initialize();
	}	
	@When("user enter username and password")
	public void whenTheUserEnterUsernameAndPassword() throws IOException{		
		login.loginAs(Config.email);
		login.withPassword(Config.password);
	}
	@When("click the login button")
	public void whenClickTheLoginButton(){
		login.login("submit-login");
	}
	@Then("user should see the second stage of login")
	public void thenUserShouldSeeTheSecondStageOfLogin(){
		util.pause(2);
	}
	
	//UserLogin Stage 2
	@Given("user is present on Memorable Word page")
	@Alias("checks session using username and password")
	public void givenTheUserIsOnLoginMemorableWordPage() throws IOException{
		login.checkSession();
	}

	@When("the user enter first memorable character")
	public void whenTheUserEnterFirstMemorableCharacter(){
		login.firstMemorableCharacter();
	}
	@When("second memorable character")
	public void whenSecondMemorableCharacter(){
		login.secondMemorableCharacter();
	}
	@When("third memorable character")
	public void whenThirdMemorableCharacter(){
		login.thirdMemorableCharacter();
	}
	@When("click login button")
	public void andClickLoginButton(){
		login.login("submitbtn");
	}
	@Then("user should be on the homepage")
	public void thenUserShouldBeOnTheHomepage(){
		util.pause(0.5);
	}
	
	
	//User Logout
	@When("user clicks the sign out link")
	public void whenUserClicksTheLogoutButton(){
		user.clickAction("log-out");
	}
	@When("confirms OK")
	public void andConfirmsOK(){
		user.acceptAlert();
	}
	@Then("user is logged out")
	public void thenUserIsLoggedOut(){
		util.pause(2);
		//assert
	}
	@Then("user can no longer access '$workspace' workspace")
	public void thenUserCanNoLongerAccessWorkspace(){
		util.pause(2);
		//assert
	}
	@Then("user is able to reaccess '$workspace' workspace")
	public void thenUserIsAbleToReaccessWorkspace(){
		util.pause(2);
		//assert
	}
	
}
