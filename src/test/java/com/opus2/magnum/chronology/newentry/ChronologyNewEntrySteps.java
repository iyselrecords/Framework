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
    
    @Step("dialog is visible")
    public String dialog(){
        return entry.dialog();
    }
}
