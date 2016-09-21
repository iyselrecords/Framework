package com.opus2.magnum.chronology.newentry;

import net.thucydides.core.annotations.Step;

public class ChronologyNewEntrySteps {
	ChronologyNewEntry entry;
	
	@Step("test run")
	public String assertDIP(){
		return "TDIP";
	}
	
	@Step("new entry")
	public void newEntry() {
		entry.newEntry();
	}
	
	@Step()
    public int myEntry() {
        return entry.myEntry();
    }
	
	@Step("dialog is visible")
	public String dialog(){
		return entry.dialog();
	}
	
	@Step("add chronology event")
	public void eventEntries() {
		entry.eventEntries();
	}
	
	@Step("delete entry")
	public void deleteEntry() {
		entry.deleteEntry();
	}
	
    @Step()
	public void entry() {
		entry.entry();
	}
    
    @Step()
	public void addTag() {
		entry.addTag();
	}
    
    @Step()
	public void assignType() {
		entry.assignType();
	}
    
    @Step()
	public void setDate(String date_Option, String date) {
		entry.setDate(date_Option,date);
	}
    
    @Step()
	public void setTime(String timezone, String time) {
		entry.setTime(timezone,time);
	}

    @Step()
	public void addDescription(String desc) {
    	entry.addDescription(desc);
	}
    
    @Step()
	public void addSource(String document) {
    	entry.addSource(document);
	}
    
    @Step()
	public void previewDocument(String document) {
		entry.previewDocument(document);
	}
    
    @Step()
	public void preview() {
		entry.preview();
	}
    
    @Step()
	public void document() {
    	entry.document(); 
	}

    @Step()
	public void chronEntry(String newEntry) {
		entry.chronEntry(newEntry);
	}
	
    @Step()
	public void rightclick() {
		entry.rightclick();
	}
	
    @Step()
	public void selectOption(String option) {
		entry.selectOption(option);
	}

    @Step()
    public void getIndex() {
        entry.getIndex();
    }
    
    @Step()
    public void openDropdown() {
        entry.openDropdown();
    }
    
    @Step()
    public void todaysDate() {  
        entry.todaysDate();
    }
    
    @Step()
    public void nextMonth() {
        entry.nextMonth();
    }
    
    @Step()
    public void previousMonth() {
        entry.previousMonth();
    }
}
