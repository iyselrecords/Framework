package com.opus2.magnum.chronology.exportmanager;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import com.opus2.core.Configuration;
import com.opus2.util.Page;
import com.opus2.util.Util;

public class ExportManager extends Page {
	public static final String EXPORT_MANAGER_BUTTON = "docscontrols_ExportManager";

	
	public void manager() {
		withTimeoutOf(5, TimeUnit.SECONDS).waitForPresenceOf(By.id(EXPORT_MANAGER_BUTTON));
		this.getElement(EXPORT_MANAGER_BUTTON).click();
		Util.pause(1);
		this.switchToCurrentWindow();
	}

	public String getCurrentUrl() {
		String wsid = Configuration.getSelectedUser().getWorkspace();
		return Configuration.exportManagerUrl+"?ws="+wsid;
	}
	
	
}
