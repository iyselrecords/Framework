package com.opus2.magnum.chronology.tools;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import com.opus2.enums.Tool;
import com.opus2.util.Page;
import com.opus2.util.components.Tools;

public class ChronologyTools extends Page {
	public static final String TOOLS_BUTTON = "docscontrols_Tools";
	private static final String CHRON_TOOLS = "chron-tools";
	public static final String DELETE_ALL = "Delete All";
	public static final String LINK_ENTRIES_TO_SOURCE = "Link Entries to Sources";
	public static final String EXPORT_AS_PDF = "Export as PDF";
	public static final String EXPORT_AS_CSV = "Export as CSV";
	public static final String EXPORT_AS_DOCX = "Export as DOCX";
	
	private Tools tool;
	
	public void button() {
		withTimeoutOf(5, TimeUnit.SECONDS).waitForPresenceOf(By.id(TOOLS_BUTTON));
		this.getElement(TOOLS_BUTTON).click();
	}

	public String dropdown() {
		return this.getElement(CHRON_TOOLS).getCssValue("display");
	}

	public void selectOption(String option) {
		tool.getOption(Tool.CHRONOLOGY, option);
	}

	public void switchTab() {
		this.switchToCurrentWindow();
	}	
}
