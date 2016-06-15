package com.opus2.pages;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;

import com.opus2.pages.UploadDialog;
import com.opus2.util.Util;

import net.thucydides.core.pages.PageObject;

public class Dialog extends PageObject{
	public WebDriver driver = getDriver();
	static Util util;
	static UserAction action;
	
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
	public static UploadDialog updlog;
	public static Properties properties;
	public static Relationships relationships;
	public static DuplicateDocument duplicateDocument;
	public static SelectADocument selectADocument;
	public static ReplaceDocument replaceDocument;
	public static StampEditor stampEditor;
	public static BulkOrganize bulkOrganize;
	public static ChronologyFilter chronologyFilter;
	public static SaveAsSharedFilter saveAsSharedFilter;
	public static ImportUser importUser;
	public static Legend legend;
	public static LiveUser liveUser;
	public static EditUser editUser;
	
	//Documents
	public static class SelectDocumentTags
	{
		public static void find(String searchText) {
			action.findSearch("select-categories", searchText);				
		}
		public static void closeDialog() {
			action.closeDialog("select-categories dialogClose-div");
		}
		
		public static void selectAll() {
			action.clickActionByText("All");				
		}
		
		public static void selectNone() {
			action.clickActionByText("None");
		}
		
		public static void expand() {
			action.clickActionByText("Expand");				
		}
		
		public static void collapse() {
			action.clickActionByText("Collapse");
		}
		
		public static void selectDocumentsWithoutTags() {
			action.documentsWithoutTags();
		}
		
		public static void close() {
			action.clickAction("select-categories_Close");				
		}
		public static void cancel() {
			action.clickAction("select-categories_Cancel");				
		}
		public static void apply() {
			//action.clickAction("select-categories_Apply");
			action.clickAction("category-filter_Apply");
		}
		public static void selectTag() {
			action.selectTag("select-categories");				
		}
		public static void chooseTag(String tag) {
			action.chooseTag(tag);				
		}
	}
	
	public static class Upload
	{
		static UploadDialog uploadDialog;
		
		public static void selectDestination() {
			action.clickAction("upload destination");	
		}
		
		public static void closeDialog() {
			action.closeDialog("uploader dialogClose-div");
		}
		
		public static void close() {
			action.clickAction("uploader_Close");
		}

		public static void upload() {
			action.clickAction("uploader_uploader_Upload");
			util.wait(20);
		}

		public static void selectFiles() {
			action.clickAction("select files");
		}

		public static void selectFiles(String file) throws AWTException {
			//action.selectDocOpenWindow(file);
			updlog.selectFile(file);
		}
		
	}
	
	public static class UploadDestination
	{
		public static void find(String searchText) {
			action.findSearch("doc-chooser_doc-chooser", searchText);
		}

		public static void closeDialog() {
			action.closeDialog("doc-chooser dialogClose-div");
		}
		
		public static void cancel() {
			action.clickAction("doc-chooser_Cancel");				
		}
		
		public static void apply() {
			action.clickAction("doc-chooser_Apply");
		}

		public static void selectFolder(String folder) {
			util.wait(2);
			action.selectFolder(folder); 			
		}
	}
	
	public static class NewFolder
	{
		public static void Test_NewFolder(){
			 System.out.println("This is an inner class"); 
		}

		public static void changeDestination() {
			action.clickAction("newFolderDialog_newFolderDialog_Change");
		}

		public static void enterFoldersName(String name) {
			action.inputText("newFolderDialog_newFolderDialog", name);
		}

		public static void createFolder() {
			action.clickAction("newFolderDialog_CreateFolder");
			action.reloadPage();
		}
	}
	
	public static class ManageTags
	{
		public static void find(String searchText) {
			action.findSearch("manage-tags", searchText);				
		}
		
		public static void closeDialog() {
			action.closeDialog("manage-tags dialogClose-div");
		}
		
		public static void selectAll() {
			action.clickActionByText("All");				
		}
		
