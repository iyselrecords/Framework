package com.opus2.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Predicate;
import com.opus2.enums.TranscriptOptions;
import com.opus2.util.Event;
import com.opus2.util.Util;

import net.thucydides.core.pages.PageObject;

public class Transcripts extends PageObject {
	public WebDriver driver = getDriver();
	Util util;
	Event event;
	
	public void goTo() {
		getDriver().findElement(By.id("transcripts")).click();
	}

	public void editProperties() {
		util.clickAction("edit-toggle-button");
	}
	
	public void importTranscript() {
		util.clickAction("upload-toggle-button-new");
	}


	public void clickTranscript() {
		WebElement wrap = getDriver().findElement(By.id("docsmain"));
		wrap.findElements(By.tagName("span")).get(0).click();
	}

	public void select(String file) {	
		WebElement topLevel = staleElement("docsmain");
		List<WebElement> lists = topLevel.findElements(By.className("clearboth"));
		
		for(WebElement list : lists){
			WebElement h2 = list.findElements(By.tagName("h2")).get(0);
			
			if(h2.getText().equals(file.toUpperCase())){
				h2.click();
				break;
			}
		}
		util.wait(1);
	}
	
	public WebElement staleElement(String elementId)
    {
        try
        {
            return getDriver().findElement(By.id(elementId));
        }
        catch (StaleElementReferenceException e)
        {
            return staleElement(elementId);
        }
    }
	public void select(TranscriptOptions option) {
		WebElement topLevel = getDriver().findElement(By.id("transcript-tools_transcript-tools"));
		List<WebElement> buttons = topLevel.findElements(By.tagName("button"));
		
		for(WebElement button : buttons){
			if(button.getText().equals(option.returnEnum())){
				button.click();
				break;
			}
		}
		util.wait(0.5);
	}
	public void clickPreview(String file) {
		util.clickAction("preview-div");
	}
	public void ImportAnnotations() {
		select(TranscriptOptions.ImportAnnotations);
	}
	public void ReplaceTranscript() {
		select(TranscriptOptions.ReplaceTranscript);
	}
	public void clickToolDropdown() {
		util.clickAction("rightToolbarDiv","btn-grp","button",4);
	}
	
	public void chooseFile() {
		util.clickAction("fileid");
	}
	public void selectFile(String file) {	
		String path = "C:\\Users\\misele\\Desktop\\PN\\docs\\testData\\";
		WebElement input = getDriver().findElement(By.id("fileid"));
		input.sendKeys(path + file);
	}
	public void selectFile(String element, String file) {	
		String path = "C:\\Users\\misele\\Desktop\\PN\\docs\\testData\\";
		WebElement input = getDriver().findElement(By.id(element))
				.findElements(By.tagName("input")).get(0);
		input.sendKeys(path + file);
	}
	public void signAnnotationsAs(String option) {
		WebElement sel = getDriver().findElement(By.id("seluserid"));		
		Select selector = new Select(sel);
		selector.selectByVisibleText(option);
	}

	public void shareAnnotation(String option) {
		WebElement sel = getDriver().findElement(By.id("sharedid"));		
		Select selector = new Select(sel);
		selector.selectByVisibleText(option);
	}


	public void Import() {
		WebElement topLevel = getDriver().findElement(By.id("formid"));
		List<WebElement> buttons = topLevel.findElements(By.tagName("input"));
		
		for(WebElement button : buttons){
			if(button.getAttribute("value").equalsIgnoreCase("Import")){
				button.click();
				break;
			}
		}
		
	}

	public void progressBar(int num){		
		util.wait(num);
	}

	public void useMDBSyncFile() {
		WebElement topLevel = getDriver().findElement(By.id("timings--choice-content"));
		List<WebElement> tables = topLevel.findElements(By.tagName("table"));
		
		for(WebElement table : tables){
			WebElement cell = table.findElements(By.tagName("td")).get(1);
			if(cell.getText().equalsIgnoreCase("Use MDB sync file")){
				table.findElement(By.tagName("input")).click();
				break;
			}
		}
	}

	public void selectMDBFile(String file) {
		String path = "C:\\Users\\misele\\Desktop\\PN\\docs\\testData\\";
		WebElement input = getDriver().findElement(By.id("DOMadditions"))
				.findElements(By.className("dialogSection")).get(0)
				.findElements(By.tagName("input")).get(2);
		input.sendKeys(path + file);
	}
	
	public void selectVideoFile(String file) {
		String path = "C:\\Users\\misele\\Desktop\\PN\\docs\\testData\\";
		WebElement input = getDriver().findElement(By.id("DOMadditions"))
				.findElements(By.className("dialogSection")).get(0)
				.findElements(By.tagName("input")).get(3);
		input.sendKeys(path + file);
	}

	public void find(String file) {
		util.inputText("docctrls", file);
	}
	public void clearText(String file) {
		util.clearText("docctrls");
	}


