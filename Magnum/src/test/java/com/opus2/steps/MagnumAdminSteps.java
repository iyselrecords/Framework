package com.opus2.steps;

import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Pending;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import com.opus2.pages.Admin;
import com.opus2.pages.Chronology;
import com.opus2.pages.Documents;
import com.opus2.pages.Home;
import com.opus2.pages.Login;
import com.opus2.pages.MyWorkspace;
import com.opus2.pages.Notes;
import com.opus2.pages.OldSearch;
import com.opus2.pages.Search;
import com.opus2.pages.Transcripts;
import com.opus2.pages.UploadDialog;
import com.opus2.pages.UserWorkspaces;
import com.opus2.util.Util;

import net.serenitybdd.jbehave.SerenityStories;

public class MagnumAdminSteps extends SerenityStories{
	Admin admin;
	Chronology chronology;
	Documents documents;
	Home homepage;
	Login loginpage;
	MyWorkspace myWorkspace;
	Notes notes;
	OldSearch oldSearch;
	Search search;
	Transcripts transcript;
	UploadDialog uploadDialog;
	UserWorkspaces userWorkspace;
	Util util;
	
	@When("user clicks on Documents Tab")
	public void whenUserClicksOnDocumentsTab(){
		documents.goTo();
	}
	@Then("they should be on Documents page")
	public void thenTheyShouldBeOnDocumentsPage(){
		//assert
	}
	
	@When("user clicks on Transcripts Tab")
	public void whenUserClicksOnTranscriptsTab(){
		transcript.goTo(); 
	}
	@Then("they should be on Transcripts page")
	public void thenTheyShouldBeOnTranscriptsPage(){
		//assert
	}
	
	@When("user clicks on Chronology Tab")
	public void whenUserClicksOnChronologyTab(){
		chronology.goTo();
	}
	@Then("they should be on Chronology page")
	public void thenTheyShouldBeOnChronologyPage(){
		//assert
	}
	
	@When("user clicks on Notes Tab")
	public void whenUserClicksOnNotesTab(){
		notes.goTo();
	}
	@Then("they should be on Notes page")
	public void thenTheyShouldBeOnNotesPage(){
		//assert
	}

	@When("user clicks on Old Search Tab")
	public void whenUserClicksOnOldSearchTab(){
		//oldSearch.goTo();
	}
	@Then("they should be on Old Search page")
	public void thenTheyShouldBeOnOldSearchPage(){
		//assert
	}
		
	@When("user clicks on Search Tab")
	public void whenUserClicksOnSearchTab(){
		search.goTo();
	}		
	@Then("they should be on Search page")
	public void thenTheyShouldBeOnSearchPage(){
		//assert
	}
		
	@When("user clicks on Admin Tab")
	public void whenUserClicksOnAdminTab(){
		admin.goTo();
	}
	@Then("they should be on Admin page")
	public void thenTheyShouldBeOnAdminPage(){
		//assert
	}
	
	@When("user clicks on Change button")
	public void whenUserClicksOnChangeButton(){
		 documents.changeDestinationFolder();
	}
	@Then("created folder should be visible Destination folder on workspace")
	public void thenCreatedFolderShouldBeVisibleDestinationFolderOnWorkspace(){
		 //assert
		documents.pageReload();
	}
	@When("select '<Destination>' folder and click Apply button")
	public void andSelectDestinationAndClickApplyButton(@Named("Destination") String folder){
		documents.selectFolder(folder); 
		documents.selectDestination(folder);
		util.wait(1);
		uploadDialog.applyButton();
	}
	@Then("selected folder should be set to Destination folder")
	public void thenSelectedFolderShouldBeSetToDestinationFolder(){
		 //assert 
	}
	
	@When("user clicks on '<folder_name>'")
	public void whenUserClicksOnfolder_name(@Named("folder_name") String folder){
		documents.expandFolder(folder);
	}
	@Then("the '<folder_name>' should expand")
	public void thenThefolder_nameShouldExpand(){
		 //assert 
		util.wait(1);
	}
	@Then("'<folder_name>' should collapse")
	public void thenfolder_nameShouldCollapse(){
		 //assert
		util.wait(1);
	}
	@When("click on '<folder_name>' again")
	public void whenClickOnfolder_nameAgain(@Named("folder_name") String folder){
		documents.collapseFolder(folder);
	}
	@When("user finds a '<Document>' and clicks on it")
	public void whenUserFindsADocumentAndClicksOnIt(@Named("Document") String document){
		documents.findDocument(document);
		util.wait(1);
		documents.clickDocument(document);
	}
	@Then("Preview should display first page of the document selected")
	public void thenPreviewShouldDisplayFirstPageOfTheDocumentSelected(){
		 //assert previewDoc
		util.wait(1);
	}
	@When("user clicks the backward button")
	public void whenUserClicksTheBackwardButton(){
		documents.previewPrevious();  
	}
	
