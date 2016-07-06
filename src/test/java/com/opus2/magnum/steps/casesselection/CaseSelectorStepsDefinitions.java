package com.opus2.magnum.steps.casesselection;
import org.jbehave.core.annotations.*;
public class CaseSelectorStepsDefinitions{
	@When("the <User> selects <Workspace_Title>")
	@Pending
	public void whenTheUserSelectsWorkspace(@Named("Workspace_Title")String wsTitle){
		 
	}
	@Then("they must be navigated to the <Documents_Page>")
	@Pending
	public void navigateToSpecificDocumentsPage(@Named("Documents_Page") String wsId){
	
	}
	@Given("<User> can see the cases section in home page")
	@Pending
	public void givenTheUserCanSeeTheCasesSectionInHomePage(){
		 
	}
	@Given("the <Workspace_Title> is visible in the cases section")
	@Pending
	public void givenTheWorkspace_TitleIsVisibleInTheCasesSection(@Named("Workspace_Title")String wsTitle){
		 //TODO 
	}
}