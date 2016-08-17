package com.opus2.dialog.sortorder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.opus2.util.Page;
import com.opus2.util.Util;
import com.opus2.util.components.Button;
import com.opus2.util.components.Dialog;
import com.opus2.util.components.RightClickMenu;

public class SortOrder extends Page {
	private static final String SORT_ORDER_OPTION = "Sort by";
	private static final String SORT_ORDER_DIALOG = "sort-order";
	private static final String SORT_ORDER_CLOSE_BUTTON = "sort-order_Close";
	private static final String X_BUTTON = "sort-order dialogClose-div";
	
	private RightClickMenu option;
	private Dialog dialog;	
	private Button button;
	
	public WebElement hasOption() {
		return option.hasOption(SORT_ORDER_OPTION);
	}

	public void sortOrderOption() {
		hasOption().click();
	}

	public String dialog() {
		return dialog.hasDialog(SORT_ORDER_DIALOG);
	}
	
	public WebElement closeButton() {
		return button.hasButton(SORT_ORDER_CLOSE_BUTTON);
	}

	public void closeDialog() {
		closeButton().click();
        confirmAlert();
	}
	
	public void closeByXButton() {
		dialog.xButton(X_BUTTON).click();
        confirmAlert();
	}

	private void confirmAlert() {
      Util.pause(1);
      Util.getDriver().findElement(By.id("OK")).click();
    }

    public WebElement xButton() {
		return dialog.xButton(X_BUTTON);
	}
	
	public String notVisible() {
		return dialog.notVisible(SORT_ORDER_DIALOG);
	}
}
