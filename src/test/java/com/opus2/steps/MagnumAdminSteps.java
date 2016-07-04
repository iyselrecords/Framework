package com.opus2.steps;

import java.awt.AWTException;
import java.io.IOException;

import static org.junit.Assert.*;
import net.thucydides.core.steps.ScenarioSteps;

import org.jbehave.core.annotations.Alias;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import com.opus2.enums.DocumentOption;
import com.opus2.enums.MetadataOption;
import com.opus2.enums.Pages;
import com.opus2.enums.SideMenu;
import com.opus2.enums.ToolsOption;
import com.opus2.enums.UserActivity;
import com.opus2.pages.Admin;
import com.opus2.pages.Dialog;
import com.opus2.pages.Documents;
import com.opus2.pages.Home;
import com.opus2.pages.LoginPage;
import com.opus2.pages.Mailinator;
import com.opus2.pages.Transcripts;
import com.opus2.pages.UserAction;
import com.opus2.util.Util;

public class MagnumAdminSteps extends ScenarioSteps  {
	Util util;
	Home home;
	Documents document;
	UserAction user;
	Admin admin;
	Dialog dialog;
	LoginPage loginPage;
	Transcripts transcript;
	Mailinator mail;
	/**
	 * 
	 */
	
	//Homepage
	
	
	
	private static final long serialVersionUID = 1L;

	@Given("the user is on homepage")
	public void givenTheUserIsOnHomepage(){
		util.pause(0.5);
	}	
	@When("user select '$wk' workspace")
	public void whenUserSelectWorkspace(String wk){
		home.findCase(wk);
		home.selectWorkspace(wk);
	}
	@Then("user should be on the Documents page")
	public void thenUserShouldBeOnTheDocumentsPage(){
		util.pause(1);
	}
	
	//Document Page
	@Given("the user is on Documents page")
	public void givenTheUserIsOnDocumentsPage(){
		util.pause(0.5);
	}
		
	//Admin_02
	//@When("user navigates to Admin page")
	//@Alias("user click the Admin tab")
	//public void whenUserNavigatesToAdminPage(){
	//	user.goTo(Pages.Admin);
	//}
	
	@When("user navigates to $Page page")
	@Alias("user click the $Page tab")
	public void whenUserGoToAdminPage(Pages page){
		user.goTo(page);
	}
	
	@When("clicks on 'Manage Workspaces' link")	
	public void andClicksOnManageWorkspacesLink(){
		admin.select(SideMenu.ManageWorkspaces);
	}
	@Then("user is directed to Workspace Management page")
	public void thenUserIsDirectedToWorkspaceManagementPage(){
		util.pause(1);
	}
	@When("clicks on 'Most Menu' links")	
	public void andClicksOnMostMenuLinks(){
		admin.select(SideMenu.Roles );
		admin.select(SideMenu.Users);
		admin.select(SideMenu.Groups);
		admin.select(SideMenu.Settings);
	}
	
