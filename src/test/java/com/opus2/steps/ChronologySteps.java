package com.opus2.steps;


import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import com.opus2.enums.ChronologyType;
import com.opus2.enums.Pages;
import com.opus2.pages.Chronology;
import com.opus2.pages.Dialog;
import com.opus2.pages.UserAction;
import com.opus2.util.Constants;
import com.opus2.util.Util;

import net.serenitybdd.jbehave.SerenityStories;
import net.thucydides.core.annotations.Steps;

public class ChronologySteps extends SerenityStories{
	@Steps
	Chronology chronology;
	Util util;
	Dialog dialog;
	UserAction action;
	
	@When("user clicks on Chronology Tab")
	public void whenUserClicksOnChronologyTab(){
		action.goTo(Pages.Chronology);
	}
	@Then("Chronology page opens correctly")
	public void thenChronologyPageOpensCorrectly(){
		util.wait(1);
	}
	@When("clicks on New Entry button")
	public void andClicksOnNewEntryButton(){
		chronology.newEntry();
	}
	@When("user clicks on New Entry button")
	public void whenUserClicksOnNewEntryButton(){
		chronology.newEntry();
	}
	@Then("a new blank entry will appear in the list")
	public void thenANewBlankEntryWillAppearInTheList(){
		util.wait(1);
		//assert list count;
	}
	
	//CH_004
	@When("select Entry from the list")
	public void andSelectEntryFromTheList(){
		//chronology.newEntry();
		util.wait(2);
		chronology.selectLastEntry();
	}
	@When("user select Entry from the list")
	public void whenUserSelectEntryFromTheList(){
		util.wait(1);
		chronology.selectLastEntry();
	}
	@When("click on the tag button")
	public void andClickOnTheTagButton(){
		chronology.selectTag();
	}
	@Then("the 'Select Document Tags' Dialog should be visible")
	public void thenTheSelectDocumentTagsDialogShouldBeVisible(){
		
	}
	@SuppressWarnings("static-access")
	@When("user select '<tag>' and apply")
	public void whenUserSelecttagAndApply(){
		dialog.selectDocumentTags.find("jev_80");
		dialog.selectDocumentTags.selectTag();
		dialog.selectDocumentTags.apply();
	}
	@When("saves changes")
	public void andSavesChanges(){
		chronology.saveChanges();
	}
	@Then("Tags should be added in the 'Tags' section of the entry window")
	public void thenTagsShouldBeAddedInTheTagsSectionOfTheEntryWindow(){
		//assert tag is attached to list
		util.wait(2);
	}
	@When("select option from the Type dropdown")
	public void whenSelectOptionFromTheTypeDropdown(){
		chronology.select(ChronologyType.Fact);
	}
	@When("select Custom Type option")
	public void andSelectCustomTypeOptionFromTheTypeDropdown(){
		chronology.select(ChronologyType.CustomType);
	}
	@Then("Type option should be assigned to Entry List")
	public void thenTypeOptionShouldBeAssignedToEntryList(){
		util.wait(2);
	}
	@Then("Custom Type option should be assigned to Entry List")
	public void thenCustomTypeOptionShouldBeAssignedToEntryList(){
		util.wait(2);
	}
	
	
	//CH_006
	@When("user clicks Custom Type button")
	public void whenUserClicksCustomTypeButton(){
		chronology.customType();
	}
	@Then("the Custom Types Dialog should be visible")
	public void thenTheCustomTypesDialogShouldBeVisible(){
		util.wait(1);
	}
	@SuppressWarnings("static-access")
	@When("user clicks on the Add button")
	public void whenUserClicksOnTheAddButton(){
		 dialog.customTypes.add();
	}
	@Then("the Save A Custom Type Dialog should be visible")
	public void thenTheSaveACustomTypeDialogShouldBeVisible(){
		util.wait(1);
	}
	@SuppressWarnings("static-access")
	@When("user enters new Custom Type")
	public void whenUserEntersNewCustomType(){
		dialog.saveACustomType.newName(Constants.CustomType);
	}
	@SuppressWarnings("static-access")
	@When("clicks Ok")
	public void whenClicksOk(){
		dialog.saveACustomType.OK();
	}
	@SuppressWarnings("static-access")
	@Then("Custom Type should be added on Custom Types Dialog")
	public void thenCustomTypeTypeShouldBeAddedOnCustomTypesDialog(){
		dialog.customTypes.cancel();
		action.reloadPage();
		util.wait(1);
	}
	
	
}