		public static void selectNone() {
			action.clickActionByText("None");
		}
		
		public static void expand() {
			action.clickActionByText("Expand");				
		}
		
		public static void collapse() {
			action.clickActionByText("Collapse");
		}
		public static void add() {
			action.clickAction("manage-tags_Add");				
		}
		
		public static void edit() {
			action.clickAction("manage-tags_Edit");
		}
		
		public static void delete() {
			action.clickAction("manage-tags_Delete");				
		}
		
		public static void close() {
			action.clickAction("manage-tags_Close");
		}		
	}
	
	public static class NewTag
	{
		
		
		public static void cancel() {
			action.clickAction("new-edit-tag_Cancel");				
		}
		
		public static void save() {
			action.clickAction("new-edit-tag_Save");
		}

		public static void name(String text) {
			action.inputText("new-edit-tag_new-edit-tag", text);
		}
		
		@SuppressWarnings("static-access")
		public static void nestUnder(String tag) {
			action.clickAction("new-edit-tag_new-edit-tag_Change");
			selectTag.find(tag);
			selectTag.apply();
		}
	}
	
	public static class EditTag
	{
		public static void find(String searchText) {
			action.findSearch("category-filter", searchText);				
		}
	}
	
	public static class SelectTag
	{
		
		public static void selectTag(String string) {
			
			action.clickAction("new-edit-tag_new-edit-tag_Change");
			//
		}
		
		public static void find(String text) {
			action.findSearch("select-tag", text);				
		}
		
		public static void apply() {
			action.clickAction("select-tag_Apply");
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
			action.clickAction("sort-order_SaveOrdering");
		}

		public static void select(String option) {
			action.selectOption(option);
		}
		
	}
	
	public static class ReOrder
	{
		public static void click(String option) {
			if(option.equalsIgnoreCase("Up"))
			{
				action.clickAction("reorderTbl_Up");
			}
			else if(option.equalsIgnoreCase("Down"))
			{
				action.clickAction("reorderTbl_Down");
			}
			else if(option.equalsIgnoreCase("Top"))
			{
				action.clickAction("reorderTbl_Top");
			}
			else if(option.equalsIgnoreCase("Bottom"))
			{
				action.clickAction("reorderTbl_Bottom");
			}
			else if(option.equalsIgnoreCase("Move 10 Up"))
			{
				action.clickAction("reorderTbl_Move10Up");
			}
			else if(option.equalsIgnoreCase("Move 10 Down"))
			{
				action.clickAction("reorderTbl_Move10Down");
			}
			else if(option.equalsIgnoreCase("X Distance"))
			{
				action.xSpace(7);
				action.clickAction("reorderTbl_XDistance");
			}
		}
		public static void applyOrdering() {
			action.clickAction("reorder_ApplyOrdering");
			action.acceptAlert();
		}
	
	}	
	
	public static class PageRotation
	{
		
		public static void rotatePages(String page) {
			rotatePagesTo(page, 0);
		}

		private static void rotatePagesTo(String page, int index) {
			action.rotation(page, index);
		}

		public static void to(String page) {
			rotatePagesTo(page, 1);
		}

		public static void rotation(String rotate) {
			action.rotation(rotate);			
		}

