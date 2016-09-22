package com.opus2.magnum.chronology.newentry;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

import com.opus2.util.Page;
import com.opus2.util.TestData;
import com.opus2.util.Util;
import com.opus2.util.components.Dialog;
import com.opus2.util.components.Dropdown;
import com.opus2.util.components.RightClickMenu;

public class ChronologyNewEntry extends Page {

	public static final String NEW_ENTRY_BUTTON = "docscontrols_NewEntry";
	public static final String CHRONOLOGY_EVENT_DIALOG = "Chronology Event";
	public static final String MARTINS = "Martins";
	private static final String ENTRY_TAG = TestData.CHRONOLOGY_.getProperty("entryTag");
	private static final String APPLY_TAG = "select-categories_Apply";
	private static final String SELECT_DOCUMENT_TAG = "Select tags for this item";
	private static final String ADD_A_SOURCE = "Add a Source";
	private static final String SELECT_DOCUMENT = TestData.CHRONOLOGY_.getProperty("entrySource");
	private static final String APPLY = "doc-chooser_Apply";
	public static final String NEW_ENTRY = TestData.CHRONOLOGY_.getProperty("entryDescription");
    private static final String ENTRY_TYPES = TestData.CHRONOLOGY_.getProperty("entryType");
    private static final String ENTRY_STATUS = TestData.CHRONOLOGY_.getProperty("entryStatus");
    private static final String ENTRY_DATE = TestData.CHRONOLOGY_.getProperty("entryDate");
    private static final String ENTRY_DATEOPTION = TestData.CHRONOLOGY_.getProperty("entryDateOption");
    private static final String ENTRY_TIME = TestData.CHRONOLOGY_.getProperty("entryTime");
    private static final String ENTRY_TIMEZONE = TestData.CHRONOLOGY_.getProperty("entryTimezone");
    private static final String NEXT_MONTH = "pika-next";
    private static final String PREVIOUS_MONTH = "pika-prev";
    public static final String NEW_ENTRY_DATE_DROPDOWN = "factdate";
    public static final String FILTER_DATE_DROPDOWN = "filter-from-date";
    
    
    private Dialog dialog;
	private Dropdown option;
	public static WebElement Entry;
	private RightClickMenu menu;
	private String preview;
    public static int Index;
	
	
	public void newEntry() {
		this.getElement(NEW_ENTRY_BUTTON).click();
	}
	
	public String dialog() {
		withTimeoutOf(5, TimeUnit.SECONDS).waitForPresenceOf(By.className("dialog"));
		return dialog.dialog(CHRONOLOGY_EVENT_DIALOG).getCssValue("display");
	}

	public void eventEntries() {
		selectType();
		selectStatus();	
		selectDate();
		selectTime(); 
        addASource();	
		selectTag();	
		description();
		saveEntry();
		Util.pause(3);
		entry();
	}
	
	private void selectType() {
      withTimeoutOf(5, TimeUnit.SECONDS).waitForPresenceOf(By.className("menu"));
      option.getOptions(0, ENTRY_TYPES);
      Util.pause(0.5);
    }
	private void selectType(String type) {
      withTimeoutOf(5, TimeUnit.SECONDS).waitForPresenceOf(By.className("menu"));
      option.getOptions(0, type);
      Util.pause(0.5);
    }
	
	public int myEntry() {
	   WebElement a = this.getElementByClass("chronmain")
	       .findElements(By.tagName("tbody")).get(0);
	   int num = a.findElements(By.className("factfirst")).size();
	   return num;
	}
	
	public void getIndex() {
	    Index = myEntry();
	}

    private void selectStatus() {
		withTimeoutOf(5, TimeUnit.SECONDS).waitForPresenceOf(By.className("menu"));
		option.getOptions(2, ENTRY_STATUS);
		Util.pause(0.5);
	}
	
	private void selectStatus(String status) {
      withTimeoutOf(5, TimeUnit.SECONDS).waitForPresenceOf(By.className("menu"));
      option.getOptions(2, status);
      Util.pause(0.5);
    }
	
	private void selectDate() {
		withTimeoutOf(5, TimeUnit.SECONDS).waitForPresenceOf(By.className("menu"));
		option.getOptions(1, ENTRY_DATEOPTION);
		Util.pause(0.5);
		inputDate();
	}
	
	private void selectTime() {
		inputTime();
		withTimeoutOf(5, TimeUnit.SECONDS).waitForPresenceOf(By.className("menu"));
		option.getOptions(3, ENTRY_TIMEZONE);
		Util.pause(0.5);
	}
	
	private void selectTag() {
		dialog.buttonByTitle(SELECT_DOCUMENT_TAG).click();
		Util.pause(0.5);
		dialog.select(ENTRY_TAG);
		Util.pause(0.5);
		this.getElement(APPLY_TAG).click();
	}
	
	private void description() {
		this.getElement("description").clear();
		this.getElement("description").sendKeys(NEW_ENTRY);
		Util.pause(0.5);
	}
	
	private void description(String desc) {
		this.getElement("description").clear();
		this.getElement("description").sendKeys(desc);
		Util.pause(0.5);
	}
	
	private void addASource() {
		dialog.button(ADD_A_SOURCE).click();
		dialog.selectDocument(SELECT_DOCUMENT);
		this.getElement(APPLY).click();
	}
	
