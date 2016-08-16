package com.opus2.magnum.navigate;
import static org.assertj.core.api.Assertions.assertThat;
import net.thucydides.core.annotations.Steps;

import org.jbehave.core.annotations.*;
import org.openqa.selenium.WebElement;

import com.opus2.core.Configuration;
import com.opus2.util.Util;
public class NavigateToTranscriptsPageViaShortcutOnHomePage{
	@Steps
	NavigateShortcutSteps userSteps;
	
	@Given("the <Transcripts_Shortcut> is visible")	
	public void givenTheTranscripts_ShortcutIsVisible(String Transcripts_Shortcut){
		WebElement img = userSteps.thumbnail(Transcripts_Shortcut);
		assertThat(img.isDisplayed()).isTrue();
	}
	
	@When("the user clicks the <Transcripts_Shortcut>")	
	public void whenTheUserClicksTheTranscripts_Shortcut(String Transcripts_Shortcut){
		userSteps.clickShortcut(Transcripts_Shortcut);
	}
	
	@Then("they must be navigated to the <Transcripts_Page> via the <Transcripts_Shortcut>")	
	public void thenTheyMustBeNavigatedToTheTranscripts_PageViaTheTranscript_Shortcut(String Transcripts_Page, String Transcripts_Shortcut){
		String currentUrl = Util.getDriver().getCurrentUrl();
		String wsid = Configuration.getSelectedUser().getWorkspace();
		String page = Configuration.transcriptsUrl + "?ws="+ wsid;
		assertThat(page.equals(currentUrl)).isTrue();
	}
}