		public static void apply() {
			action.clickAction("page-rotation_Apply");
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
			action.inputTextClassName("panel-body", email);
		}
		public static void selectRole(String newRole){
			action.selectDropdown("settingsmain", "select", newRole);
		}
		public static void invite(){
			action.clickAction("settingsmain","panel-body","button","Invite");
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
	
	
	public static class ImportUser
	{
		public static void select(String user){
			
		}
		public static void importUser(){
			
		}
	}
	
	
	public static class Legend
	{
		
	}
	
	
	public static class LiveUser
	{
		public static void select(String user){
			action.selectLiveUser(user);
		}
		public static void selectOption(String option){
			action.adminUserPopupMenu("rightClickMenu", option);
		}
	}
	
	public static class EditUser
	{
		public static void selectRole(String role){
			action.clickAction("DOMadditions", "sideComponent", "button", 0);
			action.adminUserPopupMenu("view-menu", role);
		}

		public static void save() {
			action.clickAction("DOMadditions", "dialogFoot", 0, "button", 1);
		}
	}
	
	public static class CustomTypes
	{
		public static void add(){
			action.clickAction("custom-types_Add");
		}

		public static void cancel() {
			action.clickAction("custom-types_Cancel");
		}
	}
	
	public static class SaveACustomType
	{
		public static void newName(String name){
			util.wait(1.5);
			action.inputText("name-dialog", name, 1);
		}

		public static void OK() {
			action.clickAction("name-dialog_OK");
		}
	}
	
	public static class Properties
	{
		
		public static void type(String option) {
			action.dropdownSelect("doctype-dd", "menu", option);
		}
		public static void inputDate(String keysToSend) {
			action.inputText("properties", "textComponentInput", keysToSend);
		}
		public static void apply() {
			action.clickAction("properties_Apply");
		}
	}
	
	public static class Relationships
	{
		public static void add() {
			action.clickAction("relationships_Add");
		}
		public static void save() {
			action.clickAction("relationships_Save");
		}
	}
	public static class DuplicateDocument
	{
		public static void select() {
			action.clickAction("properties_Apply");
		} 
		public static void save() {
			action.clickAction("properties_Apply");
			action.clickDialogHeader("DOMadditions", "DUPLICATE DOCUMENT", "button", "Save");
		} 
	}
	public static class SelectADocument
	{

		public static void selectFolder(String folder) {
			find(folder);
			action.selectFolder(folder);
			apply();
		}
		private static void find(String folder) {
			action.findSearch("doc-chooser_doc-chooser", folder);
		}
		public static void apply() {
			action.clickAction("doc-chooser_Apply");
		}
		public static void cancel() {
			action.clickAction("doc-doc-chooser_Cancel");
		}
	}
	
	public static class ReplaceDocument
	{

		public static void chooseFile(String file) {
			action.selectFile("DOMadditions", "dialog", 0, "input", 0, file);
		}		
		public static void next() {
			action.clickAction("DOMadditions", "dialogFoot", "button", 1);
			util.wait(10);
		}
		public static void replace() {
			action.clickAction("DOMadditions", "dialogFoot", "button", 1);
			action.acceptAlert();
		}
		public static void close() {
			action.clickAction("DOMadditions", "dialogFoot", "button", 0);
			action.reloadPage();
		}
		
	}
	
	public static class StampEditor
	{

		public static void name(String name) {
			action.inputText("stamp-editor", "activeTextInput", 0, name);
		}
		public static void fieldName(String fieldName){
			action.inputText("stamp-editor", "activeTextInput", 1, fieldName);
		}
		public static void fontSize(String fontSize){
			action.inputText("stamp-editor", "activeTextInput", 2, fontSize);
		}
		public static void offSetx(String offSetx){
			action.inputText("stamp-editor", "activeTextInput", 3, offSetx);
		}
		public static void offSety(String offSety){
			action.inputText("stamp-editor", "activeTextInput", 4, offSety);
		}		
		public static void setRotation(String angle){
			action.inputText("stamp-editor", "activeTextInput", 5, angle);
		}
		public static void displayPage(String page){
			action.clickAction("stamp-editor", "dialogBodyMargin", "button", 2);
			util.wait(1);
			action.clickAction("stamp-editor", "dialogBodyMargin", "button", 2);
		}
		public static void selectCorner(String corner){
			action.clickAction("stamp-editor", "dialogBodyMargin", "button", 3);
			util.wait(1);
			action.clickAction("stamp-editor", "dialogBodyMargin", "button", 3);
			
		}
		public static void borderType(String type){
			action.clickAction("stamp-editor", "dialogBodyMargin", "button", 8);
			util.wait(1);
			action.clickAction("stamp-editor", "dialogBodyMargin", "button", 8);
			
		}
		public static void displayPageNumber(String num){
			action.clickAction("stamp-editor", "dialogBodyMargin", "button", 10);
			util.wait(1);
			action.clickAction("stamp-editor", "dialogBodyMargin", "button", 10);
			
		}
		public static void visibleOnExports(String num){
			action.clickAction("stamp-editor", "dialogBodyMargin", "button", 11);
			util.wait(1);
			action.clickAction("stamp-editor", "dialogBodyMargin", "button", 11);
			
		}
		
		
		//increaseRotation(){}
		//decreaseRotation(){}
		//resetRotation(){}
		
	}
	
	public static class BulkOrganize
	{

		public static void findDocument(String doc) {
			action.inputTextAreaReturn("MagnumAddDocToBundleFromDocIds", doc);
			action.clickAction("addBundleFromID_FindDocuments");
		}
		public static void findDocument(String doc, String doc2, String doc3) {
			action.inputTextAreaReturn("MagnumAddDocToBundleFromDocIds", doc,doc2,doc3);
			action.clickAction("addBundleFromID_FindDocuments");
		}
		public static void selectTag() {
			action.clickAction("addBundleFromID_SelectTag");
		}
		public static void selectFolder() {
			action.clickAction("addBundleFromID_SelectFolder");
		}
		public static void applyTag() {
			action.clickAction("addBundleFromID_ApplyTag");
			action.acceptAlert();
		}
		public static void moveDocuments() {
			action.clickAction("addBundleFromID_MoveDocuments");
			action.acceptAlert();
			util.wait(2);
		}
		public static void close() {
			action.clickAction("add-doc-to-tags-from-id_Close");
		}
	}
	public static class ChronologyFilter
	{

		public static void itemsWithoutDescription(){
			action.clickActionName("Items without description");
			util.wait(1);
			action.clickActionName("Items without description");
		}

		public static void inputDate(String date) {
			action.inputChroDate("filter-from-date", date);
			util.wait(1);
		}

		public static void selectDateOption(String option) {
			action.selectChroDateOption(option, 0);
		}

		public static void openDropdown() {
			action.openDropdown(1);
		}
		public static void selectType(String option) {
			if(option.equals("All")){
				action.chroTypeAllNone(1);
			}else if(option.equals("None")){
				action.chroTypeAllNone(3);
			}else{
				action.chroTypeOption(option);
			}
		}

		public static void selectStatue(String option) {
			action.chroStatue(option);
		}

		public static void tag() {
			action.clickAction("chron-filter_chron-filter", "filter", 3, "button", 0);
		}

		
		public static void createSharedFilters() {
			itemsWithoutDescription();
            action.chroStatue("Disputed");
		}

		@SuppressWarnings("static-access")
		public static void createPrivateFilters() {
			action.chroStatue("Undisputed");
	        tag();
	        selectDocumentTags.selectAll();
	        selectDocumentTags.apply();
		}

		public static void saveCurrentFilter(String option) {
            action.clickAction("chron-filter_chron-filter_SaveCurrentFilter");
            action.currentFilter(option);
		}
		
		public static void useSavedFilter(String option){
			if(option.equals("Shared")){			
				action.filterDropdown(0);
				action.filterOption(0);
			}else if(option.equals("Private")){
				action.filterDropdown(3);
				action.filterOption(0);
			}
		}
		public static void deleteSavedFilter(String option){
			if(option.equals("Shared")){			
				action.filterDropdown(0);
				action.filterOption(0);
			}else if(option.equals("Private")){
				action.filterDropdown(3);
				//action.filterOption(1);
			}
		}
	}
	
	public static class SaveAsSharedFilter
	{
		public static void inputText(String option){
			action.inputText("name-dialog", "dialogSection", "input", 1, option);
		}
	}
}
