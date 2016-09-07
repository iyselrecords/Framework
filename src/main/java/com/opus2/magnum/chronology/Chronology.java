package com.opus2.magnum.chronology;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.opus2.enums.Tool;
import com.opus2.util.Page;
import com.opus2.util.Util;
import com.opus2.util.components.Dialog;
import com.opus2.util.components.Dropdown;
import com.opus2.util.components.Find;
import com.opus2.util.components.Tools;

public class Chronology extends Page {
	public static final String MANAGE_CHRONOLOGIES = "docscontrols_ManageChronologies";
	public static final String DOCUMENTS = "docsdflt";
	public static final String RESET = "docscontrols_Reset";
	private static final String FILTER_BUTTON = "docscontrols_Filter";
	private static final String NEW_ENTRY = "docscontrols_NewEntry";
	public static final String CUSTOM_TYPES = "docscontrols_CustomTypes";
	private static final String IMPORT_ENTRIES = "docscontrols_ImportEntries";
	private static final String EXPORT_MANAGER = "docscontrols_ExportManager";
	private static final String LINK_ENTRIES_TO_SOURCE = "Link Entries to Sources";
	private static final String A_B_A = "Link Entries to Sources";
	private static final String VIEW_MENU = "view-menu";
	public static final String SELECT_ALL = "All";
	public static final String SELECT_NONE = "None";
	public static final String EXPAND = "Expand";
	public static final String COLLAPSE = "Collapse";
	public static final String CHRON = "Martins";
	private static final String MASTER = "Master";
	public static final String CHRON_LIST = "TGIF";
	public static final String UPDATE_CHRON_LIST = "ONIM";
	private static final String CHRONOLOGY_ENTRY = "chron_test";
	public static final String CUSTOM_TYPES_DIALOG = "Custom Types";
	private static final String MY_LIST = "SearchList";
	private static final String NEW_CHRONOLOGY_LIST = "New Chronology List";
    private static final String CONTROLS = "docscontrols";

	
	private Find search;
	private Dropdown option;
	private Tools tool;
	private Dialog dialog;
	
	
	public void selectChronologies() {
		Util.pause(3);
		WebElement button = Util.getDriver().findElements(By.className("normalIcon")).get(0);
		button.click();
		Util.pause(1);
		
		List<WebElement> options = Util.getDriver().findElement(By.id(VIEW_MENU))
			.findElements(By.tagName("span"));
		for(WebElement option : options){
			option.click();
			Util.pause(1.5);
			button.click();
			Util.pause(0.5);
		}
		button.click();
	}
	
	public WebElement chronologyDropdown() {
        withTimeoutOf(5, TimeUnit.SECONDS).waitForPresenceOf(By.id(CONTROLS));
        return this.getElement("docscontrols").findElements(By.tagName("td")).get(0);
    }
    
    public void selectChronology() {
        Util.pause(2);
        option.getOption(CHRON);
    }
    
    public String selectedChron() {
        withTimeoutOf(5, TimeUnit.SECONDS).waitForPresenceOf(By.id(CONTROLS));
        return this.getElement(CONTROLS).findElements(By.tagName("p")).get(0).getText();
    }
	
	public void selectChronologyList() {
		Util.pause(2);
		option.getOption(CHRON);
		Util.pause(1);
	}
	
	public void manageChronologies() {
		selectChronologyList();
		this.getElement(MANAGE_CHRONOLOGIES).click();
		Util.pause(3);
		build();
	}
	
	public void manageChron(){
		this.getElement(MANAGE_CHRONOLOGIES).click();
	}
	
	public void selectAll(){
		dialog.links(SELECT_ALL);
	}
	
	public void selectNone(){
		dialog.links(SELECT_NONE);
	}
	
	public void add(){
		dialog.button("Add").click();
	}
	
	public void chronListName(){
	    Util.pause(1);
		dialog.input(NEW_CHRONOLOGY_LIST, CHRON_LIST);
	}
	
	public void save(){
		dialog.button("Save").click();
		Util.pause(2);
	}

	public void addMyList() {
		dialog.button("Add").click();
		Util.pause(1);
		dialog.input(NEW_CHRONOLOGY_LIST, MY_LIST);
		dialog.button("Save").click();
	}
	public void selectChronologiesList(String chron){
		dialog.select(chron);
		Util.pause(1);
	}
	public void selectList(String type){
		dialog.select(type);
		Util.pause(1);
		deleteCustomType();
	}
	
	private void deleteCustomType() {
		dialog.button("Delete").click();
		withTimeoutOf(5, TimeUnit.SECONDS).waitForPresenceOf(By.id("OK"));
		getElement("OK").click();
	}
	
	public void edit(){
		dialog.button("Edit").click();
	}
	
	public void update(){
	    Util.pause(1);
		dialog.input("New Chronology List", UPDATE_CHRON_LIST);
	}
	
	public void delete(){
		dialog.button("Delete").click();
	}
	
	public void search(){
		Util.pause(2);
		dialog.find2("Manage Chronologies", MY_LIST);
		selectList(MY_LIST);
		Util.pause(2);
	}
	
	public void findEntry() {
		selectChronologyList();
		search.find(CHRONOLOGY_ENTRY);
		Util.pause(2);
	}
	
	public void reset(){
		findEntry();
		this.getElement(RESET).click();
		Util.pause(1);
	}
	
	public void customType(){
		this.getElement(CUSTOM_TYPES).click();
	}

	public String dialog() {
		return dialog.dialog(CUSTOM_TYPES_DIALOG).getCssValue("display");
	}

	
	public void build(){
		dialog.links(SELECT_ALL);
		dialog.links(SELECT_NONE);
		dialog.links(EXPAND);
		dialog.links(COLLAPSE);
		Util.pause(3);
		
		Util.pause(1);
		dialog.input("New Chronology List", "NCL4");
		dialog.button("Save").click();
		Util.pause(3);
		
		//Edit
		dialog.select("NCL4");
		dialog.button("Edit").click();
		Util.pause(1);
		dialog.input("New Chronology List", "NCL5");
		dialog.button("Save").click();
		Util.pause(3);
		
		//Delete
		dialog.select("NCL5");
		dialog.button("Delete").click();
		Util.pause(1);
		this.OK();
		Util.pause(1);
		
		//find
		dialog.find2("Manage Chronologies", MASTER);
		Util.pause(3);
	}
	
	
	public void filter(){
		this.getElement(FILTER_BUTTON).click();
		Util.pause(3);
		this.getElement(FILTER_BUTTON).click();
	}
	
	public void newEntry(){
		this.getElement(NEW_ENTRY).click();
		Util.pause(3);
		dialog.button("Cancel").click();
	}
	
	public void customTypes(){
		this.getElement(CUSTOM_TYPES).click();
		Util.pause(3);
		this.getElement("custom-types_Cancel").click();
	}
	
	public void importEntries(){
		this.getElement(IMPORT_ENTRIES).click();
		Util.pause(3);
		this.getElement("import-facts_Cancel").click();
	}
	
	public void exportManager(){
		this.getElement(EXPORT_MANAGER).click();
		this.switchToCurrentWindow();
		Util.pause(5);
		this.switchToMainWindow();
	}
	
	public void tools(){
		Util.pause(3);
		tool.getOption(Tool.CHRONOLOGY, LINK_ENTRIES_TO_SOURCE);
		Util.pause(3);
		dialog.button("Close").click();
	}
	
	public void A_B_A(){
		Util.pause(3);
		this.getElement(A_B_A).click();
		Util.pause(3);
		dialog.button("Close").click();
	}
}