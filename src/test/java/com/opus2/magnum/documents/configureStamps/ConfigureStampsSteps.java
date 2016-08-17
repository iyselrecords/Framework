package com.opus2.magnum.documents.configureStamps;

import org.openqa.selenium.WebElement;

import com.opus2.dialog.configureStamps.ConfigureStamps;

import net.thucydides.core.annotations.Step;

public class ConfigureStampsSteps {
	ConfigureStamps configureStamps;
	
	@Step("option is visible")
	public WebElement option() {
		return configureStamps.hasOption();
	}
	
	@Step("clicks configureStamps option")
	public void configureStampsOption() {
		configureStamps.configureStampsOption();
	}
	
	@Step("dialog is visible")
	public String dialog() {
		return configureStamps.dialog();
	}
	
	@Step("close button is visible")
	public WebElement cancelButton() {
		return configureStamps.cancelButton();
	}

	@Step("close dialog")
	public void closeDialog() {
		configureStamps.closeDialog();
	}
	
	@Step("x button is visible")
	public WebElement xButton() {
		return configureStamps.xButton();
	}
	
	@Step("close dialog by x button")
	public void closeByXButton() {
		configureStamps.closeByXButton();
	}
	
	@Step("dialog not visible")
	public String notVisible() {
		return configureStamps.notVisible();
	}
	
	@Step("testing assertion with dummy data")
	public String assertDIP(){
		return "TDIP";
	}
}
