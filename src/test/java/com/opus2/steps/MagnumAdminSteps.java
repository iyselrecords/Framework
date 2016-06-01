package com.opus2.steps;

import java.awt.AWTException;

import static org.junit.Assert.*;

import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import com.opus2.enums.DocumentOption;
import com.opus2.enums.Pages;
import com.opus2.enums.SideMenu;
import com.opus2.enums.ToolsOption;
import com.opus2.enums.TranscriptOptions;
import com.opus2.enums.UserActivity;
import com.opus2.pages.Admin;
import com.opus2.pages.Chronology;
import com.opus2.pages.Dialog;
import com.opus2.pages.Documents;
import com.opus2.pages.Home;
import com.opus2.pages.Login;
import com.opus2.pages.MyWorkspace;
import com.opus2.pages.Notes;
import com.opus2.pages.OldSearch;
import com.opus2.pages.Search;
import com.opus2.pages.Transcripts;
import com.opus2.pages.UploadDialog;
import com.opus2.pages.UserAction;
import com.opus2.pages.UserWorkspaces;
import com.opus2.util.Constants;
import com.opus2.util.Event;
import com.opus2.util.Util;

import net.serenitybdd.jbehave.SerenityStories;
import net.thucydides.core.annotations.Steps;

public class MagnumAdminSteps extends SerenityStories{	
	@Steps	
	
