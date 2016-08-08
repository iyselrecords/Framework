package com.opus2.magnum.navigate;
import net.thucydides.core.annotations.Steps;

import org.jbehave.core.annotations.*;
import org.openqa.selenium.WebElement;

import static org.assertj.core.api.Assertions.*;

import com.opus2.core.Configuration;
import com.opus2.magnum.steps.login.HomeSteps;
import com.opus2.util.Util;
public class NavigateToTranscriptPageViaTranscriptTab{
	@Steps
	HomeSteps home;
	
	@Given("the user is not present on the Transcripts_Page")	
	public void givenTheUserIsNotPresentOnTheTranscrips_Page(){
		String currentUrl = Util.getDriver().getCurrentUrl();
		assertThat(Configuration.transcriptsUrl.equals(currentUrl)).isFalse();
	}
	
	@Given("the Transcripts_Tab is visible")	
	public void givenTheTranscripts_TabIsVisible(){
		assertThat(home.tabIsVisible("transcripts").isDisplayed()).isTrue();
	}
	
	@When("the user clicks the Transcripts_Tab")	
	public void whenTheUserClicksTheTranscripts_Tab(){
		home.clickTab("transcripts");
	}
	
	@Then("they must be navigated to the Transcripts_Page")	
	public void thenTheyMustBeNavigatedToTheTranscripts_Page(){
		String page = Configuration.transcriptsUrl + "?ws="+ Configuration.getSelectedUser().getWorkspace();
		assertThat(page.equals(Util.getDriver().getCurrentUrl())).isTrue();
	}
}