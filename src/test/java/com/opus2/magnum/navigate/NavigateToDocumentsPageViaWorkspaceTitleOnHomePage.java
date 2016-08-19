package com.opus2.magnum.navigate;
import net.thucydides.core.annotations.Steps;

import org.jbehave.core.annotations.*;
import static org.assertj.core.api.Assertions.*;
public class NavigateToDocumentsPageViaWorkspaceTitleOnHomePage{
	@Steps
	NavigateSteps nav;
	
	@Given("the Cases_Section is visible")	
	public void givenTheCases_SectionIsVisible(){
		assertThat(nav.getCasesSection().isDisplayed()).isTrue();
	}
	
	@Given("the Workspace_Title is visible")	
	public void givenTheWorkspace_TitleIsVisible(){  
	    assertThat(nav.workspaceTitle().isDisplayed()).isTrue();
	}
	
	@When("the user double clicks the Workspace_Title")
	public void whenTheUserDoubleClicksTheWorkspace_Title(){
		nav.getWorkspace();
	}
}