package com.opus2.magnum.navigate;
import net.thucydides.core.annotations.Steps;

import org.jbehave.core.annotations.*;
import org.openqa.selenium.WebElement;

import static org.assertj.core.api.Assertions.*;

import com.opus2.core.Configuration;
import com.opus2.magnum.steps.login.HomeSteps;
public class NavigateToDocumentsPageViaWorkspaceTitleOnHomePage{
	@Steps
	HomeSteps home;
	
	@Given("the Cases_Section is visible")	
	public void givenTheCases_SectionIsVisible(){
		assertThat(home.getCasesSection().equals("Cases".toUpperCase())).isTrue();
	}
	
	@Given("the Workspace_Title is visible")	
	public void givenTheWorkspace_TitleIsVisible(){
	    WebElement wsTitle = home.getWorkspace(Configuration.getSelectedUser().getCase().toUpperCase());    
	    assertThat(wsTitle.isDisplayed()).isTrue();
	}
	
	@When("the user double clicks the Workspace_Title")
	public void whenTheUserDoubleClicksTheWorkspace_Title(){
		home.clickWorkspace();
	}
}