	private void addASource(String document) {
		dialog.button(ADD_A_SOURCE).click();
		dialog.selectDocument(document);
		this.getElement(APPLY).click();
	}
	
	private void inputDate() {
		this.getElement("factdate").clear();
		this.getElement("factdate").sendKeys(ENTRY_DATE);
		Util.pause(0.5);
	}
	
	private void inputDate(String date) {
		this.getElement("factdate").clear();
		this.getElement("factdate").sendKeys(date);
		Util.pause(0.5);
	}
	
	private void inputTime() {
		this.getElement("facttime").clear();
		this.getElement("facttime").sendKeys(ENTRY_TIME);
		Util.pause(0.5);
	}	
	private void inputTime(String time) {
		this.getElement("facttime").clear();
		this.getElement("facttime").sendKeys(time);
		Util.pause(0.5);
	}
	private void saveEntry() {
		withTimeoutOf(5, TimeUnit.SECONDS).waitForPresenceOf(By.className("menu"));
		dialog.button("Save").click();
		Util.pause(2);
	}
	
	public void deleteEntry(){
		this.rightclick(Entry);
		menu.hasOption("Delete").click();
		Util.pause(1);
		this.OK();
		Util.pause(1);
	}
	
	public void entry(){
		List <WebElement> rows = Util.getDriver().findElements(By.className("auc2"));
		for(WebElement row : rows){
			List <WebElement> entries = row.findElements(By.tagName("span"));
			for(WebElement entry : entries){
				if(entry.getText().equals(NEW_ENTRY)){
					Entry = entry;
					return;
				}
			}
		}
	}
	
	public void cleanUp() {
		Util.pause(2);
		entry();
		deleteEntry();
	}
	
	public void addTag() {	
		description();
		selectTag();
		saveEntry();
		cleanUp();
	}
	
	public void assignType() {	
		description();
		selectType();
		saveEntry();
		cleanUp();
	}

	public void setDate(String date_Option, String date) {
		description();
		withTimeoutOf(5, TimeUnit.SECONDS).waitForPresenceOf(By.className("menu"));
		option.getOptions(1, date_Option);
		Util.pause(0.5);
		inputDate(date);
	}

	public void setTime(String timezone, String time) {
		inputTime(time);
		withTimeoutOf(5, TimeUnit.SECONDS).waitForPresenceOf(By.className("menu"));
		option.getOptions(3, timezone);
		Util.pause(0.5);
		saveEntry();
		cleanUp();
	}

	public void addDescription(String desc) {
		description(desc);
		Util.pause(0.5);
		saveEntry();
		cleanUp();
	}

	public void addSource(String document) {
		description();
        addASource(document);
		Util.pause(0.5);
		saveEntry();
		cleanUp();
	}	

	public void previewDocument(String document) {
		description();
		addASource(document);
		Util.pause(0.5);
		saveEntry();
		preview = document;
	}
	
	public void preview() {
		Util.pause(1.5);
		List <WebElement> lists = Util.getDriver().findElements(By.className("auc4"));
		for(WebElement list : lists){
			WebElement span = list.findElements(By.tagName("span")).get(0);
			if(span.getText().equals(preview)){
				span.click();
				break;
			}
		}
		Util.pause(2);
	}

	public void document() {
		Util.pause(2);
		this.getElementByClass("previewNotes").click();
		this.switchToCurrentWindow();
		Util.pause(5);
		this.switchToMainWindow();
		cleanUp();
	}

	public void chronEntry(String entry) {
		selectType("Fact");		
		selectStatus("Undisputed");	
		selectDate();	
		selectTime();
		description(entry);
		saveEntry();
		Util.pause(2);
		entry(entry);
	}

	public void rightclick() {
		this.rightclick(Entry);
	}
	
	public void selectOption(String option) {
		menu.hasOption(option).click();
		Util.pause(1);
	}
	
	public void entry(String newEntry){
		List <WebElement> rows = Util.getDriver().findElements(By.className("auc2"));
		for(WebElement row : rows){
			List <WebElement> entries = row.findElements(By.tagName("span"));
			for(WebElement entry : entries){
				if(entry.getText().equals(newEntry)){
					Entry = entry;
					return;
				}
			}
		}
	}

	public void openDropdown(String dropdown) {
        this.getElement(dropdown).click();
        Util.pause(2);  
    }
	
	public void todaysDate() {      
        this.getElementByClass("is-today").findElements(By.tagName("button"))
            .get(0).click();
    }
  
	public void saveDescAndDelete() {
        description();
        saveEntry();
        cleanUp();
    }
	
    public void nextMonth() {
        month(NEXT_MONTH);
        month(NEXT_MONTH);
    }

    public void previousMonth() {
        month(PREVIOUS_MONTH);
        month(PREVIOUS_MONTH);
    }

    private void month(String month){
        try{
          WebElement c = this.getElementByClass(month);
          c.click();
          Util.pause(1);
        }catch(StaleElementReferenceException e){
            month(month);
        }
    }

    public void newEntries() {
        option.myOption(1, ENTRY_TYPES);
        option.myOption(2, ENTRY_DATEOPTION);
        inputDate();
        option.myOption(3, ENTRY_STATUS);
        inputTime();
        option.myOption(4, ENTRY_TIMEZONE);
        selectTag();
        description();
        saveEntry();
    }

  
}