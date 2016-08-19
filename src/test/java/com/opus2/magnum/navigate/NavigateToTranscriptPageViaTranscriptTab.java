package com.opus2.magnum.navigate;
import net.thucydides.core.annotations.Steps;

import org.jbehave.core.annotations.*;
import static org.assertj.core.api.Assertions.*;

import com.opus2.core.Configuration;
import com.opus2.util.Util;
public class NavigateToTranscriptPageViaTranscriptTab{
	@Steps
	NavigateSteps nav;
	
	@Given("the user is not present on the Transcripts_Page")	
	public void givenTheUserIsNotPresentOnTheTranscrips_Page(){
		assertThat(nav.getCurrentUrl().equals(Configuration.transcriptsUrl)).isFalse();
	}
	
	@Given("the Transcripts_Tab is visible")	
	public void givenTheTranscripts_TabIsVisible(){
		assertThat(nav.transTab().isDisplayed()).isTrue();
	}
	
	@When("the user clicks the Transcripts_Tab")	
	public void whenTheUserClicksTheTranscripts_Tab(){
		nav.transcriptsTab();
	}
	
	@Then("they must be navigated to the Transcripts_Page")	
	public void thenTheyMustBeNavigatedToTheTranscripts_Page(){
		String page = Configuration.transcriptsUrl + "?ws="+ Configuration.getSelectedUser().getWorkspace();
		assertThat(page.equals(Util.getDriver().getCurrentUrl())).isTrue();
	}
}
