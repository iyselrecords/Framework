package com.opus2.magnum.documents.autolink;

import org.openqa.selenium.WebElement;

import com.opus2.dialog.autolink.Autolink;

import net.thucydides.core.annotations.Step;

public class AutolinkSteps {
	Autolink link;
	
	@Step("testing assertion with dummy data")
	public String assertDIP(){
		return "TDIP";
	}

	@Step("option is visible")
	public WebElement option() {
		return link.hasOption();
	}
	
	@Step("clicks autolink option")
	public void autolinkOption() {
		link.autolinkOption();
	}
	
	@Step("dialog is visible")
	public WebElement dialog() {
		return link.dialog();
	}	
	
	@Step("x button is visible")
	public WebElement xButton() {
		return link.xButton();
	}
	
	@Step("close dialog by x button")
	public void closeByXButton() {
		link.closeByXButton();
	}
	
	@Step("dialog not visible")
	public String notVisible() {
		return link.notVisible();
	}
	
	@Step("close button is visible")
	public WebElement closeButton() {
		return link.closeButton();
	}

	@Step("close dialog")
	public void closeDialog() {
		link.closeDialog();
	}
}
