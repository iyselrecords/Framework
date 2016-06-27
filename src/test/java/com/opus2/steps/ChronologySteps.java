package com.opus2.steps;

import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import com.opus2.enums.Pages;
import com.opus2.pages.Admin;
import com.opus2.pages.Chronology;
import com.opus2.pages.Dialog;
import com.opus2.pages.Documents;
import com.opus2.pages.Home;
import com.opus2.pages.UserAction;
import com.opus2.util.Util;

import net.thucydides.core.steps.ScenarioSteps;

public class ChronologySteps extends ScenarioSteps  {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Util util;
	Home home;
	Documents document;
	UserAction user;
	Admin admin;
	Chronology chronology;
	Dialog dialog;
	
	
	@When("user clicks on Chronology Tab")
	public void whenUserClicksOnChronologyTab(){
		user.goTo(Pages.Chronology);
	}
	@Then("Chronology page opens correctly")
	public void thenChronologyPageOpensCorrectly(){
		util.pause(0.5);
	}
/*
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
		user.reloadPage();
		util.wait(1);
	}
*/

	
	//CHf_01
	@When("user click on the Filter button")
	public void whenUserClickOnTheFilterButton(){
		chronology.filter();
	}
	@Then("the Filter Dialog is visible")
	public void thenTheFilterDialogIsVisible(){
		util.pause(1);
	}
	
	////CHf_02
	@SuppressWarnings("static-access")
	@When("user clicks 'Item without description' checkbox")
	public void whenUserClicksItemWithoutDescriptionCheckbox(){
		dialog.chronologyFilter.itemsWithoutDescription();
	}
	@Then("only entries without description are visible")
	public void thenOnlyEntriesWithoutDescriptionAreVisible(){
		user.clickAction("docscontrols.Filter");
		util.pause(3);
	}
	