	@When("user clicks on list dropdown and select a '<listOption>'")
	public void whenUserClicksOnListDropdownAndSelectAlistOption(@Named("listOption") String page){
		documents.previewSelectedPage(page);
	}
	
	@When("user clicks the forward button")
	public void whenUserClicksTheForwardButton(){
		 documents.previewNext(); 
	}
	@Then("Preview should be in the Previous page")
	public void thenPreviewShouldBeInThePreviousPage(){
		//assert
		util.wait(1);
	}
	@Then("Preview should be on '<listOption> page")
	public void thenPreviewShouldBeOnlistOptionPage(){
		//assert
		util.wait(1);
	}
	@Then("Preview should be in the Next page")
	public void thenPreviewShouldBeInTheNextPage(){
		//assert
		util.wait(1);
	}
	
	@When("user clicks on Preview '<Document>'")
	public void whenUserClicksOnPreviewDocument(@Named("Document")String document){
	    documents.previewDocumentNewTab();
	    util.switchToCurrentWindow(1);
	}
	@Then("a new tab opens with the preview '<Document>'")
	public void thenANewTabOpensWithThePreviewDocument(@Named("Document")String document){
	    //assert
		util.wait(1);
	}
	
	@When("user right click on '<Document>'")
	public void When(@Named("Document")String document){
		documents.rightClick(document);
	}
	@When("user right click on '<new_name>'")
	public void whenUserRightClickOnnew_name(@Named("new_name")String document){
		documents.clickDocument(document);
		documents.rightClick(document);
	}
	@When("select option '<properties>'")
	public void whenSelectProperties(@Named("properties")String option){
		documents.selectContextOptions(option);
	}
	@When("select option '<Rename>'")
	public void whenSelectRename(@Named("Rename")String option){
		documents.selectContextOptions(option);
	}
	@When("select option '<Reorder>'")
	public void whenSelectReorder(@Named("Reorder")String option){
		documents.selectContextOptions(option);
	}
	@When("select option '<Move>'")
	public void whenSelectMove(@Named("Move")String option){
		documents.selectContextOptions(option);
	}
	@Then("Properties Dialog should be visible")
	public void thenPropertiesDialogShouldBeVisible(){
		//assert
	}
	@Then("New Name For TestDoc Dialog should be visible")
	public void thenNewNameForTestDocDialogShouldBeVisible(){
		//assert
		util.wait(1);
	}
	@Then("Reorder Dialog should be visible")
	public void thenReorderDialogShouldBeVisible(){
		//assert
		util.wait(1);
	}
	@When("user clicks New notes dropdown and select '<Closed to new notes>' option")
	public void whenUserClicksNewNotesDropdownAndSelectClosedToNewNotesOption(@Named("Closed to new notes") String option){
		documents.selectNewNotes(option);
	}
	
