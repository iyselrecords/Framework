package com.opus2.pages.home.newworkspace;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.opus2.core.Configuration;
import com.opus2.enums.Role;
import com.opus2.util.Page;
import com.opus2.util.Util;
import com.opus2.util.components.Button;
import com.opus2.util.components.Dialog;

public class NewWorkspace extends Page {
	private static final String NEW_WORKSPACE_BUTTON = "home-buttons_NewWorkspace";
	private static final String NEW_WORKSPACE_DIALOG = "new-ws";
	private static final String NEW_WORKSPACE_DIALOG_CANCEL = "new-ws_Cancel";
	private static final String X_BUTTON = "new-ws dialogClose-div";
	private static final String CREATE_NEW_WORKSPACE_BUTTON ="new-ws_Createworkspace";
	public static final String NEW_WORKSPACE_TITLE = "TWKS";
	private static final String NEW_WORKSPACE_DESCRIPTION ="test automation framework";
	
	
	private Dialog dialog;	
	private Button button;
	
	public Role userRole() {
		return Configuration.getSelectedUser().getRole();
	}
	
	public WebElement newWorkspaceButton() {
  		return button.hasButton(NEW_WORKSPACE_BUTTON);
  	}

	public void newWorkspaceBtn() {
		newWorkspaceButton().click();
	}
  
	public String dialog() {
		return dialog.hasDialog(NEW_WORKSPACE_DIALOG);
	}
	
	public WebElement cancelButton() {
		return button.hasButton(NEW_WORKSPACE_DIALOG_CANCEL);
	}

	public void closeDialog() {
		cancelButton().click();
	}
	
	public void closeByXButton() {
		dialog.xButton(X_BUTTON).click();
	}

	public WebElement xButton() {
		return dialog.xButton(X_BUTTON);
	}
	
	public String notVisible() {
		return dialog.notVisible(NEW_WORKSPACE_DIALOG);
	}

	public WebElement titleField() {
		return dialog.hasInput(NEW_WORKSPACE_DIALOG);
	}
	
	public WebElement descField() {
		return dialog.hasTextArea(NEW_WORKSPACE_DIALOG);		
	}
	
	public WebElement createWorkspaceButton() {
		return button.hasButton(CREATE_NEW_WORKSPACE_BUTTON);
	}
	
	public void inputWKSTitle() {
		titleField().clear();
		titleField().sendKeys(NEW_WORKSPACE_TITLE);
	}

	public void inputWKSDescription() {
		descField().clear();
		descField().sendKeys(NEW_WORKSPACE_DESCRIPTION);
	}

	public void createWorkspace() {
		createWorkspaceButton().click();
	}

    public String wksCreated() {
        return Util.getDriver().findElement(By.id("settingsmain"))
            .findElements(By.tagName("h2")).get(0).getText();
    }
}
