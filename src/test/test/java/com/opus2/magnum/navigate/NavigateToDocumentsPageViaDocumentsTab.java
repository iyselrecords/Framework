package com.opus2.magnum.navigate;
import net.thucydides.core.annotations.Steps;

import org.jbehave.core.annotations.*;
import static org.assertj.core.api.Assertions.*;

import com.opus2.core.Configuration;
import com.opus2.magnum.steps.login.HomeSteps;
import com.opus2.util.Util;
public class NavigateToDocumentsPageViaDocumentsTab{
	@Steps
	HomeSteps home;
	
	@Given("the user is not present on the Documents_Page")
	public void givenTheUserIsNotPresentOnTheDocuments_Page(){
		String currentUrl = Util.getDriver().getCurrentUrl();
		assertThat(Configuration.documentsUrl.equals(currentUrl)).isFalse();
	}
	
	@Given("the Documents_Tab is visible")	
	public void givenTheDocuments_TabIsVisible(){
		assertThat(home.tabIsVisible("magnumDocuments").isDisplayed()).isTrue();
	}
	
	@When("the user clicks the Documents_Tab")	
	public void whenTheUserClicksTheDocuments_Tab(){
		home.documentsTab();
	}
	
	@Then("they must be navigated to the Documents_Page")
	public void thenTheyMustBeNavigatedToTheDocuments_Page(){
		String page = Configuration.documentsUrl + "?ws="+ Configuration.getSelectedUser().getWorkspace();
		assertThat(page.equals(Util.getDriver().getCurrentUrl())).isTrue();
	}
}