	static Admin admin;
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
	static Util util;
	Dialog dialog;
	Event event;
	UserAction action;
	
	
	
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
		//admin.goTo();
		action.goTo(Pages.Admin);
	}
	@Then("they should be on Admin page")
	public void thenTheyShouldBeOnAdminPage(){
		//assert
	}
	
	@SuppressWarnings("static-access")
	@When("select '<Destination>' folder and click Apply button")
	public void whenSelectDestinationFolderAndClickApplyButton(@Named("Destination") String searchText){	
		dialog.uploadDestination.find(searchText);
		dialog.uploadDestination.apply();
	}
	@SuppressWarnings("static-access")
	@When("user clicks on Change button")
	public void whenUserClicksOnChangeButton(){
		dialog.newFolder.changeDestination();
	}
	@Then("created folder should be visible Destination folder on workspace")
	public void thenCreatedFolderShouldBeVisibleDestinationFolderOnWorkspace(){
		 //assert
		documents.pageReload();
	}
	@SuppressWarnings("static-access")
	@When("select '<Destination_Folder>' folder and click Apply button")
	public void andSelectDestination_FolderAndClickApplyButton(@Named("Destination_Folder") String folder){
		dialog.uploadDestination.find(folder);		
		dialog.uploadDestination.selectFolder(folder);
		dialog.uploadDestination.apply();
	}
	@Then("selected folder should be set to Destination folder")
	public void thenSelectedFolderShouldBeSetToDestinationFolder(){
		 //assert
		util.wait(1);
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
	@When("user finds a '<doc>' and clicks on it")
	public void whenUserFindsADocAndClicksOnIt(@Named("doc") String document){
		documents.findDocument(document);
		util.wait(1);
		documents.clickDocument(document);
		util.wait(2);
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
	
	@When("user clicks on Preview '<doc>'")
	public void whenUserClicksOnPreviewDocument(@Named("doc")String document){
	    documents.previewDocumentNewTab();
	    action.switchToCurrentWindow(1);
	}
	@Then("a new tab opens with the preview '<doc>'")
	public void thenANewTabOpensWithThePreviewDocument(@Named("doc")String document){
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
		action.acceptAlert();
		util.wait(4);
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
		action.switchToCurrentWindow(0);
	}
	@Then("annotation dialog wouldn't be activated")
	public void thenAnnotationDialogWouldntBeActivated(){
		  
		util.wait(1);
	}
	@When("clicks New notes dropdown and select '<Allowed>' option")
	public void whenClicksNewNotesDropdownAndSelectAllowedOption(@Named("Allowed") String option){
		documents.selectNewNotes(option);
	}
	@When("create an annotation by highlighting multiple text")
	public void whenCreateAnAnnotationByHighlightingMultipleText(){		  
		util.wait(1);
	}
	@Then("user should be able to highlight notes and annotation will be activated.")
	public void thenUserShouldBeAbleToHighlightNotesAndAnnotationWillBeActivated(){
		util.wait(1);
	}
	@When("user clicks on Preview '<Document>' again")
	public void whenUserClicksOnPreviewDocumentAgain(@Named("Document")String document){
	    documents.previewDocumentNewTab();
	    action.switchToCurrentWindow(2);
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
	
	}
	@Then("document is moved down a space")
	public void thenDocumentIsMovedDownASpace(){
	
	}
	@Then("document is moved up 10 spaces")
	public void thenDocumentIsMovedUp10Spaces(){

	}
	@Then("document is moved to the bottom of the folder")
	public void thenDocumentIsMovedToTheBottomOfTheFolder(){
		
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
	
	@When("user clicks on Documents tab")
	public void userClicksOnDocumentsTab(){
		util.wait(0.5);
		documents.browseByTags();
		util.wait(0.5);
		documents.browseByFolder();
		util.wait(0.5);
		documents.showContentOfTrash();
		util.wait(0.5);
		documents.showOrHideAdditonalColumn();
		util.wait(0.5);
		action.findSearch("left-button-row","testDoc50");
		util.wait(0.5);
		documents.reset();
		util.wait(0.5);
		
		documents.filterByTags();
		util.wait(0.5);
		documents.uploadNewDocument();
		util.wait(0.5);
		documents.createNewFolder();
		util.wait(0.5);
		documents.createOrEditTags();
		util.wait(0.5);
		documents.moveFolderOrTags();
		util.wait(0.5);
		documents.snapshotView();
		util.wait(0.5);
		documents.controlsTools();
				
	}
		
	
	@When("user clicks on Transcripts tab")
	public void whenUserClicksOnTranscriptTab(){
		action.goTo(Constants.Transcripts);
		util.wait(1);	
		action.find("docctrls", "Day 2");	
		util.wait(2);
		transcript.clickTranscript();
		transcript.importTranscript();
		util.wait(0.5);
		action.closeDialog("dialogClose-div");
		transcript.editProperties();
	}
	
	@SuppressWarnings("static-access")
	@When("user clicks on Filter tab")
	public void whenUserClicksOnFilterTab(){
		documents.filterByTags();
		dialog.selectDocumentTags.find("tg");
		dialog.selectDocumentTags.selectAll();
		dialog.selectDocumentTags.expand();
		dialog.selectDocumentTags.selectNone();
		dialog.selectDocumentTags.collapse();
		dialog.selectDocumentTags.selectTag();
		dialog.selectDocumentTags.selectDocumentsWithoutTags();
		//dialog.selectDocumentTags.apply();
		//dialog.selectDocumentTags.closeDialog();
		//dialog.selectDocumentTags.close();
	}
	
	@SuppressWarnings("static-access")
	@When("user clicks on Upload tab")
	public void whenUserClicksOnUploadTab(){		
		documents.uploadNewDocument();
		dialog.upload.selectDestination();	
		dialog.uploadDestination.find("TAF");
		//dialog.uploadDestination.closeDialog();
		dialog.uploadDestination.cancel();
		//dialog.upload.closeDialog();	
		dialog.upload.close();
	}
	
	@SuppressWarnings("static-access")
	@When("user clicks on Tags tab")
	public void whenUserClicksOnTagsTab(){		
		documents.createOrEditTags();	
		dialog.manageTags.find("tg");
		dialog.manageTags.selectAll();
		dialog.manageTags.expand();
		dialog.manageTags.selectNone();
		dialog.manageTags.collapse();
		//dialog.manageTags.closeDialog();
		dialog.manageTags.add();
		dialog.newTag.name("mt2");
		dialog.newTag.nestUnder("bdd");
		dialog.newTag.save();
		dialog.newTag.cancel();
		dialog.manageTags.add();
		dialog.newTag.cancel();
		dialog.manageTags.close();
	}
	
	@SuppressWarnings("static-access")
	@When("user clicks on Transcripts tab two")
	public void whenUserClicksOnTranscriptsTabTwo(){		
		dialog.selectDocumentTags.find("tg");
		//util.findSearch("category-filter", "tg");	
	}
	@When("user clicks on Transcripts tab three")
	public void whenUserClicksOnTranscriptsTabThree(){
		//documents.dialog.closeDialog();
		//documents.dialog.selectDocumentTags.closeDialog();
		//util.closeDialog("category-filter dialogClose-div");
		documents.snapshotView();
	}	
	@When("user clicks on Transcripts tab four")
	public void whenUserClicksOnTranscriptsTabFour(){
		
	}
	@When("user clicks on Transcripts tab five")
	public void whenUserClicksOnTranscriptsTabFive(){

	}
	@When("user clicks on Transcripts tab six")
	public void whenUserClicksOnTranscriptsTabSix(){
		
	}
	
	@SuppressWarnings("static-access")
	@When("clicks on the folder icon")
	public void whenClicksOnTheFolderIcon(){
		dialog.upload.selectDestination();
	}
	@Then("Destination should be set to <'Destination_Folder'>")
	public void thenDestinationShouldBeSetToDestination_Folder(){
		 //assert
	}
	@Then("Upload Destination Dialog should be visible")
	public void thenUploadDestinationDialogShouldBeVisible(){
		 //asserts
	}
	@SuppressWarnings("static-access")
	@When("user clicks on Select Files button")
	public void whenUserClicksOnSelectFilesButton(){
		dialog.upload.selectFiles();
	}
	@SuppressWarnings("static-access")
	@When("select <'document'> to upload into the Windows OpenDialogue box")
	public void whenSelectdocumentToUploadIntoTheWindowsOpenDialogueBox(@Named("document") String file) throws AWTException{
		 dialog.upload.selectFiles(file);
	}
	@SuppressWarnings("static-access")
	@When("select <'Destination_Folder'> and click on apply")
	public void whenSelectDestination_FolderAndClickOnApply(@Named("Destination_Folder") String folder){
		dialog.uploadDestination.selectFolder(folder);
		dialog.uploadDestination.apply();
	}
	@SuppressWarnings("static-access")
	@When("user search for <'Destination_Folder'>")
	public void whenUserSearchForDestination_Folder(@Named("Destination_Folder") String folder){
		 dialog.uploadDestination.find(folder);
	}
	
	@SuppressWarnings("static-access")
	@When("clicks on upload button")
	public void whenClicksOnUploadButton(){
		dialog.upload.upload();
	}
	
	@SuppressWarnings("static-access")
	@When("Move 10 Up button")
	public void whenMove10UpButton(){
		dialog.reOrder.click(Constants.Move10Up);
	}
	@SuppressWarnings("static-access")
	@When("user select <'Manual Order'> checkbox")
	public void whenUserSelectManualOrderCheckbox(){
        dialog.sortOrder.select(Constants.ManualOrder);
	}
	@SuppressWarnings("static-access")
	@When("save ordering and confirm change")
	public void whenSaveOrderingAndConfirmChange(){
        dialog.sortOrder.SaveOrdering();
        action.confirm("OK"); 
	}
	@SuppressWarnings("static-access")
	@When("enters <'X'> on Distance input and clicks on the X Distance button")
	public void whenEntersXOnDistanceInputAndClicksOnTheXDistanceButton(@Named("X") String x){
		dialog.reOrder.click(Constants.XDistance);
	}
	@SuppressWarnings("static-access")
	@When("user clicks on Up button")
	public void whenUserClicksOnUpButton(){
		dialog.reOrder.click(Constants.Up);
	}
	@SuppressWarnings("static-access")
	@When("Top button")
	public void whenTopButton(){
		dialog.reOrder.click(Constants.Top);
	}
	@SuppressWarnings("static-access")
	@When("clicks on Apply Ordering button and confirm OK")
	public void whenClicksOnApplyOrderingButtonAndConfirmOK(){
		dialog.reOrder.applyOrdering();
	}
	@SuppressWarnings("static-access")
	@When("Down button")
	public void whenDownButton(){
		dialog.reOrder.click(Constants.Down);
	}
	@SuppressWarnings("static-access")
	@When("Bottom button")
	public void whenBottomButton(){
		dialog.reOrder.click(Constants.Bottom);
	}
	@SuppressWarnings("static-access")
	@When("Move 10 Down button")
	public void whenMove10DownButton(){
		dialog.reOrder.click(Constants.Move10Down);
	}

	@Then("the ReOrder Dialog should be visible")
	public void thenTheReOrderDialogShouldBeVisible(){
		 util.wait(1);
	}
	@Then("the Sort By Dialog should be visible")
	public void thenTheSortByDialogShouldBeVisible(){
		 util.wait(1);
	}
	@When("user rightclick on <'folder'>")
	public void whenUserRightclickOnFolder(@Named("folder") String directory){
		 documents.rightClickFolder(directory);
	}
	@When("user rightclick on <'document'> inside <'folder'>")
	public void whenUserRightclickOnDocumentInsideFolder(@Named("document") String doc, @Named("folder") String folder){
		documents.rightClickDocument(folder, doc); 
	}
	@Then("document should retain current order settings")
	public void thenDocumentShouldRetainCurrentOrderSettings(){
		 util.wait(1);
	}
	@When("select <'Sort by'> option")
	public void whenSelectSortByOption(@Named("Sort by") String sortBy){
		documents.selectContextOptions(sortBy);
	}
	@Then("documents should be reorder")
	public void thenDocumentsShouldBeReorder(){
		 util.wait(1);
	}
	@When("select <ReOrder> option")
	public void whenSelectReOrderOption(){
        documents.selectContextOptions(Constants.ReOrder);
        action.acceptAlert();
	}
	
	@When("user find a <'docs'> selects and rightclick on it")
	public void whenUserFindAdocsSelectsAndRightclickOnIt(@Named("docs") String file){
		 documents.findDocument(file);
		 documents.rightClick(file);
	}
	@When("select <'Rotate'> option")
	public void whenSelectRotateOption(@Named("Rotate") String file){
		documents.selectContextOptions(Constants.Rotate);
	}
	@Then("Page Rotation Dialog should be visible")
	public void thenRotationDialogshouldbeVisible(){
		util.wait(1);
	}
	@SuppressWarnings("static-access")
	@When("user select from <'start_page'> to <'end_page'>")
	public void whenUserSelectFromstart_pageToend_page(@Named("start_page") String start,@Named("end_page") String end){
		 dialog.pageRotation.rotatePages(start);
         dialog.pageRotation.to(end);
         dialog.pageRotation.rotation(Constants._270);
	}
	@When("set Rotation to <'rotate_degree'>")
	public void whenSetRotationTorotate_degree(){
		
	}
	@SuppressWarnings("static-access")
	@When("click on apply button")
	public void whenClickOnApplyButton(){
		dialog.pageRotation.apply();
	}
	@Then("pages within <'start_page'> to <'end_page'> should rotate to <'rotate_degree'>")
	public void thenPagesWithinstart_pageToend_pageShouldRotateTorotate_degree(@Named("start_page") String start,@Named("end_page") String end,@Named("rotate_degree") String rotate){
		util.wait(1);
	}
	@When("preview <next_six> pages")
	public void whenPreviewnext_sixPages(@Named("next_six") int page){
		 documents.previewNext(page);
	}
	@When("clicks to preiview <'start_page'>")
	public void whenClicksToPreiviewstart_page(@Named("start_page") String page){
		documents.previewSelectedPage(page);
	}
	
	@When("user reload the page")
	public void whenUserReloadThePage(){
		action.reloadPage();
	}
	@When("finds <'docs'> and click on <'docs'>")
	public void whenFindsdocumentAndClickOndocument(@Named("docs") String file){
		 documents.findDocument(file);
		 util.wait(2);
		 documents.clickDocument(file);
		 util.wait(1);
	}
		
	@When("user navigate to Admin page")
	public void whenUserNavigateToAdminPage(){
		action.goTo(Constants.Admin);
	}
	
	@When("clicks Metadata on the SideMenu")
	public void andClicksMetadataOnTheSideMenu(){		
		admin.select(SideMenu.Metadata);		
	}
	
	@Then("Documents Types and Metadata tables should be visible")
	public void thenDocumentsTypesAndMetadataTablesShouldBeVisible(){
		util.wait(1);
	}

	@When("user selects a '<docType>' and clicks on the Edit button")
	public void whenUserSelectsADocTypeAndClicksOnTheEditButton(@Named("docType") String docType){
		event.editDocumentType(docType);
	}
	
	@Then("Document Types Dialog should be visible")
	public void thenDocumentTypesDialogShouldBeVisible(){
		util.wait(5);
	}
	
	@When("user edit any field and values")
	public void whenUserEditAnyFieldAndValues(){
		System.out.println("clicks on the Edit button");
	}
		
	@When("click on Document Type Apply button")
	public void andClickOnDocumentTypeApplyButton(){
		System.out.println("clicks on the Edit button");
	}
	
	@Then("Fileds and values should be updated in Document Type table and across Magnum")
	public void thenFiledsAndValuesShouldBeUpdatedInDocumentTypeTableAndAcrossMagnum(){
		System.out.println("Fileds and values should be updated in Document Type table and across Magnum");
	}
		
	@When("user selects a '<docType>' and clicks on the X button")
	public void whenUserSelectsAdocTypeAndClicksOnTheXButton(@Named("docType") String docType){
		util.wait(0.5);
		event.delete(docType);
	}
	@Then("a prompt should be visible with message Really delete '<docType>'")
	public void thenAPromptShouldBeVisibleWithMessageReallyDeletedocType(){
		util.wait(0.5);
	}
	@When("user clicks OK to confirm")
	public void whenUserClicksOKToConfirm(){
		action.acceptAlert();
	}
	@Then("Document TYpe is removed from both Document Type table and Magnum")
	public void thenDocumentTYpeIsRemovedFromBothDocumentTypeTableAndMagnum(){
		util.wait(0.5);
	}
	
	@When("user clicks on the New Document Type button")
	public void whenUserClicksOnTheNewDocumentTypeButton(){
		 event.newDocumentType();
	}
	@Then("the New Document Type Dialog should be visible")
	public void thenTheNewDocumentTypeDialogShouldBeVisible(){
		util.wait(0.5);
	}
	@When("user enters '<newDocType>' details and clicks the Apply button")
	public void whenUserEntersDocumentTypesDetailsAndClicksTheApplyButton(@Named("newDocType") String newDoc){
		event.enterDocumentTypeDetails(newDoc,"Description");
		util.wait(1);
		action.clickAction("doc-type_Apply");
	}
	@Then("new Document Type should be added to the Document Type table")
	public void thenNewDocumentTypeShouldBeAddedToTheDocumentTypeTable(){
		util.wait(0.5);
	}
	@When("user clicks on Add New Column button")
	public void whenUserClicksOnAddNewColumnButton(){
		 event.addNewColumnButton();
	}
	@When("add Custom Field Label")
	public void whenAddCustomFieldLabel(){
		event.customFieldLabel();
	}
	@When("Custom Field Name")
	public void whenCustomFieldName(){
		event.customFieldName();
	}
	@When("clicks the Apply button")
	public void whenClicksTheApplyButton(){
		action.clickAction("custom-field_Apply");
	}
	@Then("the new Metadata should added to Metadata table")
	public void thenTheNewMetadataShouldAddedToMetadataTable(){
		util.wait(0.5);	
	}
	
	
	//Admin_90
	@Then("user should be directed to Import PTF Annotation page")
	public void thenUserShouldBeDirectedToImportPTFAnnotationPage(){
		util.wait(1);	
	}
	@When("clicks 'share annotations' dropdown and select '<shareAnnotation>' option")
	public void whenClicksshareAnnotationsDropdownAndSelectshareAnnotationOption(@Named("shareAnnotation") String option){
		transcript.shareAnnotation(option);
	}
	@When("select '<testTranscripts>' Transcript")
	public void whenSelecttestTranscriptsTranscript(@Named("testTranscripts") String file){
		transcript.select(file);
	}
	@When("select '<testTranscripts2>' Transcript")
	public void whenSelecttestTranscripts2Transcript(@Named("testTranscripts2") String file){
		transcript.select(file);
	}
	@When("select Import Annotations option")
	public void whenSelectImportAnnotationsOption(){
		transcript.select(TranscriptOptions.ImportAnnotations);
	}
	@When("user select clicks 'sign annotations as' dropdown and select '<signAs>' option")
	public void whenUserSelectClickssignAnnotationsAsDropdownAndSelectsignAsOption(@Named("signAs") String option){
		transcript.signAnnotationsAs(option);
	}
	@When("user navigates to Transcript page")
	public void whenUserNavigatesToTranscriptPage(){
		 action.goTo(Pages.Transcripts);
	}
	@When("user click on Tools dropdown")
	public void whenUserClickOnToolsDropdown(){
		transcript.clickToolDropdown();
	}
	@When("click on '<testTranscripts>' Transcript")
	public void whenClickOntestTranscriptsTranscript(@Named("testTranscripts") String file){
		transcript.clickPreview(file);
		action.switchToCurrentWindow(1);
	}
	@When("click on '<testTranscripts2>' Transcript")
	public void whenClickOntestTranscripts2Transcript(@Named("testTranscripts2") String file){
		transcript.clickPreview(file);
		action.switchToCurrentWindow(1);
	}
	@Then("file should be attached to page")
	public void thenFileShouldBeAttachedToPage(){
		util.wait(1);
	}
	@When("click on Import button")
	public void whenClickOnImportButton(){
		transcript.Import();
		action.acceptAlert();
	}	
	@Then("'<testTranscripts>' should open in a new tab")
	public void thentestTranscriptsShouldOpenInANewTab(){
		util.wait(1);
	}
	@Then("'<testTranscripts2>' should open in a new tab")
	public void thentestTranscriptsShouldOpenInANewTab2(){
		util.wait(1);
	}
	@Then("Annotation should be imported to '<testTranscripts>'")
	public void thenAnnotationShouldBeImportedTotestTranscripts(){
		util.wait(1);
	}
	@When("user click on Choose File input and select '<ptfFile>' file")
	public void whenUserClickOnChooseFileInputAndSelectptfFileFile(@Named("ptfFile") String file){
		transcript.selectFile(file);
	}
	
	//Admin_91
	@When("select Replace Transcript option")
	public void whenSelectReplaceTranscriptOption(){
		transcript.select(TranscriptOptions.ReplaceTranscript);
	}
	@When("click the Replace button")
	public void whenClickTheReplaceButton(){
		 action.clickAction("replace-transcript_Replace");
	}
	@Then("annotations, designations or video appear should be visible on new transcript")
	public void thenAnnotationsDesignationsOrVideoAppearShouldBeVisibleOnNewTranscript(){
		 transcript.progressBar(17);
		 action.confirm("OK");
	}
	@When("user select '<ptfFile2>' Transcript")
	public void whenUserSelectPtfFile2Transcript(@Named("ptfFile2") String file){
		transcript.selectFile("Mainholder",file);
	}
	@Then("Replace Transcript Dailog should be visible")
	public void thenReplaceTranscriptDailogShouldBeVisible(){
		util.wait(1);
	}
	
	//Admin_92
	@When("select Timecodes option")
	public void andSelectTimecodesOption(){
		transcript.select(TranscriptOptions.Timecodes);
	}
	@When("user clicks on Cancel button")	
	public void whenUserClicksOnCancelButton(){
		action.clickAction("DOMadditions","dialogFoot", "button", 0);
	}
	@Then("video should play")	
	public void thenVideoShouldPlay(){
		util.wait(1);
	}
	@When("user click on the Play button")	
	public void whenUserClickOnThePlayButton(){
		action.clickAction("DOMadditions","dialogBody", "button", 0);
		action.confirm("OK");
	}
	@Then("Video Timecode Correction Dailog should be visible")	
	public void thenVideoTimecodeCorrectionDailogShouldBeVisible(){
		util.wait(1);
	}
	@Then("Video Timecode Correction Dialog should exit")	
	public void thenVideoTimecodeCorrectionDialogShouldExit(){
		
	}
	
	//Admin_93
	@Then("Ready Dialog should exit")
	public void thenReadyDialogShouldExit(){
		util.wait(1);
	}
	@When("select Export With Timestamps option")
	public void andSelectExportWithTimestampsOption(){
		transcript.select(TranscriptOptions.ExportWithTimestamps);
		util.wait(4);
	}
	@Then("Ready Dailog should be visible")
	public void thenReadyDailogShouldBeVisible(){
		util.wait(1);
	}
	@When("user clicks on Close button")
	public void whenUserClicksOnCloseButton(){
		action.clickAction("DOMadditions","dialogFoot", "button", 0);
	}
	
	//Admin_94
	@Then("Attach Video Dailog should be visible")
	public void thenAttachVideoDailogShouldBeVisible(){
		util.wait(1);
	}
	@When("select Upload Video option")
	public void whenSelectUploadVideoOption(){
		transcript.select(TranscriptOptions.UploadVideo);
	}
	@When("select '<mdb>' file")
	public void whenSelectMDBFile(@Named("mdb") String file){
		transcript.selectMDBFile(file);
		transcript.selectVideoFile("vid.mpeg");
	}
	@When("select '<mdb>' and '<videoFile>' files")
	public void andSelectMDBAndVideoFileFiles(@Named("mdb") String file,@Named("videoFile") String videoFile){
		transcript.selectMDBFile(file);
		transcript.selectVideoFile(videoFile);
	}
	@When("user select 'Use MDB sync file' option")
	public void whenUserSelectUseMDBSyncFileOption(){
		transcript.useMDBSyncFile();
	}
	@When("click the Upload button")
	public void whenClickTheUploadButton(){
		action.clickAction("DOMadditions", "dialogFoot", "button", "Upload");
		util.wait(10);
	}
	@Then("Video should be attach to Transcript")
	public void thenVideoShouldBeAttachToTranscript(){
		util.wait(1);
	}
	
	
	//DesigningInProgress
	
	@Then("'<testTranscripts>' Transcript is filtered and displayed on preview pane")
	public void thentestTranscriptsTranscriptIsFilteredAndDisplayedOnPreviewPane(@Named("testTranscripts") String file){
		util.wait(1);
		action.clearText("docctrls");
	}
	@When("user clicks on 'Edit Transcript Properties' tab")
	public void whenUserClicksOnEditTranscriptPropertiesTab(){
		transcript.editProperties();
	}
	@When("user clicks on 'Import Transcript' tab")
	public void whenUserClicksOnImportTranscriptTab(){
		transcript.importTranscript();
	}
	@Then("the Import Transcript Dialog should be visible")
	public void thenTheImportTranscriptDialogShouldBeVisible(){
		util.wait(1);
		action.closeDialog("DOMadditions", "Import Transcript");
	}
	@When("user input '<testTranscripts>' on Find input box")
	public void whenUserInputtestTranscriptsOnFindInputBox(@Named("testTranscripts") String file){
		transcript.find(file);
	}
	@Then("the Edit Transcript Dialog should be visible")
	public void thenTheEditTranscriptDialogShouldBeVisible(){
		util.wait(1);
		action.closeDialog("DOMadditions", "Edit Transcript");
	}
	
	@When("user selects page <pageNum>")
	public void whenUserSelectsPagepageNum(@Named("pageNum") int page){
		 transcript.previewSelectedPage(page);
	}
	@When("user clicks the Previous (<) button")
	public void andUserClicksThePreviousButton(){
		transcript.previewPrevious();
	}
	@Then("Next page should be visible")
	public void thenNextPageShouldBeVisible(){
		util.wait(1);
	}
	@Then("page <pageNum> should be visible on preview")
	public void thenPagepageNumShouldBeVisibleOnPreview(){
		util.wait(1);
	}
	@Then("Previous page should be visible")
	public void thenPreviousPageShouldBeVisible(){
		util.wait(1);
	}
	@When("user clicks the Next (>) button")
	public void andUserClicksTheNextButton(){
		transcript.previewNext();
	}
	
		
	
	@When("user clicks on (+) button")
	public void whenUserClicksOnAddButton(){
		transcript.textLarger(3);
	}
	@Then("Transcript text should be larger")
	public void thenTranscriptTextShouldBeLarger(){
		util.wait(1);
	}
	@When("user clicks on (-) button")
	public void whenUserClicksOnButton(){
		transcript.textSmaller(2);
	}
	@Then("Transcript text should be smaller")
	public void thenTranscriptTextShouldBeSmaller(){
		util.wait(1);
	}
	@When("user clicks on Manage tag button")
	public void whenUserClicksOnManageTagButton(){
		transcript.manageTags();
	}
	@Then("Manage Tags Dialog should be visible")	
	public void thenManageTagsDialogShouldBeVisible(){
		util.wait(1);
		action.closeDialog("DOMadditions", "Manage Tags");
	}
	@When("user clicks on Designations button")
	public void whenUserClicksOnDesignationsButton(){
		transcript.manageDesignations();
	}
	@Then("Designations Dialog should be visible")	
	public void thenDesignationsDialogShouldBeVisible(){
		util.wait(1);
		action.closeDialog("DOMadditions", "Manage Designations and Comments");
	}
	
	@When("user clicks on Transcript List button")
	public void whenUserClicksOnTranscriptListButton(){
		transcript.showTrascriptLists();
	}
	@Then("dropdown displays list of Transcript")
	public void thenDropdownDisplaysListOfTranscript(){
		util.wait(1);
	}
	@When("user select '<testTranscripts2>' from list")
	public void whenUserSelecttestTranscripts2FromList(@Named("testTranscripts2") String file){
		transcript.selectTranscriptFromList(file);
		action.switchToCurrentWindow(1);
	}
	
	@Then("'<testTranscripts2>' is open in a new tab")
	public void thentestTranscripts2IsOpenInANewTab(){
		util.wait(1);
	}

	@When("user clicks on 'Toggle Designations' button")	
	public void whenUserClicksOnToggleDesignationsButton(){
		transcript.toggleDesignationsFromWall();
	}
	@When("user clicks on 'Toggle Notes' button")	
	public void whenUserClicksOnToggleNotesButton(){	
		transcript.toggleNotesFromWall();
	}
	@When("user clicks on 'Toggle Linked Documents' button")	
	public void whenUserClicksOnToggleLinkedDocumentsButton(){
		transcript.toggleLinkedDocumentsFromWall();
	}
	
	@Then("notes should not be visible on Wall")	
	public void thenNotesShouldNotBeVisibleOnWall(){
		util.wait(1);
	}
	@Then("designations should not be visible on Wall")	
	public void thenDesignationsShouldNotBeVisibleOnWall(){
		util.wait(1);
	}
	@Then("linked documents should not be visible on Wall")
	public void thenLinkedDocumentsShouldNotBeVisibleOnWall(){
		util.wait(1);
	}
	
	@Then("notes should be visible on Wall")
	public void thenNotesShouldBeVisibleOnWall(){
		util.wait(1);
	}
	@Then("linked documents should be visible on Wall")
	public void thenLinkedDocumentsShouldBeVisibleOnWall(){
		util.wait(1);
	}
	@When("user toggle between buttons to display 'Linked Documents'")
	public void whenUserToggleBetweenButtonsToDisplayLinkedDocuments(){
		transcript.toggleBetweenButtons("Linked Documents");
	}
	@When("user toggle between buttons to display 'Designations'")
	public void whenUserToggleBetweenButtonsToDisplayDesignations(){
		transcript.toggleBetweenButtons("Designations");
	}
	@When("user toggle between buttons to display 'Notes'")
	public void whenUserToggleBetweenButtonsToDisplayNotes(){
		transcript.toggleBetweenButtons("Notes");
	}
	@Then("designations should be visible on Wall")
	public void thenDesignationsShouldBeVisibleOnWall(){
		util.wait(1);
	}
	
	@When("user clicks on dropdown")
	public void whenUserClicksOnDropdown(){
		transcript.dropdown();
	}
	@Then("list of Transcript on the workspace is displayed")
	public void thenListOfTranscriptOnTheWorkspaceIsDisplayed(){
		transcript.displaysListOfTranscript();
	}
	
	
	
	//Admin_38
	@SuppressWarnings("static-access")
	@When("they enter an '<email>' into the Email Section.")
	public void whenTheyEnterAnEmailIntoTheEmailSection(@Named("email") String email){
		dialog.addUsers.email(email);
	}
	@SuppressWarnings("static-access")
	@When("they click Invite")
	public void whenTheyClickInvite(){
		//dialog.addUsers.invite();
	}
	@When("clicks the Users Tab")
	public void whenClicksTheUsersTab(){
		admin.select(SideMenu.Users);
	}
	@Then("the user receives an email invitation.")
	public void thenTheUserReceivesAnEmailInvitation(){
		util.wait(3);
	}
	
	@When("the user clicks the Email section.")
	public void whenTheUserClicksTheEmailSection(){
		
	}
	@Then("the Users Tab is opened")
	public void thenTheUsersTabIsOpened(){
		util.wait(1);
	}
	
	//Admin_39
	@When("the user enters a First Name")
	public void whenTheUserEntersAFirstName(){
		
	}
	@Then("they should be on Home page")
	public void thenTheyShouldBeOnHomePage(){
	
	}
	@When("enters a memorable word")
	public void whenEntersAMemorableWord(){
	
	}
	@When("confirms the password")
	public void whenConfirmsThePassword(){
	
	}
	@When("enters a Last Name")
	public void whenEntersALastName(){
	
	}
	@Then("they should be on the Registration page")
	public void thenTheyShouldBeOnTheRegistrationPage(){
	
	}
	@Then("they should be on the Terms and Conditions Page")
	public void thenTheyShouldBeOnTheTermsAndConditionsPage(){
	
	}
	@When("selects a Security Question")
	public void whenSelectsASecurityQuestion(){
	
	}
	@When("confirms the memorable word")
	public void whenConfirmsTheMemorableWord(){
	
	}
	@When("enters a password")
	public void whenEntersAPassword(){
	
	}
	@When("clicks Create Account")
	public void whenClicksCreateAccount(){
	
	}
	@When("enters a Security Answer ")
	public void whenEntersASecurityAnswer(){
	
	}
	@When("the user clicks Accept")
	public void whenTheUserClicksAccept(){
	
	}
	@When("user clicks on the email invitation")
	public void whenUserClicksOnTheEmailInvitation(String opus2korg){
		event.logout();
		event.navigateTo("https://mailinator.com/inbox2.jsp?public_to=opus2korg3"+ opus2korg);
	}
	
	//Admin_40
	@Then("the table should change to display that information (edited)")
	public void thenTheTableShouldChangeToDisplayThatInformationedited(){
		util.wait(1);
	}
	@Then("the Monitor Activity page is opened")
	public void thenTheMonitorActivityPageIsOpened(){
		util.wait(1);
	}
	@When("clicks the Monitor Activity link")
	public void whenClicksTheMonitorActivityLink(){
		admin.select(SideMenu.MonitorActivity);
	}
	@SuppressWarnings("static-access")
	@When("the user clicks the Show Activity For links")
	public void whenTheUserClicksTheShowActivityForLinks(){
		admin.monitorActivity.show(UserActivity._24hours);
		admin.monitorActivity.show(UserActivity._30days);
		admin.monitorActivity.show(UserActivity._30mins);
		admin.monitorActivity.show(UserActivity._7days);
		admin.monitorActivity.show(UserActivity._3hours);
	}
	
	@Then("user should be in Documents page")
	public void thenUserShouldBeInDocumentsPage(){
		util.wait(1); 
	}
	
	
	//Admin_084
	@When("user select Upload Manager from Tools dropdown")
	public void whenUserSelectUploadManagerFromToolsDropdown(){
		documents.select(ToolsOption.UploadManager);
	}
	@Then("Upload Manager should be open in a new tab displaying all recent uploads")
	public void thenUploadManagerShouldBeOpenInANewTabDisplayingAllRecentUploads(){
		assertTrue(true);
		util.wait(2);
	}
	//Admin_085
	@When("user select Export Manager from Tools dropdown")
	public void whenUserSelectExportManagerFromToolsDropdown(){
		documents.select(ToolsOption.ExportManager);
	}
	@Then("Export Manager should be open in a new tab displaying files to download")
	public void thenExportManagerShouldBeOpenInANewTabDisplayingFilesToDownload(){
		assertTrue(true);
		util.wait(2);
	}
	
	//Admin_086
	@When("user select Video Exports from Tools dropdown")
	public void whenUserSelectVideoExportsFromToolsDropdown(){
		documents.select(ToolsOption.VideoExports);
	}
	@Then("Video Exports should be open in a new tab displaying files to export")
	public void thenVideoExportShouldBeOpenInANewTabDisplayingFilesToExport(){
		assertTrue(true);
		util.wait(2);
	}
	
	//Admin_87a	
	@SuppressWarnings("static-access")
	@When("user creates a '<doc_fol>'")
	public void whenUserCreatesAdoc_fol(@Named("doc_fol")String folder){
		documents.newFolder();
		dialog.newFolder.enterFoldersName(folder);
		dialog.newFolder.createFolder();
	}
	@SuppressWarnings("static-access")
	@When("upload a '<doc>' into '<doc_fol>'")	
	public void andUploadAdocIntodoc_fol(@Named("doc") String doc, @Named("doc_fol") String folder) throws AWTException{
		documents.uploadDocument();
		
		dialog.upload.selectDestination();
		dialog.uploadDestination.find(folder);
		dialog.uploadDestination.selectFolder(folder);
		dialog.uploadDestination.apply();
		
		dialog.upload.selectFiles();
		dialog.upload.selectFiles(doc);
		dialog.upload.upload();
		dialog.upload.close();
		
	}
	@Then("'<doc>' should be uploaded to '<doc_fol>'")
	public void thendocShouldBeUploadedTodoc_fol(){
		util.wait(1);
	}
	
	//
	@When("user select '<doc>'")
	public void whenUserSelectDoc(@Named("doc") String doc){
		documents.findDocument(doc);
		
	}

	@When("rightclick '<doc>' and select Properties")
	public void andRightclickDocAndSelectProperties(@Named("doc") String doc){
		documents.rightClick(doc);
		documents.selectContextOptions(DocumentOption.Properties);
		util.wait(1);
	}
	
	@SuppressWarnings("static-access")
	@When("user select Document type")	
	public void whenUserSelectDocumentType(){
		dialog.properties.type("Document");
	}
	@SuppressWarnings("static-access")
	@When("input date")
	public void whenInputDate(){
		dialog.properties.inputDate("05/30/2016");
	}
	@SuppressWarnings("static-access")
	@When("apply to '<doc>'")	
	public void whenApplyTodoc(){
		dialog.properties.apply();
	}
	@Then("date metadata in inputted to '<doc>'")	
	public void thenDateMetadataInInputtedTodoc(){
		util.wait(2);
	}
}
