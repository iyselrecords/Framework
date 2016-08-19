package com.opus2.magnum.navigate;

import net.thucydides.core.annotations.Step;

import org.openqa.selenium.WebElement;

import com.opus2.pages.navigation.Navigation;

public class NavigateSteps {
	Navigation nav;
	
	@Step("current page")
	public String getCurrentUrl(){
		return nav.getCurrentUrl();
	}
		
	@Step("chronology tab is visible")
	public WebElement chronTab() {
		return nav.chronTab();
	}
	
	@Step("clicks chronology tab")
	public void chronologyTab() {
		nav.chronologyTab();
	}
	
	@Step("documents tab is visible")
	public WebElement docTab() {
		return nav.docTab();
	}
	
	@Step("clicks documents tab")
	public void documentsTab() {
		nav.documentsTab();
	}
	
	@Step("transcripts tab is visible")
	public WebElement transTab() {
		return nav.transTab();
	}
	
	@Step("clicks transcripts tab")
	public void transcriptsTab() {
		nav.transcriptsTab();
	}
	
	@Step("notes tab is visible")
	public WebElement noteTab() {
		return nav.noteTab();
	}
	
	@Step("clicks notes tab")
	public void notesTab() {
		nav.notesTab();
	}
	
	@Step("search tab is visible")
	public WebElement searcTab() {
		return nav.searcTab();
	}
	
	@Step("clicks search tab")
	public void searchTab() {
		nav.searchTab();
	}
	
	@Step("search tab is visible")
	public WebElement admin_Tab() {
		return nav.admin_Tab();
	}
	
	@Step("clicks search tab")
	public void adminTab() {
		nav.adminTab();
	}
	
	@Step()
	public WebElement getCasesSection() {
		return nav.getCasesSection();
	}
	
	@Step
	public WebElement workspaceTitle() {
		return nav.workspaceTitle();
	}
	
	@Step
	public void getWorkspace() {
		nav.getWorkspace();
	}
	
	@Step
	public WebElement tabIsVisible() {
		return nav.homeIcon();
	}
	
	@Step
	public void clickTab() {
		tabIsVisible().click();
	}
}
