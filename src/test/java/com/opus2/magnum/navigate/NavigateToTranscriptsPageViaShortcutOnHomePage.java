package com.opus2.magnum.navigate;
import static org.assertj.core.api.Assertions.assertThat;
import net.thucydides.core.annotations.Steps;

import org.jbehave.core.annotations.*;
import com.opus2.core.Configuration;
import com.opus2.util.Util;
public class NavigateToTranscriptsPageViaShortcutOnHomePage{
	@Steps
	NavigateShortcutSteps userSteps;
	
	@Given("the Transcripts_Shortcut is visible")	
	public void givenTheTranscripts_ShortcutIsVisible(){
		assertThat(userSteps.transcriptsImage().isDisplayed()).isTrue();
	}
	
	@When("the user clicks the Transcripts_Shortcut")	
	public void whenTheUserClicksTheTranscripts_Shortcut(){
		userSteps.transShortcut();
	}
	
	@Then("they must be navigated to the Transcripts_Page via the Transcripts_Shortcut")	
	public void thenTheyMustBeNavigatedToTheTranscripts_PageViaTheTranscript_Shortcut(String Transcripts_Page, String Transcripts_Shortcut){
		String page = Configuration.transcriptsUrl + "?ws="+ Configuration.getSelectedUser().getWorkspace();
		assertThat(page.equals(Util.getDriver().getCurrentUrl())).isTrue();
	}
}