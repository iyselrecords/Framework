package com.opus2.magnum.navigate;

import net.thucydides.core.annotations.Steps;

import org.jbehave.core.annotations.*;
import org.openqa.selenium.WebElement;
import static org.assertj.core.api.Assertions.*;

import com.opus2.core.Configuration;
import com.opus2.magnum.steps.login.HomeSteps;
import com.opus2.util.Util;
public class NavigatetoChronologyPageViaShortcutOnHomePage{
	@Steps
	NavigateShortcutSteps userSteps;
	
	@Given("the <Chronology_Shortcut> is visible")	
	public void givenTheChronology_ShortcutIsVisible(String Chronology_Shortcut){
		WebElement img = userSteps.thumbnail(Chronology_Shortcut);
		assertThat(img.isDisplayed()).isTrue();
	}
	
	@When("the user clicks the <Chronology_Shortcut>")	
	public void whenTheUserClicksTheChronology_Shortcut(String Chronology_Shortcut){
		userSteps.clickShortcut(Chronology_Shortcut);
	}
	
	@Then("they must be navigated to the <Chronology_Page> via the <Chronology_Shortcut>")
	public void thenTheyMustBeNavigatedToTheChronology_PageViaTheChronology_Shortcut(String Chronology_Page, String Chronology_Shortcut){
		String currentUrl = Util.getDriver().getCurrentUrl();
		String wsid = Configuration.getSelectedUser().getWorkspace();
		String page = Configuration.chronologyUrl  + "?ws="+ wsid;
		assertThat(page.equals(currentUrl)).isTrue();
	}
}