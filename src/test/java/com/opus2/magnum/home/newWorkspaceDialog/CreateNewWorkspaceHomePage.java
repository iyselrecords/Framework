package com.opus2.magnum.home.newWorkspaceDialog;
import static org.assertj.core.api.Assertions.assertThat;
import net.thucydides.core.annotations.Steps;

import org.jbehave.core.annotations.*;
import org.openqa.selenium.WebElement;

import com.opus2.core.Configuration;
public class CreateNewWorkspaceHomePage{
	@Steps
    NewWorkspaceSteps nwks;
	private String wks;
    
    @Given("the Start_A_New_Workspace_Dialog is open")
    public void givenTheStart_A_New_Workspace_DialogIsOpen(){
	  	assertThat(nwks.getDialog().isDisplayed()).isTrue();
    }
    
    @Given("the Title_Field is visible")
    public void givenTheTitle_FieldIsVisible(){
    	assertThat(nwks.titleField().isDisplayed()).isTrue();
    }
    
	@Given("the Description_Field is visible")
	public void givenTheDescription_FieldIsVisible(){
    	assertThat(nwks.descField().isDisplayed()).isTrue();
	}
	
	@Given("the <Create_Workspace_Button> is visible")
    public void givenTheCreate_Workspace_ButtonIsVisible(String Create_Workspace_Button){
    	assertThat(nwks.dialogBtn(Create_Workspace_Button).isDisplayed()).isTrue();
    }

	@When("the user inputs <Workspace_Title> into the Title_Field")
	public void whenTheUserInputsWorkspace_TitleIntoTheTitle_Field(String Workspace_Title){
		wks = Workspace_Title;
		nwks.wksTitle(Workspace_Title);	       
	}
	
	@When("the <Description> in the Description_Field")
	public void whenTheDescriptionInTheDescription_Field(String Description){
		nwks.wksDesc(Description);		
	}

	@When("clicks the <Create_Workspace_Button>")
    public void whenClicksTheCreate_Workspace_Button(String Create_Workspace_Button){
		nwks.createWks(Create_Workspace_Button);    
    }
	
	@Then("the New_Workspace must be created")
    public void thenTheNew_WorkspaceMustBeCreated(){
		assertThat(nwks.wksCreated().equals("WORKSPACE: " + wks)).isTrue();
    }
	
	@Then("the user must be navigated to the Admin_Page")
	public void thenTheUserMustBeNavigatedToTheAdmin_Page(){
    	assertThat(nwks.getTitle().equals(Configuration.selectedUser.getEmail() +" - Magnum settings - " + wks)).isTrue();
	}
}