	public void previewSelectedPage(int page) {
        WebElement control = getDriver().findElements(By.className("centre-preview-ctrls")).get(0);
        WebElement dropdown = control.findElements(By.className("page-selector")).get(0);
        dropdown.findElements(By.tagName("button")).get(0).click();
        util.wait(0.7);

        WebElement menu = dropdown.findElement(By.className("menu"));
        List<WebElement> lists = menu.findElements(By.tagName("div"));
        
        for (WebElement list : lists)
        {
            if (list.getText().equalsIgnoreCase(Integer.toString(page)))
            {
                list.click();
                break;
            }
        }
	}


	public void previewPrevious() {
        previewButtons(0);
	}
	public void previewNext() {
        previewButtons(1);
	}
	private void previewButtons(int num) {
		util.wait(1);
		WebElement topLevel = getDriver().findElements(By.className("centre-preview-ctrls")).get(0);
		WebElement button = topLevel.findElements(By.className("control-nav")).get(num)
				.findElements(By.tagName("button")).get(0);
		button.click();
	}

	public void textLarger() {
		util.clickAction("leftToolbarDiv", "zoom", "button", 0);
	}
	public void textLarger(int num) {
		for(int i = 0; i < num; i++){
			util.clickAction("leftToolbarDiv", "zoom", "button", 0);
		}
	}

	public void textSmaller() {
		util.clickAction("leftToolbarDiv", "zoom", "button", 1);
	}
	public void textSmaller(int num) {
		for(int i = 0; i < num; i++){
			util.clickAction("leftToolbarDiv", "zoom", "button", 1);
		}
	}

	public void manageTags() {
		util.clickAction("leftToolbarDiv", "tagsbutton", "button", 0);
	}

	public void manageDesignations() {
		util.clickAction("leftToolbarDiv", "tagsbutton", "button", 1);
	}
	
	public void showTrascriptLists(){
		//util.clickAction("leftToolbarDiv", "inline-control", "button", "Show the transcripts list");
	}
	
	public void selectTranscriptFromList(String file){
		util.wait(1);
	}

	public void toggleDesignationsFromWall() {
		util.clickAction("rightToolbarDiv","buttonGroupDiv","button", 3);
		util.clickAction("rightToolbarDiv","buttonGroupDiv","button", 3);
	}

	public void toggleNotesFromWall() {
		util.clickAction("rightToolbarDiv","buttonGroupDiv","button", 1);
		util.clickAction("rightToolbarDiv","buttonGroupDiv","button", 1);
	}

	public void toggleLinkedDocumentsFromWall() {
		util.clickAction("rightToolbarDiv","buttonGroupDiv","button", 2);
		util.clickAction("rightToolbarDiv","buttonGroupDiv","button", 2);
	}

	public void toggleBetweenButtons(String button) {
		if(button.equalsIgnoreCase("Notes")){
			util.clickAction("rightToolbarDiv","buttonGroupDiv","button", 2);
			util.clickAction("rightToolbarDiv","buttonGroupDiv","button", 3);
			util.wait(3);
			util.clickAction("rightToolbarDiv","buttonGroupDiv","button", 3);
			util.clickAction("rightToolbarDiv","buttonGroupDiv","button", 2);
		}else if(button.equalsIgnoreCase("Linked Documents")){
			util.clickAction("rightToolbarDiv","buttonGroupDiv","button", 1);
			util.clickAction("rightToolbarDiv","buttonGroupDiv","button", 3);
			util.wait(3);
			util.clickAction("rightToolbarDiv","buttonGroupDiv","button", 3);
			util.clickAction("rightToolbarDiv","buttonGroupDiv","button", 1);
		}else if(button.equalsIgnoreCase("Designations")){
			util.clickAction("rightToolbarDiv","buttonGroupDiv","button", 1);
			util.clickAction("rightToolbarDiv","buttonGroupDiv","button", 2);
			util.wait(3);
			util.clickAction("rightToolbarDiv","buttonGroupDiv","button", 2);
			util.clickAction("rightToolbarDiv","buttonGroupDiv","button", 1);
		}
	}

	public void dropdown() {
		util.clickAction("leftToolbarDiv", "button", 5);
	}

	public void displaysListOfTranscript() {
		util.wait(1);
		WebElement topLevel = getDriver().findElement(By.id("DOMadditions"))
				.findElements(By.className("tx_nosel")).get(0);
		List<WebElement> lists = topLevel.findElements(By.className("doclabel"));
		for(WebElement list : lists){			
			System.out.println(list.getText());			
		}
	}
	
	public void displaySearchList() {
		util.clickAction("leftToolbarDiv", "search-left", "span", 0);
	}

	public void enterSearchText(String text) {
		util.inputText("leftToolbarDiv", text, 0);
	}

	public void indentifyText() {
		WebElement topLevel = getDriver().findElement(By.id("leftToolbarDiv"))
                .findElements(By.className("wifound")).get(0);
        util.wait(1);

        List<WebElement> occurrences = topLevel.findElements(By.tagName("span"));
     	for (int i = 1; i < occurrences.size(); i++)
     	{    	
     		util.wait(0.6);
     		occurrences.get(i).click();
     	}
	}

}
