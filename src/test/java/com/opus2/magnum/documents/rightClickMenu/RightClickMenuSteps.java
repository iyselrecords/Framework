package com.opus2.magnum.documents.rightClickMenu;

import org.openqa.selenium.WebElement;
import com.opus2.pages.documents.rightclickmenu.DocumentsRightClickMenu;
import net.thucydides.core.annotations.Step;

public class RightClickMenuSteps {
DocumentsRightClickMenu user;
	
	@Step("document is visible")
	public WebElement getDocument() {
		return user.getDocument();
	}
	
	@Step("show document content options")
	public void rightclickDocument() {
		user.rightclickDocument();
	}

	@Step("folder is visible")
	public WebElement getFolder() {
		return user.getFolder();
	}
	
	@Step("show folder content options")
	public void rightclickFolder() {
		user.rightclickFolder();
	}
	
	@Step("menu is visible")
	public WebElement menu() {
		return user.hasMenu();
	}
}