	@When("click '<properties>' Apply button")
	public void andClickApplyButton(@Named("properties")String option){
		documents.applyButton(option);
	}
	@Then("user should see a 'Stop' icon in the top corner of every page")
	public void andUserShouldSeeAStopIconInTheTopCornerOfEveryPage(){
		//assert
		util.wait(1);
	}
	@When("user navigates back to previous window")
	public void whenUserNavigatesBackToPreviousWindow(){
		util.switchToCurrentWindow(0);
	}
	@Then("annotation dialog wouldn't be activated")
	public void thenAnnotationDialogWouldntBeActivated(){
		 //TODO 
		util.wait(1);
	}
	@When("clicks New notes dropdown and select '<Allowed>' option")
	public void whenClicksNewNotesDropdownAndSelectAllowedOption(@Named("Allowed") String option){
		documents.selectNewNotes(option);
	}
	@When("create an annotation by highlighting multiple text")
	public void whenCreateAnAnnotationByHighlightingMultipleText(){
		 //TODO 
		util.wait(1);
	}
	@Then("user should be able to highlight notes and annotation will be activated.")
	public void thenUserShouldBeAbleToHighlightNotesAndAnnotationWillBeActivated(){
		util.wait(1);
	}
	@When("user clicks on Preview '<Document>' again")
	public void whenUserClicksOnPreviewDocumentAgain(@Named("Document")String document){
	    documents.previewDocumentNewTab();
	    util.switchToCurrentWindow(2);
	}
	@When("user enters a '<new_name>' and click Ok")
	public void whenUserEntersAnew_nameAndClickOk(@Named("new_name") String newName){
	    documents.newDocumentName(newName);
	    //documents.pageReload();
	}
	@When("user enters '<previous_name>' and click Ok")
	public void whenUserEntersprevious_nameAndClickOk(@Named("previous_name") String newName){
	    documents.newDocumentName(newName);
	    //documents.pageReload();
	}
	@Then("Document should be rename to '<new_name>'")
	public void DocumentShouldBeRenameTonew_name(@Named("new_name") String newName){ 
		//assert
		util.wait(2);
	}
	@Then("Document should be rename to '<previous_name>'")
	public void DocumentShouldBeRenameToprevious_name(@Named("previous_name") String newName){ 
		//assert
		util.wait(2);
	}
	@Then("document is moved up a space")
	public void thenDocumentIsMovedUpASpace(){
		 //TODO 
	}
	@Then("document is moved down a space")
	public void thenDocumentIsMovedDownASpace(){
		 //TODO 
	}
	@Then("document is moved up 10 spaces")
	public void thenDocumentIsMovedUp10Spaces(){
		 //TODO 
	}
	@Then("document is moved to the bottom of the folder")
	public void thenDocumentIsMovedToTheBottomOfTheFolder(){
		 //TODO 
	}
	@When("user clicks 'Up' button")
	public void whenUserClicksUpButton(){
		 documents.reOrdering("up");
	}
	@When("user clicks 'Top' button")
	public void whenUserClicksTopButton(){
		documents.reOrdering("top");
	}
	@When("user clicks 'Move 10 Down' button")
	public void whenUserClicksMove10DownButton(){
		documents.reOrdering("move10down");
	}
	@When("user clicks on Apply Ordering button")
	public void whenUserClicksOnApplyOrderingButton(){
		documents.applyOrdering();
	}
	@When("OK's alert")
	public void andOKsAlert(){
		documents.acceptAlert();
	}
	@When("user enters '<-x>' and clicks 'X Distance' button")
	public void whenUserEntersMinusxAndClicksXDistanceButton(@Named("-x") String num){
		documents.moveXDistance(num);
		documents.reOrdering("moveXDistance");
	}
	@When("user enters '<+x>' and clicks 'X Distance' button")
	public void whenUserEntersAddxAndClicksXDistanceButton(@Named("+x") String num){
		documents.moveXDistance(num);
		documents.reOrdering("moveXDistance");
	}
	@Then("document is moved to the top of the folder")
	public void thenDocumentIsMovedToTheTopOfTheFolder(){
		util.wait(1);
	}
	@When("user clicks 'Down' button")
	public void whenUserClicksDownButton(){
		documents.reOrdering("down");
	}
	@Then("new order settings is save")
	public void thenNewOrderSettingsIsSave(){
		//assert
		util.wait(1);
	}
	@Then("document is moved up 'x' spaces")
	public void thenDocumentIsMovedUpxSpaces(){
		//assert
		util.wait(1);
	}
	@When("user clicks 'Bottom' button")
	public void whenUserClicksBottomButton(){
		documents.reOrdering("bottom");
	}
	@Then("document is moved down 'x' spaces")
	public void thenDocumentIsMovedDownxSpaces(){
		//assert
		util.wait(1);
	}
	@When("user clicks 'Move 10 Up' button")
	public void whenUserClicksMove10UpButton(){
		documents.reOrdering("move10up");
	}
	@Then("document is moved down 10 spaces")
	public void thenDocumentIsMovedDown10Spaces(){	
		util.wait(1);//assert
	}
	@Then("'<Document>' should be move to '<Destination>' folder")
	public void thenDocumentShouldBeMoveToDestinationFolder(@Named("Document") String document, @Named("Destination") String destination){
		//assert
		documents.pageReload();
		util.wait(2);
	}
	@Then("Sort Order Dialog should be visible")
	public void thenSortOrderDialogShouldBeVisible(){
		util.wait(1);//assert
	}
	@When("user selects '<Manual order>' radio button")
	public void whenUserSelectsManualOrderRadioButton(@Named("Manual order") String option){
		documents.selectSortOrder(option);
	}
	@When("user highlights a '<folder>' and right click to select '<Sort by>' option")
	public void whenUserHighlightsAfolderAndRightClickToSelectSortByOption(@Named("folder") String folder, @Named("Sort by") String option){
		documents.rightClickFolder(folder);
		documents.selectContextOptions(option);
	}
	@When("clicks Save Ordering button and OK's action")
	public void whenClicksSaveOrderingButtonAndOKsAction(){
		documents.sortOrder();
	}
	@Then("document list should be reorder on folder")
	public void thenDocumentListShouldBeReorderOnFolder(){
		util.wait(1);//assert
	}
}
