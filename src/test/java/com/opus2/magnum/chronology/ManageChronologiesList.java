package com.opus2.magnum.chronology;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import net.thucydides.core.annotations.Steps;
import static org.assertj.core.api.Assertions.*;

public class ManageChronologiesList {
	@Steps
	ChronologySteps dip;
	

	@Given("Manage_Chronologies_Button is visible")
	public void givenManage_Chronologies_ButtonIsVisible(){
		assertThat(dip.assertDIP().equals("TDIP")).isTrue();
	}
	@When("user clicks Manage_Chronologies_Button")
	public void whenUserClicksManage_Chronologies_Button(){
		  dip.manageChron();
	}
	@Then("Manage_Chronologies_Dialog should be visible")
	public void thenManage_Chronologies_DialogShouldBeVisible(){
		assertThat(dip.assertDIP().equals("TDIP")).isTrue();  
	}
	
	
	@Given("the Manage_Chronologies_Dialog is open")
	public void givenTheManage_Chronologies_DialogIsOpen(){
		assertThat(dip.assertDIP().equals("TDIP")).isTrue();
	}
	@When("user clicks the All_Link")
	public void whenUserClicksTheAll_Link(){
		  dip.selectAll();
	}
	@Then("all Chronologies_List is selected")
	public void thenAllChronologies_ListIsSelected(){
		assertThat(dip.assertDIP().equals("TDIP")).isTrue();
	}
	
	
	@When("user clicks the None_Link")
	public void whenUserClicksTheNone_Link(){
		 dip.selectNone();
	}
	@Then("all Chronologies_List is deselected")
	public void thenAllChronologies_ListIsDeselected(){
		assertThat(dip.assertDIP().equals("TDIP")).isTrue(); 
	}
	
	
	@Given("the Add_Button is visible")
	public void givenTheAdd_ButtonIsVisible(){
		assertThat(dip.assertDIP().equals("TDIP")).isTrue(); 
	}
	@When("user clicks on the Add_Button")
	public void whenUserClicksOnTheAdd_Button(){
		dip.add();
	}
	@When("input Chronology_List_Name")
	public void whenInputChronology_List_Name(){
		dip.chronListName();
	}
	@When("clicks Chronology_List_Save_Button")
	public void whenClicksChronology_List_Save_Button(){
		  dip.save();
	}
	@Then("new Chronology_List is visible on the Chronologies_List")
	public void thenNewChronology_ListIsVisibleOnTheChronologies_List(){
		dip.addMyList();
		assertThat(dip.assertDIP().equals("TDIP")).isTrue();  
	}
	
	
	@Given("the Edit_Button is visible")
	public void givenTheEdit_ButtonIsVisible(){
		assertThat(dip.assertDIP().equals("TDIP")).isTrue();
	}
	@When("user select Chronology_List to edit")
	public void whenUserSelectChronology_ListToEdit(){
		  dip.selectChronologiesList(Chronology.CHRON_LIST);
	}
	@When("clicks on the Edit_Button")
	public void whenClicksOnTheEdit_Button(){
		  dip.edit();
	}
	@When("update Chronology_List")
	public void whenUpdateChronology_List(){
		dip.update();
	}
	@Then("the Chronology_List is updated on the Chronologies_List")
	public void thenTheChronology_ListIsUpdatedOnTheChronologies_List(){
		assertThat(dip.assertDIP().equals("TDIP")).isTrue();  
	}
	
	@Given("the Delete_Button is visible")
	public void givenTheDelete_ButtonIsVisible(){
		assertThat(dip.assertDIP().equals("TDIP")).isTrue();
	}
	@When("user select Chronology_List to delete")
	public void whenUserSelectChronology_ListToDelete(){
		  dip.selectChronologiesList(Chronology.UPDATE_CHRON_LIST);
	}
	@When("clicks on the Delete_Button")
	public void whenClicksOnTheDelete_Button(){
		 dip.delete(); 
	}
	@When("confirms action")
	public void whenConfirmsAction(){
		  dip.OK();
	}
	@Then("the Chronology_List deleted from the Chronologies_List")
	public void thenTheChronology_ListDeletedFromTheChronologies_List(){
		assertThat(dip.assertDIP().equals("TDIP")).isTrue();  
	}
	
	
	@Given("the Find_Input is visible")
	public void givenTheFind_InputIsVisible(){
		assertThat(dip.assertDIP().equals("TDIP")).isTrue();
	}
	@Given("the Chronology_List is listed on the Chronologies_List")
	public void andTheChronology_ListIsListedOnTheChronologies_List(){
		assertThat(dip.assertDIP().equals("TDIP")).isTrue();
	}
	@When("user input a Search_Text")
	public void whenUserInputASearch_Text(){
		 dip.search(); 
	}
	@Then("the Search_Text is filtered")
	public void thenTheSearch_TextIsFiltered(){
		assertThat(dip.assertDIP().equals("TDIP")).isTrue();  
	}
}
