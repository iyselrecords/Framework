package com.opus2.pages.documents.rightclickmenu;

import org.openqa.selenium.WebElement;
import com.opus2.util.Page;
import com.opus2.util.components.RightClickMenu;

public class DocumentsRightClickMenu extends Page {
	private RightClickMenu option;	
	private static final String ACCESS = "Access";
	private static final String ADD_TO = "AddTo...";
	
	
	public WebElement isVisible() {
		return option.hasOption(ACCESS);
	}
	
	public void accessOption() {
		option.selectOption(ACCESS).click();
	}

	public void addTo() {
		option.selectOption(ADD_TO);
	}

	
}
