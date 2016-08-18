package com.opus2.magnum.navigate;
import net.thucydides.core.annotations.Steps;

import org.jbehave.core.annotations.*;
import static org.assertj.core.api.Assertions.*;

import com.opus2.core.Configuration;
import com.opus2.util.Util;
public class NavigateToDocumentsPageViaShortcutOnHomePage{
	@Steps
	NavigateShortcutSteps userSteps;
	
	@Given("the Documents_Shortcut is visible")	
	public void givenTheDocuments_ShortcutIsVisible(){
		assertThat(userSteps.documentsImage().isDisplayed()).isTrue();
	}
	
	@When("the user clicks the Documents_Shortcut")	
	public void whenTheUserClicksTheDocuments_Shortcut(){
		userSteps.docShortcut();
	}
	
	@Then("they must be navigated to the Documents_Page via the Documents_Shortcut")	
	public void thenTheyMustBeNavigatedToTheDocuments_PageViaTheDocuments_Shortcut(String Documents_Page, String Documents_Shortcut){
		String page = Configuration.documentsUrl + "?ws="+ Configuration.getSelectedUser().getWorkspace();
		assertThat(page.equals(Util.getDriver().getCurrentUrl())).isTrue();
	}
}