package com.opus2.magnum.transcript.view;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

import com.opus2.util.Page;
import com.opus2.util.TestData;
import com.opus2.util.Util;
import com.opus2.util.components.Dialog;

public class TranscriptView  extends Page {
    private static final CharSequence SEARCH_IN_TRANSCRIPT = TestData.TRANSCRIPTSVIEW_.getProperty("findInTranscript");
    private static final Object TRANSCRIPT_TITLE = TestData.TRANSCRIPTSVIEW_.getProperty("transcriptTitle");
    private static final String NEW_TAG = TestData.TRANSCRIPTSVIEW_.getProperty("newTag");
    private static final String EDIT_TAG = TestData.TRANSCRIPTSVIEW_.getProperty("editTag");
    private static final String ADD_DESIGNATION = TestData.TRANSCRIPTSVIEW_.getProperty("addDesignatioin");
    private static final String EDIT_DESIGNATION = TestData.TRANSCRIPTSVIEW_.getProperty("editDesignatioin");
    private WebElement element = null;
	private Dialog dialog;

	public void previewTranscript(String transcript) {
		getTranscript(transcript).click();
	}

	private WebElement getTranscript(String transcript) {
	    Util.pause(2);
	    try{
		    List <WebElement> trans = Util.getDriver().findElements(By.className("indexdochead"));
	        for (WebElement tran : trans){
	            if(tran.getText().equals(transcript.toUpperCase())){
	                element = tran;
	                break;
	            }
	        }
		}catch(StaleElementReferenceException e){
		    getTranscript(transcript);
		}		
		return element;
	}

	public void viewTranscript() {
		this.getElementByClass("previewNotes").click();
		this.switchToCurrentWindow();
		Util.pause(3);
	}
	
	public void zoomIn(){
	    WebElement button = this.getElementByClass("zoom")
	        .findElements(By.tagName("button")).get(0);
	    button.click();
        Util.pause(2);
        button.click();
	}
	
	public void zoomOut(){
  	    WebElement button = this.getElementByClass("zoom")
            .findElements(By.tagName("button")).get(1);
        button.click();
        Util.pause(2);
        button.click();
    }
	
	public void transcriptView02() {
	    openTranscriptDropdown();
        selectTranscript();
    }
	
	private void selectTranscript() {
  	    List <WebElement> options = Util.getDriver().findElements(By.className("doctitle"));
        for (WebElement option : options){
            if(option.getText().equals(TRANSCRIPT_TITLE)){
                option.click();
                break;
            }
        }
        this.switchToCurrentWindow();
        Util.pause(5);
    }

    private void openTranscriptDropdown() {
	    getToolbarButton("Show the transcripts list").click();
        Util.pause(1);
    }
	
    public WebElement getToolbarButton(String text) {
        try{
          List <WebElement> buttons = Util.getDriver().findElement(By.id("leftToolbarDiv"))
              .findElements(By.tagName("button"));        
          for (WebElement button : buttons){
              if(button.getAttribute("title").equals(text)){
                  element = button;
                  break;
              }
          }
        }catch(StaleElementReferenceException e){
            getToolbarButton(text);
        }   
        return element;
    }

    public void transcriptView03() {    
        openSearchDropdown();
        searchTranscript();
        gotoIndex();
        openSearchDropdown();
    }

    private void openSearchDropdown() {
        WebElement button = this.getElementByClass("search-left");
        button.click();
        Util.pause(2);
        button.click();
        Util.pause(2.5);
    }
    
    private void searchTranscript() {
        WebElement input = Util.getDriver().findElements(By.className("componentInput")).get(1);
        input.sendKeys(SEARCH_IN_TRANSCRIPT);
        Util.pause(1);
    }
    
    private void gotoIndex() {
        List <WebElement> indexes = this.getElementByClass("wifound")
            .findElements(By.className(("wioccurrence")));
        for(WebElement index : indexes){
            index.click();
            Util.pause(1);
        }
    }
    
    public void transcriptView06() {    
        openManageTagDialog();
        addTag();
        editTag(NEW_TAG);
        deleteTag(EDIT_TAG);
        Util.pause(3);
        this.getElement("manage-tags_Close").click();
        Util.pause(1);
    }
    
    private void openManageTagDialog (){
        getToolbarButton("Manage tags").click();
        Util.pause(1);
    }
    
    private void addTag (){
        manageTag("Add","New",NEW_TAG);
    }
    
    private void editTag (String tag){
      selectTag(tag);
      manageTag("Edit","Edit",EDIT_TAG);
    }
    
    private void manageTag(String button, String header, String inputValue){
        this.getElement("manage-tags_".concat(button)).click();
        Util.pause(1);
        WebElement input = this.dialog(header.concat(" Tag")).findElements(By.tagName("input")).get(0);
        input.clear();
        input.sendKeys(inputValue);
        this.getElement("new-edit-tag_Save").click();
        Util.pause(1);
    }
    private void selectTag(String newTag) {
        this.getFromList("itemText", newTag).click();
    }
    private void deleteTag (String tag){
        selectTag(tag);
        this.getElement("manage-tags_Delete").click();
        this.OK();
    }

    public void transcriptView11() {
        openDesignation();
        addDesignation();
        editDesignation(ADD_DESIGNATION);
        //deleteDesignation(EDIT_DESIGNATION);
    }

    private void openDesignation() {
        getToolbarButton("Manage designations").click();
        Util.pause(1);
    }
    
    private void addDesignation() {
        manageDesignation("Add","New designation", ADD_DESIGNATION);
    }
    
    private void editDesignation(String tag) {
        selectTag(tag);
        manageDesignation("Edit","Edit designation", EDIT_DESIGNATION);
    }
    
    private void deleteDesignation(String tag) {
        selectTag(tag);
        dialog.button("Delete").click();
        Util.pause(2);
        this.getAlert().accept();
    }
    
    private void manageDesignation(String button,String header, String inputValue){
        dialog.button(button).click();
        Util.pause(1);
        WebElement input = this.dialog(header).findElements(By.tagName("textarea")).get(0);
        input.clear();
        input.sendKeys(inputValue);
        this.getElement("new-edit-tags_Save").click();
        Util.pause(1);
  }

    public void transcriptView07() {
        
    }
}