	//date
	@SuppressWarnings("static-access")
	@When("user input '$chro_date'")
	public void whenUserInputchro_date(String chro_date){
		dialog.chronologyFilter.inputDate(chro_date);
	}
	@SuppressWarnings("static-access")
	@When("select On option")
	public void whenSelectOnOption(){
		dialog.chronologyFilter.selectDateOption("On");
	}	
	@Then("entries On, Before, After and Ranges from '<chro_date>' is visible")
	public void thenEntriesOnBeforeAfterAndRangesFromchro_dateIsVisible(){
		util.pause(0.5);
	}
	@SuppressWarnings("static-access")
	@When("user select Before option")
	public void whenUserSelectBeforeOption(){
		dialog.chronologyFilter.selectDateOption("Before");
	}
	@SuppressWarnings("static-access")
	@When("user select After option")
	public void whenUserSelectAfterOption(){
		dialog.chronologyFilter.selectDateOption("After");
	}
	@SuppressWarnings("static-access")
	@When("user select Range option")
	public void whenUserSelectRangeOption(){
		dialog.chronologyFilter.selectDateOption("Range");
		user.clickActionName("Date: ");
	}
	
	
	//Entries Type
	@When("user select the Type checkbox")
	public void whenUserSelectTheTypeCheckbox(){
		user.clickActionName("Types: ");
	}
	@When("click to open Select dropdown")
	public void andClickToOpenSelectDropdown(){
		user.clickAction("chron-filter.chron-filter.Select");
	}
	@Then("dropdown displays Types options")
	public void thenDropdownDisplaysTypesOptions(){
		util.pause(1);
	}
	
	
	
	
	@SuppressWarnings("static-access")
	@When("user select All")
	public void whenUserSelectAll(){
		dialog.chronologyFilter.selectType("All");
	}
	@Then("every type of entries is visible")
	public void thenEveryTypeOfEntriesIsVisible(){
		util.pause(1);
	}
	@SuppressWarnings("static-access")
	@When("user select None")
	public void whenUserSelectNone(){
		dialog.chronologyFilter.selectType("None");
	}
	@Then("no entries is visible")
	public void thenNoEntriesIsVisible(){
		util.pause(1);
	}
	@SuppressWarnings("static-access")
	@When("user select Fact")
	public void whenUserSelectFact(){
		dialog.chronologyFilter.selectType("Fact");
	}
	@Then("entries type Fact is visible")
	public void thenEntriesTypeFactIsVisible(){
		util.pause(1);
	}
	@SuppressWarnings("static-access")
	@When("user select Meeting")
	public void whenUserSelectMeeting(){
		dialog.chronologyFilter.selectType("Meeting");
	}
	@Then("entries type Meeting is visible")
	public void thenEntriesTypeMeetingIsVisible(){
		util.pause(1);
	}
	@SuppressWarnings("static-access")
	@When("user select Event")
	public void whenUserSelectEvent(){
		dialog.chronologyFilter.selectType("Event");
	}
	@Then("entries type Event is visible")
	public void thenEntriesTypeEventIsVisible(){
		util.pause(1);
	}	
	@SuppressWarnings("static-access")
	@When("user select Letter")
	public void whenUserSelectLetter(){
		dialog.chronologyFilter.selectType("Letter");
	}
	@Then("entries type Letter is visible")
	public void thenEntriesTypeLetterIsVisible(){
		util.pause(1);
	}	
	@SuppressWarnings("static-access")
	@When("user select Email")
	public void whenUserSelectEmail(){
		dialog.chronologyFilter.selectType("Email");
	}
	@Then("entries type Email is visible")
	public void thenEntriesTypeEmailIsVisible(){
		util.pause(1);
	}
	@SuppressWarnings("static-access")
	@When("user select No Type")
	public void whenUserSelectNoType(){
		dialog.chronologyFilter.selectType("[no type]");
	}
	@Then("entries type No Type is visible")
	public void thenEntriesTypeNoTypeIsVisible(){
		util.pause(1);
	}
	/*	
	//Status
	@SuppressWarnings("static-access")
	@When("user select 'Any' option")
	public void whenUserSelectAnyOption(){
		dialog.chronologyFilter.selectStatue("Any");
	}
	@Then("entries with 'Any' status are visible")
	public void thenEntriesWithAnyStatusAreVisible(){
		util.wait(1);
	}
	@SuppressWarnings("static-access")
	@When("user select 'Undisputed' option")
	public void whenUserSelectUndisputedOption(){
		dialog.chronologyFilter.selectStatue("Undisputed");
	}
	@Then("entries with 'Undisputed' status are visible")
	public void thenEntriesWithUndisputedStatusAreVisible(){
		util.wait(1);
	}
	@SuppressWarnings("static-access")
	@When("user select 'Disputed' option")
	public void whenUserSelectDisputedOption(){
		dialog.chronologyFilter.selectStatue("Disputed");
	}
	@Then("entries with 'Disputed' status are visible")
	public void thenEntriesWithDisputedStatusAreVisible(){
		util.wait(1);
	}
	@SuppressWarnings("static-access")
	@When("user select 'Not set' option")
	public void whenUserSelectNotSetOption(){
		dialog.chronologyFilter.selectStatue("Not set");
	}
	@Then("entries that status are 'Not set' are visible")
	public void thenEntriesThatStatusAreNotSetAreVisible(){
		util.wait(1);
		user.clickActionName("Status: ");
	}

	//Tags
	@SuppressWarnings("static-access")
	@When("user click on the tag button")
	public void whenUserClickOnTheTagButton(){
		dialog.chronologyFilter.tag();
	}
	@SuppressWarnings("static-access")
	@When("select All and Apply")
	public void whenSelectAllAndApply(){
		dialog.selectDocumentTags.selectAll();
		dialog.selectDocumentTags.apply();
	}
	@Then("entries with any tag are visible")
	public void thenEntriesWithAnyTagAreVisible(){
		util.wait(3);
	}
	@SuppressWarnings("static-access")
	@When("select any tag and Apply")
	public void whenSelectAnyTagAndApply(){
		dialog.selectDocumentTags.selectNone();
		dialog.selectDocumentTags.chooseTag("tag1");
		dialog.selectDocumentTags.apply();
		util.wait(3);
		user.clickActionName("Tags: ");
	}
	@Then("entries with selected tag should be visible")
	public void thenEntriesWithSelectedTagShouldBeVisible(){
		util.wait(1); 
	}
	
	
	//Shared/Private Filters
	@SuppressWarnings("static-access")
	@When("user select Item Without Description/Date/Type Filters")
	public void whenUserSelectItemWithoutDescriptionDateTypeFilters(){
		dialog.chronologyFilter.createSharedFilters();
	}
	@SuppressWarnings("static-access")
	@When("user select Date/Type Filters")
	public void whenUserSelectDateTypeFilters(){
		dialog.chronologyFilter.createPrivateFilters();
	}
	@SuppressWarnings("static-access")
	@When("select Save as Shared Filter")
	public void whenSelectSaveAsSharedFilter(){
		dialog.chronologyFilter.saveCurrentFilter("Shared");
	}
	@SuppressWarnings("static-access")
	@When("enter '<shared_filter>'")
	public void whenEntershared_filter(){
		dialog.saveAsSharedFilter.inputText("TS_Fil");
	}
	@When("click OK")
	public void whenClickOK(){
		user.clickAction("name-dialog_OK");
	}
	@Then("save filter should be visible on Shared Filters options")
	public void thenSaveFilterShouldBeVisibleOnSharedFiltersOptions(){
		util.wait(1);
		chronology.reset();
	}
	@SuppressWarnings("static-access")
	@When("select Save as Private Filter")
	public void whenSelectSaveAsPrivateFilter(){
		dialog.chronologyFilter.saveCurrentFilter("Private");
	}
	@SuppressWarnings("static-access")
	@When("enter '<private_filter>'")
	public void whenEnterprivate_filter(){
		dialog.saveAsSharedFilter.inputText("TP_Fil");
	}
	@Then("save filter should be visible on Private Filters options")
	public void thenSaveFilterShouldBeVisibleOnPrivateFiltersOptions(){
		util.wait(1);
	}
	
	
	//selecting Saved Shared/Private Filters
	@When("user click Shared Filters checkbox")
	public void whenUserClickSharedFiltersCheckbox(){
		user.clickAction("chron-filter_chron-filter", "saved-filters", "input",0);
	}
	@SuppressWarnings("static-access")
	@When("select '<shared_filter>'")
	public void andSelectshared_filter(){
		dialog.chronologyFilter.deleteSavedFilter("Shared");
	}
	@Then("entries filters saved on '<shared_filter>' are visible")
	public void thenEntriesFiltersSavedOnshared_filterAreVisible(){
		util.wait(1);
	}
	@When("user click Private Filters checkbox")
	public void whenUserClickPrivateFiltersCheckbox(){
		user.clickAction("chron-filter_chron-filter", "saved-filters", "input",2);
	}
	@SuppressWarnings("static-access")
	@When("select '<private_filter>'")
	public void andSelectprivate_filter(){
		dialog.chronologyFilter.deleteSavedFilter("Private");
	}
	@Then("entries filters saved on '<private_filter>' are visible")
	public void thenEntriesFiltersSavedOnprivate_filterAreVisible(){
		util.wait(1);
	}
	
	//
	@When("click delete icon")
	public void andClickDeleteIcon(){
		user.filterDropdown(1);
		util.wait(2);
		user.reloadPage();
		chronology.filter();
	}
	@When("click delete icon (x)")
	public void andClickDeleteIconX(){
		//user.filterDropdown(4);
		util.wait(2);
	}
	@Then("saved filtered entries should be deleted from dropdown")
	public void thenSavedFilteredEntriesShouldBeDeletedFromDropdown(){
		util.wait(2);
	}
	
*/
}
