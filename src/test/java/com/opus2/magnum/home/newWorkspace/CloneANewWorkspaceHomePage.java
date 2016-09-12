package com.opus2.magnum.home.newWorkspace;

import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import net.thucydides.core.annotations.Steps;
import static org.assertj.core.api.Assertions.*;

public class CloneANewWorkspaceHomePage {
	@Steps
	NewWorkspaceSteps nwks;
	
	@When("clicks the Advanced link")
    public void andClicksTheAdvancedLink(){
		nwks.advancedLink();
    }
    
	@When("select Workspace To Clone")
    public void andSelectWorkspaceToClone(){
		nwks.selectWorkspace();
    }
    
	@Then("the New_Workspace is cloned")
	public void thenNewWorkspaceIsCloned(){
		nwks.clonedWKS();
		//assertThat(nwks.assertDIP().equals("TDIP")).isTrue();
	}
	
	@Then("visible on the Home_Page")
    public void andVisibleOnTheHomePage(){
    	assertThat(nwks.assertDIP().equals("TDIP")).isTrue();
    }
}
