package com.opus2.magnum.chronology.importentries;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import com.opus2.util.Page;
import com.opus2.util.TestData;
import com.opus2.util.Util;

public class ImportEntry extends Page {
	public static final String IMPORT_ENTRIES_BUTTON = "docscontrols_ImportEntries";
	public static final String SELECT_FILE_BUTTON = "select-entry-file";
	public static final String IMPORT_ENTRIES_DIALOG = "import-facts";
	public static final String IMPORT = "import-facts_Import";
	public static final String FILE_PATH = "C:\\Users\\misele\\Documents\\testDoc\\chron\\Import_Chron_Entries";
	
	
	public void importEntry() {
		withTimeoutOf(5, TimeUnit.SECONDS).waitForPresenceOf(By.id(IMPORT_ENTRIES_BUTTON));
		this.getElement(IMPORT_ENTRIES_BUTTON).click();
	}

	public void getFile(String file) throws AWTException {
	  withTimeoutOf(5, TimeUnit.SECONDS).waitForPresenceOf(By.id(SELECT_FILE_BUTTON));
      this.getElement(SELECT_FILE_BUTTON).click();
      Util.pause(2);
      this.selectFile(TestData.CHRONOLOGY_.getProperty(file));
      Util.pause(2);
	}
	
	public void importEntries() {
		withTimeoutOf(5, TimeUnit.SECONDS).waitForPresenceOf(By.id(IMPORT));
		this.getElement(IMPORT).click();
		Util.pause(5);
	}
}
