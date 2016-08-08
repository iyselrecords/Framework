package com.opus2.magnum.navigate;
import net.thucydides.core.annotations.Steps;

import org.jbehave.core.annotations.*;
import org.openqa.selenium.WebElement;

import static org.assertj.core.api.Assertions.*;

import com.opus2.magnum.steps.login.HomeSteps;
public class NavigateToDocumentsPageViaWorkspaceTitleOnHomePage{
	@Steps
	HomeSteps home;
	
	@Given("the <Cases_Section> is visible")	
	public void givenTheCases_SectionIsVisible(String Cases_Section){
		String CasesTitle = home.getCasesSection();
		assertThat(CasesTitle.equals(Cases_Section.toUpperCase())).isTrue();
	}
	
	@Given("the <Workspace_Title> is visible")	
	public void givenTheWorkspace_TitleIsVisible(String Workspace_Title){
		WebElement wsTitle = home.getWorkspace(Workspace_Title);
	    assertThat(wsTitle.getText().equals(Workspace_Title)).isTrue();
	}
	
	@When("the user double clicks the <Workspace_Title>")
	public void whenTheUserDoubleClicksTheWorkspace_Title(String Workspace_Title){
		home.clickWorkspace(Workspace_Title);
	}
}