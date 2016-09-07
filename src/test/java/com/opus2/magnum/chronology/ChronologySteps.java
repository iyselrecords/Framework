package com.opus2.magnum.chronology;

import org.openqa.selenium.WebElement;

import net.thucydides.core.annotations.Step;

public class ChronologySteps {
	Chronology dip;
	
	@Step("dummy data")
	public String assertDIP(){
		return "TDIP";
	}
	
	@Step("chronology dropdown")
    public WebElement chronologyDropdown() {
        return dip.chronologyDropdown();
    }
    
    @Step("select chronology list")
    public void selectChronology() {
        dip.selectChronology();
    }
    
    @Step()
    public String selectedChron() {
        return dip.selectedChron();
    }
	
	@Step("manage chronologies")
	public void manageChronologies() {
		dip.manageChronologies();
	}
	
	@Step("manage chronologies")
	public void manageChron() {
		dip.manageChron();
	}
	
	@Step("select all")
	public void selectAll() {
		dip.selectAll();
	}
	
	@Step("select none")
	public void selectNone() {
		dip.selectNone();
	}
	
	@Step("click add button")
	public void add() {
		dip.add();
	}
	
	@Step("input chron list name")
	public void chronListName() {
		dip.chronListName();
	}
	
	@Step("save")
	public void save() {
		dip.save();
	}
	
	@Step("select chronologies list")
	public void selectChronologiesList(String chron) {
		dip.selectChronologiesList(chron);
	}
	
	@Step("click edit button")
	public void edit() {
		dip.edit();
	}
	
	@Step("update chronologies list")
	public void update() {
		dip.update();
	}
	
	@Step("click delete button")
	public void delete() {
		dip.delete();
	}
	
	@Step("confirm action")
	public void OK() {
		dip.OK();
	}
	
	@Step("search term")
	public void search() {
		dip.search();
	}
	
	@Step("reset")
	public void reset() {
		dip.reset();
	}
	
	@Step("find entry")
	public void findEntry() {
		dip.findEntry();
	}
	
	@Step()
	public void customType(){
		dip.customType();
	}
	
	@Step("dialog")
	public String dialog() {
		return dip.dialog();
	}

	@Step("my list")
	public void addMyList() {
		dip.addMyList();
	}
	
	
	
	
	
	
	
	
	
	@Step("filter")
	public void filter() {
		dip.filter();
	}
	
	@Step("new entry")
	public void newEntry() {
		dip.newEntry();
	}
	
	@Step("custom types")
	public void customTypes() {
		dip.customTypes();
	}
	
	@Step("import entries")
	public void importEntries() {
		dip.importEntries();
	}
	
	@Step("export manager")
	public void exportManager() {
		dip.exportManager();
	}
	
	@Step("tools")
	public void tools() {
		dip.tools();
	}
	
	@Step("A_B_A")
	public void A_B_A() {
		dip.A_B_A();
	}
}
