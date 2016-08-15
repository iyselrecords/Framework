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

	@Step()
	public WebElement option() {
		return link.hasOption();
	}
	
	@Step()
	public void autolinkOption() {
		link.autolinkOption();
	}
	
	@Step()
	public WebElement dialog() {
		return link.dialog();
	}
	
	@Step()
	public void isNotVisiable() {
		link.isNotVisiable();
	}

	public void closeByXButton() {
		link.closeByXButton();
	}

	public WebElement xButton() {
		return link.xButton();
	}

	public WebElement hasButton() {
		return link.hasButton();
	}

	public void close() {
		link.close();
	}
}
