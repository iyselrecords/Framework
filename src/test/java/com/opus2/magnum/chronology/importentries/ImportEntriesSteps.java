package com.opus2.magnum.chronology.importentries;

import java.awt.AWTException;

import net.thucydides.core.annotations.Step;

public class ImportEntriesSteps {
	ImportEntry entry;
	
	@Step("dummy data")
	public String assertDIP(){
		return "TDIP";
	}

	@Step("import entry")
	public void importEntry() {
		entry.importEntry();
	}
	
	@Step("select file")
	public void getFile(String file) throws AWTException {
	  entry.getFile(file);
	}
	
	@Step("import")
	public void importEntries() {
		entry.importEntries();
	}

  
}
