package com.opus2.magnum.documents.access;

import org.openqa.selenium.WebElement;

import com.opus2.dialog.access.Access;
import com.opus2.pages.documents.rightclickmenu.DocumentsRightClickMenu;
import net.thucydides.core.annotations.Step;

public class DocsAccessSteps {
	DocumentsRightClickMenu option;
	Access access;
	
	@Step
	public WebElement option() {
		return option.isVisible();
	}

	@Step
	public void accessOption() {
		option.accessOption();
	}
	
	@Step("testing assertion with dummy data")
	public String assertDIP(){
		return "TDIP";
	}
	
	@Step("close access dialog")
	public void closeDialog() {
		access.close();
	}

	@Step("close dialog by X button")
	public void closeByXButton() {
		access.closeByXButton();
	}
}
