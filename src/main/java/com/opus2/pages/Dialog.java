package com.opus2.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.opus2.pages.UploadDialog;
import com.opus2.util.Util;

import net.thucydides.core.pages.PageObject;

public class Dialog extends PageObject{
	public WebDriver driver = getDriver();
	static Util util;
	
	public static SelectDocumentTags selectDocumentTags;
	public static Upload upload;
	public static UploadDestination uploadDestination;
	public static NewFolder newFolder;
	public static ManageTags manageTags;
	public static NewTag newTag;
	public static EditTag editTag;
	public static SelectTag selectTag;
	public static SnapshotView snapshotView;
	public static SortOrder sortOrder;
	public static ReOrder reOrder;
	public static PageRotation pageRotation;
	public static AddUsers addUsers;
	public static CustomTypes customTypes;
	public static SaveACustomType saveACustomType; 
	
	
	//Documents
	public static class SelectDocumentTags
	{
		public static void find(String searchText) {
			util.findSearch("select-categories", searchText);				
		}
		public static void closeDialog() {
			util.closeDialog("select-categories dialogClose-div");
		}
		
		public static void selectAll() {
			util.clickActionByText("All");				
		}
		
		public static void selectNone() {
			util.clickActionByText("None");
		}
		
		public static void expand() {
			util.clickActionByText("Expand");				
		}
		
		public static void collapse() {
			util.clickActionByText("Collapse");
		}
		
		public static void selectDocumentsWithoutTags() {
			util.documentsWithoutTags();
		}
		
		public static void close() {
			util.clickAction("select-categories_Close");				
		}
		public static void cancel() {
			util.clickAction("select-categories_Cancel");				
		}
		public static void apply() {
			util.clickAction("select-categories_Apply");
		}
		public static void selectTag() {
			util.selectTag("select-categories");				
		}
	}
	
	public static class Upload
	{
		static UploadDialog uploadDialog;
		
		public static void selectDestination() {
			util.clickAction("upload destination");	
		}
		
		public static void closeDialog() {
			util.closeDialog("uploader dialogClose-div");
		}
		
		public static void close() {
			util.clickAction("uploader_Close");
		}

		public static void upload() {
			util.clickAction("uploader_uploader_Upload");
		}

		public static void selectFiles() {
			util.clickAction("select files");
		}

		public static void selectFiles(String file) {
			util.selectDocOpenWindow(file);
		}
		
	}
	
	public static class UploadDestination
	{
		public static void find(String searchText) {
			util.findSearch("doc-chooser_doc-chooser", searchText);
		}

		public static void closeDialog() {
			util.closeDialog("doc-chooser dialogClose-div");
		}
		
		public static void cancel() {
			util.clickAction("doc-chooser_Cancel");				
		}
		
		public static void apply() {
			util.clickAction("doc-chooser_Apply");
		}

		public static void selectFolder(String folder) {
			util.wait(2);
			util.selectFolder(folder); 			
		}
	}
	
	public static class NewFolder
	{
		public static void Test_NewFolder(){
			 System.out.println("This is an inner class"); 
		}

		public static void changeDestination() {
			util.clickAction("newFolderDialog_newFolderDialog_Change");
		}

		public static void enterFoldersName(String name) {
			util.inputText("newFolderDialog_newFolderDialog", name);
		}

		public static void createFolder() {
			util.clickAction("newFolderDialog_CreateFolder");
			util.reloadPage();
		}
	}
	
	public static class ManageTags
	{
		public static void find(String searchText) {
			util.findSearch("manage-tags", searchText);				
		}
		
		public static void closeDialog() {
			util.closeDialog("manage-tags dialogClose-div");
		}
		
		public static void selectAll() {
			util.clickActionByText("All");				
		}
		
		public static void selectNone() {
			util.clickActionByText("None");
		}
		
		public static void expand() {
			util.clickActionByText("Expand");				
		}
		
		public static void collapse() {
			util.clickActionByText("Collapse");
		}
		public static void add() {
			util.clickAction("manage-tags_Add");				
		}
		
		public static void edit() {
			util.clickAction("manage-tags_Edit");
		}
		
		public static void delete() {
			util.clickAction("manage-tags_Delete");				
		}
		
		public static void close() {
			util.clickAction("manage-tags_Close");
		}		
	}
	
	public static class NewTag
	{
		
		
		public static void cancel() {
			util.clickAction("new-edit-tag_Cancel");				
		}
		
		public static void save() {
			util.clickAction("new-edit-tag_Save");
		}

		public static void name(String text) {
			util.inputText("new-edit-tag_new-edit-tag", text);
		}
		
