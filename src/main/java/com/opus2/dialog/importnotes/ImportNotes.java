package com.opus2.dialog.importnotes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.opus2.util.Page;
import com.opus2.util.components.Button;
import com.opus2.util.components.Dialog;
import com.opus2.util.components.RightClickMenu;

public class ImportNotes extends Page {
	private static final String IMPORT_NOTES = "Import Notes";
	private static final String DOC_CHOOSER_DIALOG = "doc-chooser";
	private static final String DOC_CHOOSER_APPLY = "doc-chooser_Apply";
	private static final String DIALOG_HEADER = "Notes importer";
	private static final String FOLDER_NAME = "foldercontents";
	private static final String X_BUTTON = "dialogClose-div";
		
	
	private RightClickMenu option;
	private Dialog dialog;	
	private Button button;
	
	public WebElement hasOption() {
		return option.hasOption(IMPORT_NOTES);
	}

	public void notesOption() {
		hasOption().click();
	}

	public String selectDialog() {
		return dialog.hasDialog(DOC_CHOOSER_DIALOG);
	}
	
	public String notesDialog() {
	    withTimeoutOf(5, TimeUnit.SECONDS).waitForPresenceOf(By.className("dialog"));
        return dialog.dialog(DIALOG_HEADER)
            .getCssValue("display");
	}
	
	public WebElement docFolder() {
		return dialog.folder(FOLDER_NAME);
	}
	
	public void selectFolder() {
		docFolder().click();
	}

	public void apply() {
		button.hasButton(DOC_CHOOSER_APPLY).click();
	}
	
	public void closeByXButton() {
		dialog.xButton(X_BUTTON).click();
	}

	public WebElement xButton() {
		return dialog.xButton(X_BUTTON);
	}
	
	public String notVisible() {
        withTimeoutOf(5, TimeUnit.SECONDS).waitForPresenceOf(By.className("dialog"));
		return dialog.dialog(DIALOG_HEADER)
		    .getCssValue("display");
	}	
}
