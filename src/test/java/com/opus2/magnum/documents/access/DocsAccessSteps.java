package com.opus2.magnum.documents.access;

import org.openqa.selenium.WebElement;

import com.opus2.util.Util;
import com.opus2.util.dialog.Dialog;

import net.thucydides.core.annotations.Step;

public class DocsAccessSteps {
	@Step
	public WebElement option() {
		return Util.optionOnMenuList("Access");
	}

	@Step
	public void accessOption() {
		option().click();
	}
	
	@Step
	public WebElement dialog(){	
		return Dialog.getDialog("access");
	}
}