		@SuppressWarnings("static-access")
		public static void nestUnder(String tag) {
			util.clickAction("new-edit-tag_new-edit-tag_Change");
			selectTag.find(tag);
			selectTag.apply();
		}
	}
	
	public static class EditTag
	{
		public static void find(String searchText) {
			util.findSearch("category-filter", searchText);				
		}
	}
	
	public static class SelectTag
	{
		
		public static void selectTag(String string) {
			
			util.clickAction("new-edit-tag_new-edit-tag_Change");
			//
		}
		
		public static void find(String text) {
			util.findSearch("select-tag", text);				
		}
		
		public static void apply() {
			util.clickAction("select-tag_Apply");
		}
	}
	
	public static class SelectColor
	{
		
	}
		
	public static class SnapshotView
	{
		public static void Test_SnapshotView(){
			 System.out.println("This is an inner class"); 
		}
	}
	
	public static class SortOrder
	{

		public static void SaveOrdering() {
			util.clickAction("sort-order_SaveOrdering");
		}

		public static void select(String option) {
			util.selectOption(option);
		}
		
	}
	
	public static class ReOrder
	{
		public static void click(String option) {
			if(option.equalsIgnoreCase("Up"))
			{
				util.clickAction("reorderTbl_Up");
			}
			else if(option.equalsIgnoreCase("Down"))
			{
				util.clickAction("reorderTbl_Down");
			}
			else if(option.equalsIgnoreCase("Top"))
			{
				util.clickAction("reorderTbl_Top");
			}
			else if(option.equalsIgnoreCase("Bottom"))
			{
				util.clickAction("reorderTbl_Bottom");
			}
			else if(option.equalsIgnoreCase("Move 10 Up"))
			{
				util.clickAction("reorderTbl_Move10Up");
			}
			else if(option.equalsIgnoreCase("Move 10 Down"))
			{
				util.clickAction("reorderTbl_Move10Down");
			}
			else if(option.equalsIgnoreCase("X Distance"))
			{
				util.xSpace(7);
				util.clickAction("reorderTbl_XDistance");
			}
		}
		public static void applyOrdering() {
			util.clickAction("reorder_ApplyOrdering");
			util.acceptAlert();
		}
	
	}	
	
	public static class PageRotation
	{
		
		public static void rotatePages(String page) {
			rotatePagesTo(page, 0);
		}

		private static void rotatePagesTo(String page, int index) {
			util.rotation(page, index);
		}

		public static void to(String page) {
			rotatePagesTo(page, 1);
		}

		public static void rotation(String rotate) {
			util.rotation(rotate);			
		}

		public static void apply() {
			util.clickAction("page-rotation_Apply");
		}
		
	}
	

	
	//Transcript
	public static class ImportTranscript
	{
		
	}
	
	public static class EditTranscript
	{
		
	}
	
	public static class ManageDesignationsAndComments
	{
		
	}
	
	public static class NewDesignation
	{
		
	}
	
	public static class EditDesignation
	{
		
	}
	
	public static class NewComment
	{
		
	}
	
	public static class EditComment
	{
		
	}
	
	public static class SelectNoteTags
	{
		
	}
	
	public static class ExportTranscript
	{
		
	}
	
	public static class ImportDesignations
	{
		
	}
	
	public static class ExportDesignations
	{
		
	}
	
	public static class ReplaceTranscript
	{
		
	}
	
	public static class VideoTimecodeCorrection
	{
		
	}
	
	public static class AttachVideo
	{
		
	}
	
	public static class AddUsers
	{
		public static void email(String email){
			util.inputTextClassName("panel-body", email);
		}
		public static void selectRole(String newRole){
			util.selectDropdown("settingsmain", "select", newRole);
		}
		public static void invite(){
			util.clickAction("settingsmain","panel-body","button","Invite");
		}
		public static void createAccount(){
			
		}
		public static void firstName(){
			
		}	
		public static void lastName(){
			
		}
		public static void username(){
			
		}
		public static void signature(){
			
		}	
		public static void password(){
			
		}
		public static void confirmPassword(){
			
		}	
		public static void memorableWord(){
			
		}
		public static void confirmMemorableWord(){
			
		}
		public static void sendEmailNotification(){
			
		}
	}
	
	public static class CustomTypes
	{
		public static void add(){
			util.clickAction("custom-types_Add");
		}

		public static void cancel() {
			util.clickAction("custom-types_Cancel");
		}
	}
	
	public static class SaveACustomType
	{
		public static void newName(String name){
			util.wait(0.5);
			util.inputText("name-dialog", name, 1);
		}

		public static void OK() {
			util.clickAction("name-dialog_OK");
		}
	}
	
	
}
