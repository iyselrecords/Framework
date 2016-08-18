package com.opus2.magnum.navigate;

import org.openqa.selenium.WebElement;

import com.opus2.pages.navigation.NavigationShortcut;
import net.thucydides.core.annotations.Step;

public class NavigateShortcutSteps {
	NavigationShortcut nav;
	
	@Step("documents image visible")
	public WebElement documentsImage() {
		return nav.documentsImage();
	}
	
	@Step("click documents shortcut")
	public void docShortcut() {
		nav.docShortcut();
	}
	
	@Step("transcripts image visible")
	public WebElement transcriptsImage() {
		return nav.transcriptsImage();
	}
	
	@Step("click transcripts shortcut")
	public void transShortcut() {
		nav.transShortcut();
	}
	
	@Step("chronology image visible")
	public WebElement chrnologyImage() {
		return nav.chrnologyImage();
	}

	@Step("click chronology shortcut")
	public void chronShortcut() {
		nav.chronShortcut();
	}
	
	@Step("notes image visible")
	public WebElement notesImage() {
		return nav.notesImage();
	}
	
	@Step("click notes shortcut")
	public void notesShortcut() {
		nav.notesShortcut();
	}
}
