package com.opus2.magnum.navigate;
import net.thucydides.core.annotations.Steps;

import org.jbehave.core.annotations.*;
import static org.assertj.core.api.Assertions.*;

import com.opus2.core.Configuration;
import com.opus2.magnum.steps.login.HomeSteps;
import com.opus2.util.Util;
public class NavigateToAdminPageViaAdminTab{
	@Steps
	HomeSteps home;
	
	@Given("the user is not present on the Admin_Page")
	public void givenTheUserIsNotPresentOnTheAdmin_Page(){
		String currentUrl = Util.getDriver().getCurrentUrl();
		assertThat(Configuration.adminUrl.equals(currentUrl)).isFalse();
	}
	
	@Given("the Admin_Tab is visible")
	public void givenTheAdmin_TabIsVisible(){
		assertThat(home.tabIsVisible("magnumAdmin").isDisplayed()).isTrue();
	}
	
	@When("the user clicks the Admin_Tab")
	public void whenTheUserClicksTheAdmin_Tab(){
		home.adminTab();
	}
	
	@Then("they must be navgated to the Admin_Page")
	public void thenTheyMustBeNavgatedToTheAdmin_Page(){
		String currentUrl = Util.getDriver().getCurrentUrl();
		String wsid = Configuration.getSelectedUser().getWorkspace();
		String page = Configuration.adminUrl + "?ws="+ wsid +"#overview";
		assertThat(page.equals(currentUrl)).isTrue();
	}
}