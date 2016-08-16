package com.opus2.magnum.navigate;
import static org.assertj.core.api.Assertions.*;
import net.thucydides.core.annotations.Steps;

import org.jbehave.core.annotations.*;
import org.openqa.selenium.WebElement;

import com.opus2.core.Configuration;
import com.opus2.util.Util;
public class NavigateToNotesPageViaShortcutOnHomePage{
	@Steps
	NavigateShortcutSteps userSteps;
	
	@Given("the <Notes_Shortcut> is visible")
	public void givenTheNotes_ShortcutIsVisible(String Notes_Shortcut){
		WebElement img = userSteps.thumbnail(Notes_Shortcut);
		assertThat(img.isDisplayed()).isTrue();
	}
	
	@When("the user clicks the <Notes_Shortcut>")
	public void whenTheUserClicksTheNotes_Shortcut(String Notes_Shortcut){
		userSteps.clickShortcut(Notes_Shortcut);
	}
	
	@Then("they must be navigated to the <Notes_Page> via the <Notes_Shortcut>")
    public void thenTheyMustBeNavigatedToTheNotes_Page(String Notes_Page, String Notes_Shortcut){
		String currentUrl = Util.getDriver().getCurrentUrl();
		String wsid = Configuration.getSelectedUser().getWorkspace();
		String page = Configuration.notesUrl  + "?ws="+ wsid;
		assertThat(page.equals(currentUrl)).isTrue();
    }
}