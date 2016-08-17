package com.opus2.magnum.home.newWorkspaceDialog;
import static org.assertj.core.api.Assertions.assertThat;
import net.thucydides.core.annotations.Steps;

import org.jbehave.core.annotations.*;

import com.opus2.core.Configuration;
import com.opus2.pages.home.newworkspace.NewWorkspace;
public class CreateNewWorkspaceHomePage{
	@Steps
    NewWorkspaceSteps nwks;
    
	@Given("the Start_A_New_Workspace_Dialog is open")
    public void givenTheStart_A_New_Workspace_DialogIsOpen(){
	  	assertThat(nwks.dialog().equals("block")).isTrue();
    }
    
    @Given("the Title_Field is visible")
    public void givenTheTitle_FieldIsVisible(){
    	assertThat(nwks.titleField().isDisplayed()).isTrue();
    }
    
	@Given("the Description_Field is visible")
	public void givenTheDescription_FieldIsVisible(){
    	assertThat(nwks.descField().isDisplayed()).isTrue();
	}
	
	@Given("the Create_Workspace_Button is visible")
    public void givenTheCreate_Workspace_ButtonIsVisible(){
    	assertThat(nwks.createWorkspaceButton().isDisplayed()).isTrue();
    }

	@When("the user inputs Workspace_Title into the Title_Field")
	public void whenTheUserInputsWorkspace_TitleIntoTheTitle_Field(){
		nwks.inputWKSTitle();	       
	}
	
	@When("the Description in the Description_Field")
	public void whenTheDescriptionInTheDescription_Field(){
		nwks.inputWKSDescription();
	}

	@When("clicks the Create_Workspace_Button")
    public void whenClicksTheCreate_Workspace_Button(){
		nwks.createWorkspace();   
    }
	
	@Then("the New_Workspace must be created")
    public void thenTheNew_WorkspaceMustBeCreated(){
		assertThat(nwks.wksCreated().equals("WORKSPACE: " + NewWorkspace.NEW_WORKSPACE_TITLE)).isTrue();
    }
	
	@Then("the user must be navigated to the Admin_Page")
	public void thenTheUserMustBeNavigatedToTheAdmin_Page(){
    	assertThat(nwks.getTitle().equals(Configuration.selectedUser.getEmail() +" - Magnum settings - " + NewWorkspace.NEW_WORKSPACE_TITLE)).isTrue();
	}
}