	@When("user clicks on Admin Tab")
	public void whenUserClicksOnAdminTab(){
		user.goTo(Pages.Admin);
	}
	@Then("the Monitor Activity page is opened")
	public void thenTheMonitorActivityPageIsOpened(){
		util.pause(1);
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
	@Then("the table should change to display that information (edited)")
	public void thenTheTableShouldChangeToDisplayThatInformationedited(){
		util.pause(1);
	}
	
	
	//Admin_055
	@When("user select a '<doc>', rightclick")
	public void whenUserSelectAdocRightclick(@Named("doc") String file){
		document.rightClick(file);
	}
	@When("select Replace option")
	public void whenSelectReplaceOption(){
		document.selectContextOptions(DocumentOption.Replace);
	}	
	@SuppressWarnings("static-access")
	@When("choose a '<rep_doc>'")
	public void whenChooseArep_doc(@Named("rep_doc") String file){
		dialog.replaceDocument.chooseFile(file + ".pdf");
	}
	@SuppressWarnings("static-access")
	@When("click Next")
	public void whenClickNext(){
		dialog.replaceDocument.next();
	}
	@When("wait for progress bar")
	public void andWaitForProgressBar(){
		//util.pause(5);
		//user.progressBar2();
	}
	@SuppressWarnings("static-access")
	@When("click Replace")
	public void whenClickReplace(){
		dialog.replaceDocument.replace();
	}
	@SuppressWarnings("static-access")
	@When("close the Dialog and refresh page")
	public void andCloseTheDialogAndRefreshPage(){
		dialog.replaceDocument.close();
	}
	@Then("'<doc>' should replaced by '<rep_doc>'")
	public void thendocShouldReplacedByrep_doc(@Named("doc") String file,@Named("rep_doc") String rep){
		util.pause(2);
	}	
	
	//Admin_056
	@When("user select Bulk Organize option from Tool dropdown")	
	public void whenUserSelectBulkOrganizeOptionFromToolDropdown(){
		document.select(ToolsOption.BulkOrganize);
	}
	@SuppressWarnings("static-access")
	@When("find bulk documents '<bulk_doc>', '<bulk_doc2>' and '<bulk_doc3>'")	
	public void andFindBulkDocumentsToOrganise(@Named("bulk_doc") String doc,@Named("bulk_doc2") String doc2,@Named("bulk_doc3") String doc3){
		dialog.bulkOrganize.findDocument(doc,doc2,doc3);
	}
	@SuppressWarnings("static-access")
	@When("select '<tag>'")	
	public void andSelectTag(@Named("tag") String tag){
		dialog.bulkOrganize.selectTag();
		dialog.selectDocumentTags.chooseTag(tag);
		dialog.selectDocumentTags.apply();
	}
	@SuppressWarnings("static-access")
	@When("and apply tag to document")	
	public void andApplyTagToDocument(){		
		dialog.bulkOrganize.applyTag();
	}
	@SuppressWarnings("static-access")
	@Then("documents are organise in a selected folder")	
	public void thenDocumentsAreOrganiseInASelectedFolder(){
		dialog.bulkOrganize.close();
		user.reloadPage();
		document.expandFolder("TestDocs");
		util.pause(2);
	}
	@SuppressWarnings("static-access")
	@When("select '<bulk_fol>' to move document")	
	public void andSelectBulkFolToMoveDocument(@Named("bulk_fol") String folder){
		dialog.bulkOrganize.selectFolder();
		util.pause(1);
		dialog.selectADocument.selectFolder(folder);
	}
	@SuppressWarnings("static-access")
	@When("move document")	
	public void whenMoveDocument(){
		dialog.bulkOrganize.moveDocuments();
	}
	
	
	
	//Admin_083
	@When("user navigate to Admin page")
	public void whenUserNavigateToAdminPage(){
		user.goTo(Pages.Admin);
	}
	@When("clicks on Metadata SideMenu")
	public void whenClicksOnMetadataSideMenu(){
		admin.select(SideMenu.Metadata);
	}
	@When("click on 'Add New Column' button")
	public void whenClickOnAddNewColumnButton(){
		admin.addNewColumn();
	}
	@Then("the Custom Fields dialog is displayed")
	public void thenTheCustomFieldsDialogIsDisplayed(){
	 
	}
	
	@SuppressWarnings("static-access")
	@When("user enters '<label>'")
	public void whenUserEnterslabel(@Named("label") String label){
		dialog.customFields.label(label);
	}
	@SuppressWarnings("static-access")
	@When("'<field_name>'")
	public void whenfield_name(@Named("field_name") String name){
		dialog.customFields.fieldName(name);
	}
	@SuppressWarnings("static-access")
	@When("select Align option")
	public void whenSelectAlignOption(){
		dialog.customFields.align(MetadataOption.Center);
	}
	@SuppressWarnings("static-access")
	@When("check 'Show by Default'")
	public void whenCheckShowByDefault(){
		dialog.customFields.showByDefault();
	}
	@SuppressWarnings("static-access")
	@When("check 'Wrap Text'")
	public void whenCheckWrapText(){
		dialog.customFields.wrapText();
	}
	@SuppressWarnings("static-access")
	@When("select Column Position option")
	public void whenSelectColumnPositionOption(){
		 dialog.customFields.columnPosition(MetadataOption.Right);
	}
	@SuppressWarnings("static-access")
	@When("check 'Show in Doc Chooser'")
	public void whenCheckShowInDocChooser(){
		dialog.customFields.showInDocChooser();
	}
	@SuppressWarnings("static-access")
	@When("check 'Show in Search Results'")
	public void whenCheckShowInSearchResults(){
		dialog.customFields.showInSearchResults();
	}
	@SuppressWarnings("static-access")
	@When("check 'Show in Chronology Preview'")
	public void whenCheckShowInChronologyPreview(){
		dialog.customFields.showInChronologyPreview();
	}
	@SuppressWarnings("static-access")
	@When("check 'Show on Export Coverpage'")
	public void whenCheckShowOnExportCoverpage(){
		dialog.customFields.showOnExportCoverpage();
	}
	@SuppressWarnings("static-access")
	@When("check 'Show on Transcripts Page'")
	public void whenCheckShowOnTranscriptsPage(){
		dialog.customFields.showOnTranscriptsPage();
	}
	@SuppressWarnings("static-access")
	@When("check 'Custom Page Header'")
	public void whenCheckCustomPageHeader(){
		dialog.customFields.customPageHeader();
	}
	@SuppressWarnings("static-access")
	@When("check 'Export File Name Convention'")
	public void whenCheckExportFileNameConvention(){
		dialog.customFields.exportFileNameConvention();
	}
	@SuppressWarnings("static-access")
	@When("check 'Show in Magnum Notes'")
	public void whenCheckShowInMagnumNotes(){
		dialog.customFields.showInMagnumNotes();
	}
	@SuppressWarnings("static-access")
	@When("click the apply button")
	public void andClickTheApplyButton(){
		dialog.customFields.apply();
	}
	@Then("settings is applied to Document column")
	public void thenSettingsIsAppliedToDocumentColumn(){
		util.pause(1);
	}
	
	//file upload
	@When("user clicks on Upload button")
	public void whenUserClicksOnUploadButton(){
		document.uploadNewDocument();
	}
	@When("click the select file button")
	public void andClickTheSelectFileButton(){
		//dialog.upload.selectFiles();
		util.pause(1);
	}
	@SuppressWarnings("static-access")
	@When("choose '$file' to select")
	public void andChooseFileToSelect(String file) throws AWTException{
		dialog.upload.selectFiles(file);
	}
	@SuppressWarnings("static-access")
	@When("upload document")
	public void andUploadDocument(){
		dialog.upload.upload(8);
		dialog.upload.close();
	}
	@Then("selected file is uploaded")
	public void thenSelectedFileIsUploaded(){
		user.reloadPage();
		util.pause(2);
	}
	
	
	@SuppressWarnings("static-access")
	@When("design in progress")
	public void designInProgress() throws AWTException{
		document.newFolder();
		dialog.newFolder.enterFoldersName();
		dialog.newFolder.createFolder();
		util.pause(1);
		
		document.uploadDocument();
		dialog.upload.selectDestination();
		dialog.uploadDestination.select(UserAction.currentValue);
		util.pause(1);
			
		
		dialog.upload.selectFiles("repDoc2");
		dialog.upload.selectFiles("testDoc04");
		dialog.upload.selectFiles("testDoc10");
		
		dialog.upload.upload(20);
		dialog.upload.close();
		user.reloadPage();
		document.expandFolder(UserAction.currentValue);
		
		util.pause(5);
	}
	
	@When("user rightclick '$doc'")
	public void whenUserRightclickDocument(String doc){
		document.rightClick(doc);
	}
	@When("select '$option' option")
	public void andSelectOption(String option){
		document.selectContextOptions(option);
	}
	@When("select '$option' option from menu dropdown")
	public void andSelectOptionFromMenuDopdown(String option){
		user.selectDropdown("maindiv","inlineblock", 1, "button", 0, option);
		util.pause(2);
	}
	
	@SuppressWarnings("static-access")
	@When("click 'Choose file' button")
	public void andClickChooseFileButton(){
		dialog.insertDocument.chooseFile();
	}
	
	@SuppressWarnings("static-access")
	@When("select '$file' file")
	public void selectFileFile(String file) throws AWTException{
		dialog.insertDocument.selectFile(file);
		util.pause(5);
	}
	
	@SuppressWarnings("static-access")
	@When("select Action '$option'")
	public void andSelectActionOption(String option){
		dialog.insertDocument.checkbox(option);
		util.pause(5);
	}
	@SuppressWarnings("static-access")
	@When("Position '$option'")
	public void PositionOption(String option) {
		dialog.insertDocument.checkbox(option);
		util.pause(5);
	}
	@SuppressWarnings("static-access")
	@When("Numbering '$option'")
	public void NumberingOption(String option) {
		dialog.insertDocument.checkbox(option);
	}
	@SuppressWarnings("static-access")
	@When("apply")
	public void andApply() {
		dialog.insertDocument.apply();
		user.confirm("Cancel");
	}
	@Then("document is inserted")
	public void andDocumentIsInserted() {
		user.reloadPage();
		document.selectDocument("insertDoc");
	}
	
	//Admin_053
	@When("user select a '$doc'")
	public void whenUserSelectADocument(String doc) {
		//document.findDocument(doc);
		document.findSelectDocument(doc);
		util.pause(1);
	}
	@When("click to preview")
	public void andClickToPreview() {
		document.clickPreview();
		user.switchToCurrentWindow(1);
	}
	@Then("the document is open in a new tab")
	public void thenTheDocumentIsOpenInANewTab() {
		util.pause(1);
	}
	@When("user highlight text")
	public void whenUserHighlightText() {
		util.pause(1);
	}
	@When("user click the save button")
	public void whenUserClickTheSaveButton() {
		util.pause(1);
	}
	@Then("a note is created")
	public void thenANoteIsCreated() {
		util.pause(1);
	}
	
	//Admin_035
	@When("user click on Pages button")
	public void whenUserClickOnPagesButton() {
		transcript.pages();
	}
	@Then("all document pages are displayed as thumbnails")
	public void thenAllDocumentPagesAreDisplayedAsThumbnails() {
		util.pause(5);
		//assert greater than one page
	}
	
	//Admin_036
	@When("user select '$option' option from Zoom dropdown")
	public void whenUserSelectOptionFromZoomDropdown(String option){
		transcript.zoom(option);
	}
	@Then("document dimension is displayed")
	public void thenDocumentDimensionIsDisplayed(){
		util.pause(2.5);
	}
	
	//Admin_037
	@SuppressWarnings("static-access")
	@When("select '$role' role")
	public void whenEnterFirstName(String role){
		dialog.addUsers.selectRole(role);
	}
	@SuppressWarnings("static-access")
	@When("enter FirstName")
	public void whenEnterFirstName(){
		dialog.addUsers.firstName();
	}
	@SuppressWarnings("static-access")
	@When("Confirm Password")
	public void whenConfirmPassword(){
		dialog.addUsers.confirmPassword();
	}
	@SuppressWarnings("static-access")
	@When("LastName")
	public void whenLastName(){
		dialog.addUsers.lastName();
	}
	@Then("new user is created and displayed in Legend section")
	public void thenNewUserIsCreatedAndDisplayedInLegendSection(){
		util.pause(2);
	}
	@SuppressWarnings("static-access")
	@When("Password")
	public void whenPassword(){
		dialog.addUsers.password();
	}
	@SuppressWarnings("static-access")
	@When("enter Memorable Word")
	public void whenEnterMemorableWord(){
		dialog.addUsers.memorableWord();
	}
	@SuppressWarnings("static-access")
	@When("click the Set Details button")
	public void whenClickTheSetDetailsButton(){
		dialog.addUsers.setDetails();
	}
	@When("select Users SideMenu")
	public void whenSelectUsersSideMenu(){
		admin.select(SideMenu.Users);
	}
	@SuppressWarnings("static-access")
	@When("Signature")
	public void whenSignature(){
		dialog.addUsers.signature();
	}
	@Then("Users in Workspace are displayed")
	public void thenUsersInWorkspaceAreDisplayed(){
		util.pause(1);
		//assert
	}
	@SuppressWarnings("static-access")
	@When("user enters '$email' on AddUser panel")
	public void whenUserEntersAnEmailOnAddUserPanel(String email){
		dialog.addUsers.email(email);
	}
	@SuppressWarnings("static-access")
	@When("Confirm Memorable Word")
	public void whenConfirmMemorableWord(){
		dialog.addUsers.confirmMemorableWord();
	}
	@SuppressWarnings("static-access")
	@When("Create Account")
	public void whenCreateAccount(){
		dialog.addUsers.createAccount();
	}
	@SuppressWarnings("static-access")
	@When("click the Invite button")
	public void andClickTheInviteButton(){
		dialog.addUsers.invite();
	}
	@Then("a registration email is sent to user email")
	public void thenARegistrationEmailIsSentToUserEmail(){
		util.pause(3);
	}
	
	
	//Admin_039
	@Then("Magnum Registration page opens in a new tab")	
	public void thenMagnumRegistrationPageOpensInANewTab(){
		//assert registration page
		util.pause(2);
	}
	@Given("user is present on the Registration page")	
	public void givenUserIsPresentOnTheRegistrationPage(){
		util.pause(2);
	}
	@When("'$answer' to third Security Question")	
	public void whenToThirdSecurityQuestion(String answer){
		mail.question("a3", answer);
	}
	@Then("user is directed to Mailinator homepage")	
	public void thenUserIsDirectedToMailinatorHomepage(){
		util.pause(0.5);
	}
	@When("user enters Firstname and Lastname")
	public void whenUserEnterFirstName(){
		mail.names();
	}
	@When("enters Signature")
	public void andEntersSignature(){
		mail.signature();
	}
	@When("enter Password")	
	public void whenEnterPassword(){
		
	}
	@When("'$answer' to second Security Question")	
	public void whenToSecondSecurityQuestion(String answer){
		mail.question("a2", answer);
	}
	@Then("user is logged into Workspace as a User")	
	public void thenUserIsLoggedIntoWorkspaceAsAUser(){
		
	}
	@When("click the Register button")	
	public void whenClickTheRegisterButton(){
		mail.register();
	}
	@When("click Go")
	public void whenClickGo(){
		mail.go();
	}
	@Then("user is directed to Magnum Terms page")
	public void thenUserIsDirectedToMagnumTermsPage(){
		
	}
	@When("set '$answer' to first Security Question")
	public void whenSetAnswerToFirstSecurityQuestion(String answer){
		mail.question("a1", answer);
	}
	@When("user accept Magnum Terms and Condition")
	public void whenUserAcceptMagnumTermsAndCondition(){
		
	}
	@Then("user is directed to 'testEmail' inbox")
	public void thenUserIsDirectedTotestEmailInbox(){
		//Assert user is in inbox
		util.pause(2);
	}
	@When("user navigate to '$url'")
	public void whenUserNavigateTohttpswwwmailinatorcom(String url){
		mail.navigateTo(url);
	}
	@When("user enter '$inbox' on email textbox")
	public void whenUserEntertestEmailOnEmailTextbox(String inbox){
		mail.inbox(inbox);
	}
	@When("user clicks on Magnum Email Notification")
	public void whenUserClicksOnMagnumEmailNotification(){
		mail.magnumNotification();
	}
	
	//Admin_42
	@Then("user is deleted from Workspace")
	public void thenUserIsDeletedFromWorkspace(){
		
	}
	@When("'$option' option is selected")
	public void whendeleteOptionIsSelected(){
		
	}
	@When("a '$user' is selected")
	public void whenAUserIsSelected(){
		
	}
	@When("confirm to delete user")
	public void whenConfirmToDeleteUser(){
		
	}
	
	
	//Admin_43
	@When("Admin user enters '$password'")
	public void whenAdminUserEnterspassword(){
		util.pause(1); 
	}
	@When("confirm")
	public void andConfirm(){
		util.pause(1); 
	}
	@When("click the OK button")
	public void whenClickTheOKButton(){
		util.pause(1); 
	}
	@Then("the '$dialog' dialog is visible")
	public void thenTheSuspendUserDialogIsVisible(String dialog){
		util.pause(1); 
	}
	@Then("user account is disable and  entry on list should turns pale red")
	public void thenUserAccountIsDisable(){
		util.pause(1); 
	}
	@Then("user account is enable and entry on list should turn clear")
	public void thenUserAccountIsEnable(){
		util.pause(1); 
	}
	
	//Admin_045
	@When("user enters '$username' and '$password'")
	public void whenUserEntersUsernameAndPassword(String username, String password) throws IOException{		
		loginPage.loginAs(username);
		loginPage.withPassword(password);
	}
	
	//Admin_046
	@Then("user's '$keyword' is reset")
	public void thenUsersPasswordIsReset(String keyword){
		util.pause(1); 
	}
	@When("user enters new '$password'")
	public void whenUserEntersNewpassword(String password){
		util.pause(1); 
	}
	@When("enters Admin '$AdminPassword'")
	public void whenEntersAdminpassword(String AdminPassword){
		util.pause(1); 
	}
	@When("repeat '$password'")
	public void whenRepeatpassword(String confirmPassword){
		util.pause(1); 
	}
		
	@Then("user pause for $min sec")
	public void thenUsersPauseforSeconds(int min){
		util.pause(min); 
	}
	@When("user pause for $min sec")
	public void whenUsersPauseforSeconds(int min){
		util.pause(min); 
	}
	@Given("user is present on '$page' page")
	public void givenUserIsPresentOnPage(Pages page){
		assertTrue(page.returnPage().equals(page.returnPage()));
	}
	
	@Then("user is present on '$page' page")
	public void thenUserIsPresentOnPage(Pages page){
		assertTrue(page.returnPage().equals(page.returnPage()));
	}
	
	//
	@When("user clicks on New Folder button")
	public void whenUserClicksOnNewFolderButton(){
		document.newFolder();
	}
	
	@SuppressWarnings("static-access")
	@When("user enters '<folder_name>'")
	@Alias("enters <folder_name>")
	public void whenUserEntersfolderName(String folder_name){
		dialog.newFolder.enterFoldersName(folder_name);
	}
	
	@SuppressWarnings("static-access")
	@When("user click Create Folder button")
	@Alias("click Create Folder button")
	public void whenUserClickCreateButton(){
		dialog.newFolder.createFolder();
	}
	@Then("created folder should be visible on workspace")
	public void thenCreatedFolderShouldBeVisibleOnWorkspace(){
		//assert
		util.pause(5);
	}
	
	
	//Go To A Page
	@Given("user is present on $page page")
	public void givenUserIsPresentOnAPage(String page){
		util.pause(1);
	}
	@Then("user is present on $page page")
	public void thenUserIsPresentOnAdminPage(String page){
		//assert
		util.pause(1);
	}
}
