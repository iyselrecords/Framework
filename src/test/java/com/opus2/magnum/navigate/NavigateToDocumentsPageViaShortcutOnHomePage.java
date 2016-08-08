package com.opus2.magnum.navigate;
import net.thucydides.core.annotations.Steps;

import org.jbehave.core.annotations.*;
import org.openqa.selenium.WebElement;

import static org.assertj.core.api.Assertions.*;

import com.opus2.core.Configuration;
import com.opus2.magnum.steps.login.HomeSteps;
import com.opus2.util.Util;
public class NavigateToDocumentsPageViaShortcutOnHomePage{
	@Steps
	NavigateShortcutSteps userSteps;
	
	@Given("the <Documents_Shortcut> is visible")	
	public void givenTheDocuments_ShortcutIsVisible(String Documents_Shortcut){
		WebElement img = userSteps.thumbnail(Documents_Shortcut);
		assertThat(img.isDisplayed()).isTrue();
	}
	
	@When("the user clicks the <Documents_Shortcut>")	
	public void whenTheUserClicksTheDocuments_Shortcut(String Documents_Shortcut){
		userSteps.clickShortcut(Documents_Shortcut);
	}
	
	@Then("they must be navigated to the <Documents_Page> via the <Documents_Shortcut>")	
	public void thenTheyMustBeNavigatedToTheDocuments_PageViaTheDocuments_Shortcut(String Documents_Page, String Documents_Shortcut){
		String currentUrl = Util.getDriver().getCurrentUrl();
		String wsid = Configuration.getSelectedUser().getWorkspace();
		String page = Configuration.documentsUrl + "?ws="+ wsid;
		assertThat(page.equals(currentUrl)).isTrue();
	}
}