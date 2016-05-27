package com.opus2.steps;

import java.awt.AWTException;

import org.jbehave.core.annotations.BeforeScenario;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;





import com.opus2.pages.Dialog;
import com.opus2.pages.Documents;
import com.opus2.pages.Login;
import com.opus2.pages.MyWorkspace;
import com.opus2.pages.UploadDialog;
import com.opus2.util.Constants;
import com.opus2.util.Util;

import net.serenitybdd.jbehave.SerenityStories;

public class MyWorkspaceSteps extends SerenityStories{
	MyWorkspace myWorkspace;
	Documents documents;
	UploadDialog uploadDialog;	
	Login loginpage;
	Util util;
	Dialog dialog;

	@When("user clicks on upload button and clicks on Select Files")
	public void whenUserClicksOnUploadButtonAndClicksOnSelectFiles(){
		documents.uploadDocument();
		uploadDialog.selectFiles();
	}
	@When("click on upload button")
	public void whenClickOnUploadButton(){
		uploadDialog.clickUpload();
	}
	@Then("the windows open dialog box should open")
	public void thenTheWindowsOpenDialogBoxShouldOpen(){
		 util.wait(1);
	}
	@When("user selects '<file>' into the Upload dialogue box")
	public void whenUserSelectsfileIntoTheUploadDialogueBox(@Named("file") String file) throws AWTException{
		uploadDialog.selectFiles();
		uploadDialog.selectFile(file);
	}
	@Then("Documents uploaded should be available on the Documents page")
	public void thenDocumentsUploadedShouldBeAvailableOnTheDocumentsPage(){
		util.wait(7);
	}
	@Then("created folder should be visible on workspace")
	public void thenCreatedFolderShouldBeVisibleOnWorkspace(){	
		documents.pageReload();
	}
	@SuppressWarnings("static-access")
	@When("user enters '<folder_name>' and clicks Create Folder button")
	public void whenUserEntersfolder_nameAndClicksCreateFolderButton(@Named("folder_name") String name){
		dialog.newFolder.enterFoldersName(name);
		dialog.newFolder.createFolder();
	}
	
	@SuppressWarnings("static-access")
	@When("user enters '<sub_folder_name>' and clicks Create Folder button")
	public void whenUserEnterssub_folder_nameAndClicksCreateFolderButton(@Named("sub_folder_name") String name){
		dialog.newFolder.enterFoldersName(name);
		dialog.newFolder.createFolder();
	}
	
	@Then("the New Folder dialog is visible")
	public void thenTheNewFolderDialogIsVisible(){
		 util.wait(2);
	}
	@When("user clicks on New Folder button")
	public void whenUserClicksOnNewFolderButton(){
		documents.newFolder();
	}
	@Then("Document should be uploaded to the selected destination folder")
	public void thenDocumentShouldBeUploadedToTheSelectedDestinationFolder(){
		util.wait(5);
	}
	@When("click Apply button")
	public void andClickApplyButton(){
		uploadDialog.applyButton();
		util.wait(2);
	}
	@When("user clicks on Upload button")
	public void whenUserClicksOnUploadButton(){
		documents.uploadNewDocument();
	}
	@SuppressWarnings("static-access")
	@When("click the folder button next to Destination")
	public void whenClickTheFolderButtonNextToDestination(){
		//uploadDialog.selectDistination();
		dialog.upload.selectDestination();
	}
	@When("select a '<folder>'")
	public void andSelectAfolder_name(@Named("folder") String name){
		uploadDialog.selectFolder(name);
		
	}
	@When("user select '<home_folder>' and rightclick to select '<export>'")
	public void whenUserSelectFolderAndRightClick(@Named("folder_name") String folder, @Named("export") String action){
		uploadDialog.editFolderAndDocument(folder,action);
		util.wait(7);
	}
}
