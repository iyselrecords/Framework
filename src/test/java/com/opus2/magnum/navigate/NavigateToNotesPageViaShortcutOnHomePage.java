package com.opus2.magnum.navigate;
import static org.assertj.core.api.Assertions.*;
import net.thucydides.core.annotations.Steps;

import org.jbehave.core.annotations.*;
import com.opus2.core.Configuration;
import com.opus2.util.Util;
public class NavigateToNotesPageViaShortcutOnHomePage{
	@Steps
	NavigateShortcutSteps userSteps;
	
	@Given("the Notes_Shortcut is visible")
	public void givenTheNotes_ShortcutIsVisible(){
		assertThat(userSteps.notesImage().isDisplayed()).isTrue();
	}
	
	@When("the user clicks the Notes_Shortcut")
	public void whenTheUserClicksTheNotes_Shortcut(){
		userSteps.notesShortcut();
	}
	
	@Then("they must be navigated to the Notes_Page via the Notes_Shortcut")
    public void thenTheyMustBeNavigatedToTheNotes_Page(){
		String page = Configuration.notesUrl + "?ws="+ Configuration.getSelectedUser().getWorkspace();
		assertThat(page.equals(Util.getDriver().getCurrentUrl())).isTrue();
    }
}